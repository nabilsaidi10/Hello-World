/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.persistence;

import de.destatis.cosma.common.infrastructure.persistence.JpaAbstractEntity;
import de.destatis.ubreg.template.domain.model.quellregister.QuellregisterId;
import de.destatis.ubreg.template.domain.model.stammdaten.Stammdaten;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenId;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

/**
 * The JpaStammdaten entity.
 *
 * @author cosma
 */
@Entity(name = "Stammdaten")
public class JpaStammdaten extends JpaAbstractEntity implements Stammdaten {
	private static final long serialVersionUID = 1L;

	public void setQuellregisterId(@NonNull QuellregisterId quellregisterId) {
		Assert.notNull(quellregisterId, "quellregisterId must not be null.");
		this.quellregisterId = quellregisterId;
	}

	public void setStammdatenId(@NonNull StammdatenId stammdatenId) {
		Assert.notNull(stammdatenId, "stammdatenId must not be null.");
		this.stammdatenId = stammdatenId;
	}

	@Embedded
	@Column(nullable = false)
	QuellregisterId quellregisterId;

	@Embedded
	@Column(nullable = false)
	private StammdatenId stammdatenId;

	/** Construct. */
	protected JpaStammdaten() {
		super();
	}

	/**
	 * Construct.
	 *
	 * @param stammdatenId    the stammdatenId
	 * @param quellregisterId the quellregisterId
	 */
	protected JpaStammdaten(@NonNull StammdatenId stammdatenId, @NonNull QuellregisterId quellregisterId) {
		this();
		setStammdatenId(stammdatenId);
		setQuellregisterId(quellregisterId);
	}

	@Override
	public StammdatenId stammdatenId() {
		return this.stammdatenId;
	}

	@Override
	public QuellregisterId quellregisterId() {
		return this.quellregisterId;
	}
}
