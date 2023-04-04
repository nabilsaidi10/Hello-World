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
 * <p>Java-Klasse f�r GrossempfaengerAnschriftInlandType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="GrossempfaengerAnschriftInlandType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}artAnschrift" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}postleitzahl"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}ort"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossempfaengerAnschriftInlandType", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", propOrder = {
    "artAnschrift",
    "postleitzahl",
    "ort"
})
public class GrossempfaengerAnschriftInlandType {

    protected CodeArtAnschrift artAnschrift;
    @XmlElement(required = true)
    protected String postleitzahl;
    @XmlElement(required = true)
    protected String ort;

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

}
