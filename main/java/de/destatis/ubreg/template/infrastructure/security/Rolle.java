/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.security;

/**
 * The Rolle.
 *
 * @author cosma
 */
public enum Rolle {
	SACHBEARBEITER("Sachbearbeiter"), FACHADMIN("Fachadmin");

	private final String value;

	private Rolle(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}
