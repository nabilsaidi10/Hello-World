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
 * Element mit den Registergerichteintragung für ein Unternehmen
 * 
 * <p>Java-Klasse für Registergerichtseintragung complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Registergerichtseintragung">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="artDerEintragung" type="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}Code.ArtDerEintragung"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}eintragungsnummer"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}registergericht.bezeichnung" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}registergericht.code" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}ort" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}staat" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registergerichtseintragung", propOrder = {
    "artDerEintragung",
    "eintragungsnummer",
    "registergerichtBezeichnung",
    "registergerichtCode",
    "ort",
    "staat"
})
public class Registergerichtseintragung {

    @XmlElement(required = true)
    protected CodeArtDerEintragung artDerEintragung;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", required = true)
    protected String eintragungsnummer;
    @XmlElement(name = "registergericht.bezeichnung", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
    protected String registergerichtBezeichnung;
    @XmlElement(name = "registergericht.code", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
    protected CodeRegistergericht registergerichtCode;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1")
    protected String ort;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1")
    protected StaatType staat;

    /**
     * Ruft den Wert der artDerEintragung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeArtDerEintragung }
     *     
     */
    public CodeArtDerEintragung getArtDerEintragung() {
        return artDerEintragung;
    }

    /**
     * Legt den Wert der artDerEintragung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeArtDerEintragung }
     *     
     */
    public void setArtDerEintragung(CodeArtDerEintragung value) {
        this.artDerEintragung = value;
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

}
