/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.stammdaten;

import java.util.List;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * The MeldungRepository.
 *
 * @author cosma
 */
public interface StammdatenRepository {

	/**
	 * Return the Stammdaten object of the specified params.
	 *
	 * @param stammdatenId the stammdatenId
	 * @return the quellregisterId object or <code>null</code> if not existing
	 */
	public @Nullable Stammdaten stammdatenOfId(@NonNull StammdatenId stammdatenId);

	/**
	 * Add the specified Stammdaten object.
	 *
	 * @param stammdaten the meldung
	 * @return the Meldung object added
	 */
	public @NonNull Stammdaten add(@NonNull Stammdaten stammdaten);

	/**
	 * Add all specified Stammdaten objects.
	 *
	 * @param stammdaten the stammdaten
	 * @return the Stammdaten objects added
	 */
	public @NonNull List<Stammdaten> addAll(@NonNull List<Stammdaten> stammdaten);

	/**
	 * Remove the Stammdaten object of the specified params.
	 *
	 * @param stammdatenId the stammdatenId
	 * @param stammdatenId the meldungId
	 */
	public void removeStammdatenOfId(@NonNull StammdatenId stammdatenId);

	/**
	 * Remove all Stammdaten objects of the specified params.
	 *
	 * @param stammdatenIds the stammdatenIds
	 */
	public void removeAllStammdatenOfIds(@NonNull List<StammdatenId> stammdatenIds);
}
