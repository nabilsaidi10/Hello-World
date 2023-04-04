//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AnschriftAuslandType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="AnschriftAuslandType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}artAnschrift" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}strasse" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}hausnummer" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}zusatzangaben" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}postleitzahl" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}ort" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}staat"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnschriftAuslandType", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", propOrder = {
    "artAnschrift",
    "strasse",
    "hausnummer",
    "zusatzangaben",
    "postleitzahl",
    "ort",
    "staat"
})
public class AnschriftAuslandType {

    protected CodeArtAnschrift artAnschrift;
    protected String strasse;
    protected String hausnummer;
    protected String zusatzangaben;
    protected String postleitzahl;
    protected String ort;
    @XmlElement(required = true)
    protected StaatType staat;

    /**
     * Die Art (Funktion, Rolle) dieser Anschrift.
     * 
     * @return
     *     possible object is
     *     {@link CodeArtAnschrift }
     *     
     */
    public CodeArtAnschrift getArtAnschrift() {
        return artAnschrift;
    }

    /**
     * Legt den Wert der artAnschrift-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeArtAnschrift }
     *     
     */
    public void setArtAnschrift(CodeArtAnschrift value) {
        this.artAnschrift = value;
    }

    /**
     * Es ist die Bezeichnung der Stra�e anzugeben.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * Legt den Wert der strasse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrasse(String value) {
        this.strasse = value;
    }

    /**
     * Die vollst�ndige Hausnummer, ggf. inkl. Buchstabe/Zusatzziffern und Teilnummer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * Legt den Wert der hausnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHausnummer(String value) {
        this.hausnummer = value;
    }

    /**
     * Es sind Zusatzangaben zur Anschrift anzugeben. Beispiele: Hinterhaus, Gartenhaus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZusatzangaben() {
        return zusatzangaben;
    }

    /**
     * Legt den Wert der zusatzangaben-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZusatzangaben(String value) {
        this.zusatzangaben = value;
    }

    /**
     * Angabe der Postleitzahl
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostleitzahl() {
        return postleitzahl;
    }

    /**
     * Legt den Wert der postleitzahl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostleitzahl(String value) {
        this.postleitzahl = value;
    }

    /**
     * Enth�lt den Namen eines Ortes (Gemeinde, Ortschaft oder Stadt).
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Legt den Wert der ort-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrt(String value) {
        this.ort = value;
    }

    /**
     * Angabe des Staats
     * 
     * @return
     *     possible object is
     *     {@link StaatType }
     *     
     */
    public StaatType getStaat() {
        return staat;
    }

    /**
     * Legt den Wert der staat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StaatType }
     *     
     */
    public void setStaat(StaatType value) {
        this.staat = value;
    }

	@Override
	public String toString() {
		return "AnschriftAuslandType [artAnschrift=" + artAnschrift + ", strasse=" + strasse + ", hausnummer="
				+ hausnummer + ", zusatzangaben=" + zusatzangaben + ", postleitzahl=" + postleitzahl + ", ort=" + ort
				+ ", staat=" + staat + "]";
	}

    
}
