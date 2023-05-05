/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.stammdaten;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.destatis.cosma.common.AssertX;
import de.destatis.cosma.common.domain.model.AbstractIdentity;
import java.io.Serializable;
import javax.persistence.Embeddable;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

/**
 * The MeldungId uniquely identifying a Meldung object.
 *
 * @author cosma
 */
@Embeddable
public class StammdatenId extends AbstractIdentity implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private String stammdatenId;

	/** Construct. */
	protected StammdatenId() {
		super();
	}

	/**
	 * Construct.
	 *
	 * @param meldungId the meldungId
	 */
	public StammdatenId(@NonNull String meldungId) {
		this();

		setStammdatenId(meldungId);
	}

	@Override
	public @NonNull String identity() {
		return stammdatenId();
	}

	/**
	 * Return the stammdatenId.
	 *
	 * @return the stammdatenId
	 */
	public String stammdatenId() {
		return stammdatenId;
	}

	private void setStammdatenId(String stammdatenId) {
		Assert.hasLength(stammdatenId, "stammdatenId must not be null or empty.");
		AssertX.inRange(stammdatenId.length(), 1, 255, "stammdatenId must be 255 chars or less.");

		this.stammdatenId = stammdatenId;
	}
}
