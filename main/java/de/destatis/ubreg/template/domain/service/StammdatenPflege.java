/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.service;

import de.destatis.cosma.common.domain.Exchanges;
import de.destatis.cosma.common.domain.model.DomainEventPublisher;
import de.destatis.ubreg.template.domain.ExchangeNames;
import de.destatis.ubreg.template.domain.model.stammdaten.Stammdaten;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenGespeichertEvent;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenId;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * The StammdatenPflege domain service.
 *
 * @author cosma
 */
@Component
public class StammdatenPflege {
	@Autowired
	private StammdatenRepository stammdatenRepository;

	@Autowired
	private DomainEventPublisher domainEventPublisher;

	/**
	 * Process speichereStammdaten.
	 *
	 * @param stammdaten the stammdaten
	 */
	public void speichereStammdaten(@NonNull Stammdaten stammdaten) {
		Assert.notNull(stammdaten, "meldung must not be null.");

		Stammdaten oldMeldung = stammdatenRepository.stammdatenOfId(stammdaten.stammdatenId());
		if (oldMeldung != null) {
			stammdaten.adoptOf(oldMeldung);
		}
		stammdatenRepository.add(stammdaten);

		domainEventPublisher.publish(
				new StammdatenGespeichertEvent(stammdaten.stammdatenId(), stammdaten.quellregisterId()),
				Exchanges.outboundExchangeOf(ExchangeNames.STAMMDATEN_GESPEICHERT));
	}

	public Stammdaten getStammdatenOfId(@NonNull StammdatenId stammdatenId) {
		return stammdatenRepository.stammdatenOfId(stammdatenId);
	}
}
