/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.application;

import de.destatis.ubreg.template.domain.model.quellregister.QuellregisterId;
import de.destatis.ubreg.template.domain.model.stammdaten.Stammdaten;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenFactory;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenId;
import de.destatis.ubreg.template.domain.service.StammdatenPflege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * The MeldungService use cases to handle incoming Meldung objects.
 *
 * @author cosma
 */
@Component
public class StammdatenService {
	@Autowired
	private StammdatenFactory stammdatenFactory;

	@Autowired
	private StammdatenPflege stammdatenPflege;

	/**
	 * Process meldungEingegangen.
	 *
	 * @param stammdatenId the meldungId
	 * @param stammdatenId the meldungId
	 */
	@Transactional
	public void stammdatenEingegangen(@NonNull StammdatenId stammdatenId, QuellregisterId quellregisterId) {
		stammdatenPflege.speichereStammdaten(stammdatenFactory.createStammdaten(stammdatenId, quellregisterId));
	}

	@Transactional
	public Stammdaten getStammdatenOfId(@NonNull StammdatenId stammdatenId) {
		return stammdatenPflege.getStammdatenOfId(stammdatenId);
	}
}
