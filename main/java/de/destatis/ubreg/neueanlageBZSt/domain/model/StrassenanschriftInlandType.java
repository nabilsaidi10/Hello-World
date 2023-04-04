//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für StrassenanschriftInlandType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="StrassenanschriftInlandType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}artAnschrift" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}strasse" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}hausnummer" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}postleitzahl" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}ort"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}fruehererGemeindename" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}wohnungsinhaber" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}zusatzangaben" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}gemeindeschluessel" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrassenanschriftInlandType", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", propOrder = {
    "artAnschrift",
    "strasse",
    "hausnummer",
    "postleitzahl",
    "ort",
    "fruehererGemeindename",
    "wohnungsinhaber",
    "zusatzangaben",
    "gemeindeschluessel"
})
public class StrassenanschriftInlandType {

    protected CodeArtAnschrift artAnschrift;
    protected String strasse;
    protected String hausnummer;
    protected String postleitzahl;
    @XmlElement(required = true)
    protected String ort;
    protected String fruehererGemeindename;
    protected String wohnungsinhaber;
    protected String zusatzangaben;
    protected CodeGemeindeschluessel gemeindeschluessel;

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
     * Es ist die Bezeichnung der Straße anzugeben.
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
     * Die vollständige Hausnummer, ggf. inkl. Buchstabe/Zusatzziffern und Teilnummer.
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
     * Enthält den Namen eines Ortes (Gemeinde, Ortschaft oder Stadt).
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
     * Der frühere Gemeindename, der als Stadt- bzw. Ortsteilname dem jetzigen Gemeindenamen hinzugefügt wird. Der frühere Gemeindename (jetziger Ortsteil- oder Stadtteilname) ist bei Adressierungen unterhalb des Namens (oberhalb der Straßenbezeichnung) anzugeben.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFruehererGemeindename() {
        return fruehererGemeindename;
    }

    /**
     * Legt den Wert der fruehererGemeindename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFruehererGemeindename(String value) {
        this.fruehererGemeindename = value;
    }

    /**
     * Der Name des Wohnungsinhabers, soweit dies zur Adressierung erforderlich ist. Max Mustermann bei Müller; Max Mustermann c/o Schmidt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWohnungsinhaber() {
        return wohnungsinhaber;
    }

    /**
     * Legt den Wert der wohnungsinhaber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWohnungsinhaber(String value) {
        this.wohnungsinhaber = value;
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
     * Der vom Statistischen Bundesamt herausgegebene bundeseinheitliche Gemeindeschlüssel der Gemeinde, in welcher die Anschrift liegt.
     * 
     * @return
     *     possible object is
     *     {@link CodeGemeindeschluessel }
     *     
     */
    public CodeGemeindeschluessel getGemeindeschluessel() {
        return gemeindeschluessel;
    }

    /**
     * Legt den Wert der gemeindeschluessel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGemeindeschluessel }
     *     
     */
    public void setGemeindeschluessel(CodeGemeindeschluessel value) {
        this.gemeindeschluessel = value;
    }

}
