/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.presentation.translation;

import de.destatis.ubreg.template.domain.model.quellregister.QuellregisterId;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenId;
import org.springframework.util.Assert;

/**
 * The AbstractMeldedatenDto.
 *
 * @author cosma
 */
public abstract class AbstractStammdatenDto {
	private long id;
	private StammdatenId stammdatenId;
	private QuellregisterId quellregisterId;

	/** Construct. */
	protected AbstractStammdatenDto() {
	}

	/**
	 * Construct.
	 *
	 * @param id              the id
	 * @param stammdatenId    the stammdatenId
	 * @param quellregisterId the quellregisterId
	 */
	protected AbstractStammdatenDto(long id, StammdatenId stammdatenId, QuellregisterId quellregisterId) {
		this();
		Assert.notNull(id, "id must not be null.");
		Assert.notNull(stammdatenId, "stammdatenId must not be null.");
		Assert.notNull(quellregisterId, "land must not be null.");

		setId(id);
		setStammdatenId(stammdatenId);
		setQuellregisterId(quellregisterId);
	}

	public long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}

	public StammdatenId getStammdatenId() {
		return stammdatenId;
	}

	public void setStammdatenId(StammdatenId stammdatenId) {
		this.stammdatenId = stammdatenId;
	}

	public QuellregisterId getQuellregisterId() {
		return quellregisterId;
	}

	public void setQuellregisterId(QuellregisterId quellregisterId) {
		this.quellregisterId = quellregisterId;
	}
}
