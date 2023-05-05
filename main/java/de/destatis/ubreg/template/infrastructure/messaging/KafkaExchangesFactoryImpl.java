/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.infrastructure.messaging;

import static de.destatis.ubreg.template.domain.ExchangeNames.*;

import de.destatis.cosma.common.domain.ExchangesFactory;
import de.destatis.cosma.common.infrastructure.messaging.KafkaExchangesFactory;
import de.destatis.cosma.common.infrastructure.messaging.KafkaInboundExchange;
import de.destatis.cosma.common.infrastructure.messaging.KafkaInboundParams;
import de.destatis.cosma.common.infrastructure.messaging.KafkaOutboundExchange;
import de.destatis.cosma.common.infrastructure.messaging.KafkaOutboundParams;
import javax.annotation.PostConstruct;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * The Kafka based factory of exchange channels for inbound and outbound
 * messaging.
 *
 * @author cosma
 */
@Component
public class KafkaExchangesFactoryImpl implements ExchangesFactory, KafkaExchangesFactory {
	private KafkaInboundExchange[] kafkaInboundExchanges;
	private KafkaOutboundExchange[] kafkaOutboundExchanges;

	private static final String STAMMDATENSEINGANG_IN_TOPIC = "ME_STAMMDATENSEINGANG";
	private static final String ME_STAMMDATEN_GROUP = "MB_ME_STAMMDATEN_GROUP";

	private static final String[] PL_STAMMDATEN_IN_TOPIC = { "PL_STAMMDATEN" };
	private static final String PL_STAMMDATEN_GROUP = "MB_PL_STAMMDATEN_GROUP";

	private static final String STAMMDATEN_TICKET_OUT_TOPIC = "MB_STAMMDATEN_TICKET";

	private static final String ABLAUF_EREIGNIS_OUT_TOPIC = "ABLAUF_EREIGNIS";

	@PostConstruct
	private void construct() {
		kafkaInboundExchanges = new KafkaInboundExchange[] {
				createKafkaInboundExchange(STAMMDATEN_EINGEGANGEN,
						new KafkaInboundParams(ME_STAMMDATEN_GROUP, STAMMDATENSEINGANG_IN_TOPIC)),
				createKafkaInboundExchange(STAMMDATEN_GESPEICHERT,
						new KafkaInboundParams(PL_STAMMDATEN_GROUP, PL_STAMMDATEN_IN_TOPIC)) };

		kafkaOutboundExchanges = new KafkaOutboundExchange[] {
				createKafkaOutboundExchange(STAMMDATEN_TICKET_GESPERRT,
						new KafkaOutboundParams(STAMMDATEN_TICKET_OUT_TOPIC)),
				createKafkaOutboundExchange(STAMMDATEN_TICKET_ENTSPERRT,
						new KafkaOutboundParams(STAMMDATEN_TICKET_OUT_TOPIC)),
				createKafkaOutboundExchange(ABLAUF_EREIGNIS_AUFGETRETEN,
						new KafkaOutboundParams(ABLAUF_EREIGNIS_OUT_TOPIC)) };
	}

	@Override
	public @Nullable KafkaInboundExchange[] kafkaInboundExchanges() {
		return kafkaInboundExchanges;
	}

	@Override
	public @Nullable KafkaOutboundExchange[] kafkaOutboundExchanges() {
		return kafkaOutboundExchanges;
	}
}
