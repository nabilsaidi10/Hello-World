/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain;

/**
 * The exchange channel names for inbound and outbound messaging. The names
 * symbolically denote the channels through which messages can be exchanged.
 *
 * @author cosma
 */
@SuppressWarnings("javadoc")
public final class ExchangeNames {
	private ExchangeNames() {
	}

	// Incoming
	public static final String STAMMDATEN_EINGEGANGEN = "STAMMDATEN_EINGEGANGEN";

	public static final String STAMMDATEN_GESPEICHERT = "STAMMDATEN_GESPEICHERT";

	// Outgoing
	public static final String STAMMDATEN_TICKET_GESPERRT = "STAMMDATEN_TICKET_GESPERRT";

	public static final String STAMMDATEN_TICKET_ENTSPERRT = "STAMMDATEN_TICKET_ENTSPERRT";

	public static final String ABLAUF_EREIGNIS_AUFGETRETEN = "ABLAUF_EREIGNIS_AUFGETRETEN";
}
