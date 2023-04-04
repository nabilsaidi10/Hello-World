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
 * <p>Java-Klasse für Identifikator complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Identifikator">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="statusDerNummer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="stilllegungsgrund" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifikator", propOrder = {
    "nummer",
    "statusDerNummer",
    "stilllegungsgrund"
})
public class Identifikator {

    @XmlElement(required = true)
    protected String nummer;
    protected boolean statusDerNummer;
    protected String stilllegungsgrund;

    /**
     * Ruft den Wert der nummer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNummer() {
        return nummer;
    }

    /**
     * Legt den Wert der nummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNummer(String value) {
        this.nummer = value;
    }

    /**
     * Ruft den Wert der statusDerNummer-Eigenschaft ab.
     * 
     */
    public boolean isStatusDerNummer() {
        return statusDerNummer;
    }

    /**
     * Legt den Wert der statusDerNummer-Eigenschaft fest.
     * 
     */
    public void setStatusDerNummer(boolean value) {
        this.statusDerNummer = value;
    }

    /**
     * Ruft den Wert der stilllegungsgrund-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStilllegungsgrund() {
        return stilllegungsgrund;
    }

    /**
     * Legt den Wert der stilllegungsgrund-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStilllegungsgrund(String value) {
        this.stilllegungsgrund = value;
    }

}
