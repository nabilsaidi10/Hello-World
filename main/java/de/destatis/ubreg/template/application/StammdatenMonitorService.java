/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.application;

import de.destatis.cosma.common.domain.Exchange;
import de.destatis.cosma.common.domain.model.DomainEventPublisher;
import de.destatis.cosma.common.domain.model.DomainEventSubscriber;
import de.destatis.ubreg.template.domain.model.quellregister.QuellregisterId;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenGespeichertEvent;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenId;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * The MeldungService use cases to monitor incoming Meldung events.
 *
 * @author cosma
 */
@Component
public class StammdatenMonitorService {
	private static final Logger LOG = LoggerFactory.getLogger(StammdatenMonitorService.class);

	@Autowired
	private DomainEventPublisher domainEventPublisher;

	@PostConstruct
	private void construct() {
		domainEventPublisher.subscribe(new DomainEventSubscriber<StammdatenGespeichertEvent>() {
			@Override
			public void handleEvent(StammdatenGespeichertEvent domainEvent, Exchange exchange) {
				stammdatenEingegangen(domainEvent.stammdatenId(), domainEvent.quellregisterId());
			}

			@Override
			public Class<StammdatenGespeichertEvent> getHandledEventType() {
				return StammdatenGespeichertEvent.class;
			}
		});
	}

	private void stammdatenEingegangen(@NonNull StammdatenId stammdatenId, @NonNull QuellregisterId quellregisterId) {
		LOG.info("Es Sind Stammdaten eingegangen: stammdatenId: " + stammdatenId + " quellregisterId: "
				+ quellregisterId);
	}
}
