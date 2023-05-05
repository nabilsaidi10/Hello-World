/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.security;

import de.destatis.cosma.security.keycloak.service.CosmaSecurityContext;
import de.destatis.ubreg.template.domain.model.benutzer.Benutzer;
import de.destatis.ubreg.template.domain.model.benutzer.CurrentBenutzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CurrentBenutzer implementation based on BenutzerContextHolder and
 * SecurityContextHolder.
 *
 * @author cosma
 */
@Component
public class CurrentBenutzerImpl implements CurrentBenutzer {
	@Autowired
	BenutzerContextHolder benutzerContextHolder;

	@Autowired
	CosmaSecurityContext securityContext;

	@Override
	public Benutzer get() {
		if (benutzerContextHolder.getBenutzer() != null)
			return benutzerContextHolder.getBenutzer();

		String username = securityContext.getUsername();
		if (username != null)
			return new Benutzer(username);
		return new Benutzer(Benutzer.EMPTY);
	}
}
