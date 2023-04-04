//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}artEintragung" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}registergericht.code" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}registergericht.bezeichnung" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}stiftungsverzeichnis" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}ort" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}staat" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}eintragungsnummer" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artEintragung",
    "registergerichtCode",
    "registergerichtBezeichnung",
    "stiftungsverzeichnis",
    "ort",
    "staat",
    "eintragungsnummer"
})
@XmlRootElement(name = "eintragung", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
public class Eintragung {

    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
    protected CodeArtDerEintragung artEintragung;
    @XmlElement(name = "registergericht.code", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
    protected CodeRegistergericht registergerichtCode;
    @XmlElement(name = "registergericht.bezeichnung", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
    protected String registergerichtBezeichnung;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
    protected String stiftungsverzeichnis;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1")
    protected String ort;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1")
    protected StaatType staat;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
    protected String eintragungsnummer;

    /**
     * Angabe der Art des Registers, in welchem der wirtschaftlich Tätige bzw. die wirtschaftliche Tätigkeit (z. B. Zweigniederlassung) geführt wird.
     * 
     * @return
     *     possible object is
     *     {@link CodeArtDerEintragung }
     *     
     */
    public CodeArtDerEintragung getArtEintragung() {
        return artEintragung;
    }

    /**
     * Legt den Wert der artEintragung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeArtDerEintragung }
     *     
     */
    public void setArtEintragung(CodeArtDerEintragung value) {
        this.artEintragung = value;
    }

    /**
     * Schlüssel des Registergerichts, in dessen Handels-, Genossenschafts-, Partnerschafts- oder Vereinsregister, in welchem der wirtschaftlich Tätige bzw. die wirtschaftliche Tätigkeit (z. B. Zweigniederlassung) geführt wird.
     * 
     * @return
     *     possible object is
     *     {@link CodeRegistergericht }
     *     
     */
    public CodeRegistergericht getRegistergerichtCode() {
        return registergerichtCode;
    }

    /**
     * Legt den Wert der registergerichtCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeRegistergericht }
     *     
     */
    public void setRegistergerichtCode(CodeRegistergericht value) {
        this.registergerichtCode = value;
    }

    /**
     * Bezeichnung des Registergerichts, in dessen Register der wirtschaftlich Tätige bzw. die wirtschaftliche Tätigkeit (z. B. Zweigniederlassung) geführt wird. Wann immer möglich, sollte das Attribut Registergericht.Code verwendet werden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistergerichtBezeichnung() {
        return registergerichtBezeichnung;
    }

    /**
     * Legt den Wert der registergerichtBezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistergerichtBezeichnung(String value) {
        this.registergerichtBezeichnung = value;
    }

    /**
     * Bei Einträgen im Stiftungsverzeichnis: Angabe des Bundeslandes bzw. der Behörde, in dessen oder deren Stiftungsverzeichnis der Eintrag geführt wird.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStiftungsverzeichnis() {
        return stiftungsverzeichnis;
    }

    /**
     * Legt den Wert der stiftungsverzeichnis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStiftungsverzeichnis(String value) {
        this.stiftungsverzeichnis = value;
    }

    /**
     * Bei Einträgen im Ausland: Angabe des Ortes der registerführenden Stelle.
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
     * Bei Einträgen im Ausland: Angabe des Staates der registerführenden Stelle.
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

    /**
     * Nummer der Eintragung im jeweiligen Register
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEintragungsnummer() {
        return eintragungsnummer;
    }

    /**
     * Legt den Wert der eintragungsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEintragungsnummer(String value) {
        this.eintragungsnummer = value;
    }

}
