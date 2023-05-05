/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.benutzer;

import org.springframework.lang.NonNull;

/**
 * The CurrentBenutzer interface
 *
 * @author cosma
 */
public interface CurrentBenutzer {
	/**
	 * Return the Benutzer.
	 *
	 * @return the Benutzer
	 */
	@NonNull
	Benutzer get();
}
