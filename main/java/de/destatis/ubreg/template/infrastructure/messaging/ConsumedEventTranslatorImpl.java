/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.messaging;

import de.destatis.cosma.common.domain.InboundExchange;
import de.destatis.cosma.common.domain.model.DomainEvent;
import de.destatis.cosma.common.domain.model.DomainEventReader;
import de.destatis.cosma.common.infrastructure.messaging.ConsumedEventTranslator;
import de.destatis.ubreg.template.domain.ExchangeNames;
import de.destatis.ubreg.template.domain.model.stammdaten.StammdatenGespeichertEvent;
import java.time.LocalDateTime;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * The translator for translating consumed events of the outside world into
 * concrete domain event instances as part of the anti corruption layer (acl).
 *
 * @author cosma
 */
@Component
public class ConsumedEventTranslatorImpl implements ConsumedEventTranslator {

	@Override
	public @Nullable DomainEvent translate(@NonNull InboundExchange inboundExchange, @NonNull String eventTypeName,
			long eventVersion, @NonNull String eventUuid, @NonNull LocalDateTime eventOccurredOn,
			@NonNull String eventBody) {
		Assert.hasLength(eventBody, "eventBody must not be null or empty.");

		DomainEvent domainEvent = null;

		String exchangeName = inboundExchange.name();
		if (exchangeName.equals(ExchangeNames.STAMMDATEN_GESPEICHERT)) {
			domainEvent = DomainEventReader.toEvent(StammdatenGespeichertEvent.class, eventBody);
		} else if (exchangeName.equals(ExchangeNames.STAMMDATEN_EINGEGANGEN)) {
			domainEvent = DomainEventReader.toEvent(StammdatenGespeichertEvent.class, eventBody);
		}
		return domainEvent;
	}
}
