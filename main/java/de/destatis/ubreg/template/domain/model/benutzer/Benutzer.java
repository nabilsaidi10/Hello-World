/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.benutzer;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.destatis.cosma.common.domain.model.ValueObject;
import java.util.Objects;
import javax.persistence.Embeddable;
import org.springframework.lang.NonNull;

/**
 * The Benutzer.
 *
 * @author cosma
 */
@Embeddable
public class Benutzer implements ValueObject {
	public static final String SYSTEM = "$$system$$";
	public static final String EMPTY = "";

	@JsonProperty
	private String benutzer;

	private Benutzer() {
		super();
	}

	/**
	 * Construct.
	 *
	 * @param benutzer the benutzer
	 */
	public Benutzer(String benutzer) {
		this();

		setBenutzer(benutzer);
	}

	/**
	 * Return the benutzer
	 *
	 * @return the benutzer
	 */
	public @NonNull String benutzer() {
		return benutzer;
	}

	/**
	 * Set the benutzer
	 *
	 * @param benutzer the benutzer
	 */
	private void setBenutzer(String benutzer) {
		this.benutzer = benutzer;
	}

	@Override
	public boolean equals(Object other) {
		boolean equalObjs = false;

		if (other != null && this.getClass() == other.getClass()) {
			Benutzer otherObj = (Benutzer) other;
			equalObjs = benutzer().equals(otherObj.benutzer());
		}

		return equalObjs;
	}

	@Override
	public int hashCode() {
		return Objects.hash(benutzer());
	}

	@Override
	public String toString() {
		return benutzer();
	}
}
