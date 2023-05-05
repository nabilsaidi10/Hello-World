/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.persistence;

import de.destatis.cosma.common.Assert;
import de.destatis.ubreg.template.domain.model.stammdaten.Stammdaten;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenId;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenRepository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

/**
 * The JpaMeldungRepository.
 *
 * @author cosma
 */
@Repository
public interface JpaStammdatenRepository extends StammdatenRepository, JpaRepository<JpaStammdaten, Long> {

	/**
	 * Return the Stammdaten object of the specified params.
	 *
	 * @param stammdatenId the stammdatenId
	 * @return the quellregisterId object or <code>null</code> if not existing
	 */
	@Query(nativeQuery = false, value = "SELECT e FROM Stammdaten e WHERE e.stammdatenId = :stammdatenId")
	public @Nullable JpaStammdaten stammdatenOfId(@NonNull StammdatenId stammdatenId);

	/**
	 * Add the specified Stammdaten object.
	 *
	 * @param stammdaten the meldung
	 * @return the Meldung object added
	 */
	@Override
	public default @NonNull JpaStammdaten add(@NonNull Stammdaten stammdaten) {
		Assert.notNull(stammdaten, "stammdaten must not be null.");

		Stammdaten old = stammdatenOfId(stammdaten.stammdatenId());
		if (old != null) {
			throw new IllegalStateException(
					String.format("Stammdaten of id=%s cannot be added due to: Stammdaten already exists and cannot be"
							+ " added twice.", stammdaten.stammdatenId()));
		}
		return save((JpaStammdaten) stammdaten);
	}

	/**
	 * Add all specified Stammdaten objects.
	 *
	 * @param stammdaten the stammdaten
	 * @return the Stammdaten objects added
	 */
	@Override
	public @NonNull default List<Stammdaten> addAll(@NonNull List<Stammdaten> stammdaten) {
		List<JpaStammdaten> jpaStammdaten = stammdaten.stream().map(JpaStammdaten.class::cast).toList();
		return saveAll(jpaStammdaten).stream().map(Stammdaten.class::cast).toList();
	}

	/**
	 * Remove the Stammdaten object of the specified params.
	 *
	 * @param stammdatenId the stammdatenId
	 */
	@Override
	@Modifying
	@Query(nativeQuery = false, value = "DELETE FROM Stammdaten e WHERE e.stammdatenId = :stammdatenId")
	public void removeStammdatenOfId(@NonNull @Param("stammdatenId") StammdatenId stammdatenId);

	/**
	 * Remove all Stammdaten objects of the specified params.
	 *
	 * @param stammdatenIds the stammdatenIds
	 */
	@Override
	public default void removeAllStammdatenOfIds(@NonNull List<StammdatenId> meldedatenTicketIdList) {
		Assert.notEmpty(meldedatenTicketIdList, "meldedatenTicketIdList must not be null or empty.");
		meldedatenTicketIdList.forEach(this::removeStammdatenOfId);
	}
}
