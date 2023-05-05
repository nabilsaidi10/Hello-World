/*
 * Copyright 2022 Statistisches Bundesamt
 */
package de.destatis.ubreg.template.domain.model.land;

import java.util.Arrays;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

/**
 * The Land enumerates the constants addressing the Bundesländer and the Bund,
 * each constant defining attributes like schluessel and text.
 *
 * @author cosma
 */
@SuppressWarnings("javadoc")
public enum Land {
	BUND00("00", "BD00", "Bund00"), SCHLESWIG_HOLSTEIN("01", "SH", "Schleswig-Holstein"),
	HAMBURG("02", "HH", "Hamburg"), NIEDERSACHSEN("03", "NI", "Niedersachsen"), BREMEN("04", "BR", "Bremen"),
	NORDRHEIN_WESTFALEN("05", "NW", "Nordrhein-Westfalen"), HESSEN("06", "HE", "Hessen"),
	RHEINLAND_PFALZ("07", "RP", "Rheinland-Pfalz"), BADEN_WUERTTEMBERG("08", "BW", "Baden-Württemberg"),
	BAYERN("09", "BA", "Bayern"), SAARLAND("10", "SL", "Saarland"), BERLIN("11", "BE", "Berlin"),
	BRANDENBURG("12", "BB", "Brandenburg"), MECKLENBURG_VORPOMMERN("13", "MV", "Mecklenburg-Vorpommern"),
	SACHSEN("14", "SN", "Sachsen"), SACHSEN_ANHALT("15", "ST", "Sachsen-Anhalt"), THUERINGEN("16", "TH", "Thüringen"),
	BUND99("99", "BD99", "Bund99");

	private String schluessel;
	private String kuerzel;
	private String text;

	private Land(String schluessel, String kuerzel, String text) {
		this.schluessel = schluessel;
		this.kuerzel = kuerzel;
		this.text = text;
	}

	/**
	 * Return the schluessel.
	 *
	 * @return the schluessel
	 */
	public String schluessel() {
		return schluessel;
	}

	/**
	 * Return the kuerzel.
	 *
	 * @return the kuerzel
	 */
	public String kuerzel() {
		return kuerzel;
	}

	/**
	 * Return the text.
	 *
	 * @return the text.
	 */
	public String text() {
		return text;
	}

	/**
	 * Return all laender (i.e. all Bundesländer).
	 *
	 * @return all laender
	 */
	public static Land[] allLaender() {
		return Arrays.copyOfRange(Land.values(), 0, 16);
	}

	/**
	 * Return the Land of the specified schluessel.
	 *
	 * @param schluessel the schluessel.
	 * @return the Land or <code>null</code> if schluessel invalid
	 */
	public static @NonNull Land ofSchluessel(@NonNull String schluessel) {
		Assert.hasLength(schluessel, "schluessel must not be null or empty.");

		for (Land land : Land.values()) {
			if (schluessel.equals(land.schluessel())) {
				return land;
			}
		}
		throw new IllegalArgumentException("(Land-) Schluessel " + schluessel + " not valid.");
	}

	/**
	 * Return the Land of the specified kuerzel.
	 *
	 * @param kuerzel the kuerzel.
	 * @return the Land or <code>null</code> if kuerzel invalid
	 */
	public static @Nullable Land ofKuerzel(@NonNull String kuerzel) {
		Assert.hasLength(kuerzel, "kuerzel must not be null or empty.");

		Land land = null;
		for (Land la : Land.values()) {
			if (kuerzel.equals(la.kuerzel())) {
				land = la;
				break;
			}
		}
		return land;
	}
}
