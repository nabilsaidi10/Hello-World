//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BeWiNrUndStatus complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="BeWiNrUndStatus">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}bundeseinheitlicheWirtschaftsnummer"/>
 *         <element name="zustelldatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeWiNrUndStatus", propOrder = {
    "bundeseinheitlicheWirtschaftsnummer",
    "zustelldatum"
})
public class BeWiNrUndStatus {

    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", required = true)
    protected String bundeseinheitlicheWirtschaftsnummer;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zustelldatum;

    /**
     * Die bundeseinheitliche Wirtschaftsnummer für Unternehmen gemäß § 2 UBRegG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundeseinheitlicheWirtschaftsnummer() {
        return bundeseinheitlicheWirtschaftsnummer;
    }

    /**
     * Legt den Wert der bundeseinheitlicheWirtschaftsnummer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundeseinheitlicheWirtschaftsnummer(String value) {
        this.bundeseinheitlicheWirtschaftsnummer = value;
    }

    /**
     * Ruft den Wert der zustelldatum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZustelldatum() {
        return zustelldatum;
    }

    /**
     * Legt den Wert der zustelldatum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZustelldatum(XMLGregorianCalendar value) {
        this.zustelldatum = value;
    }

}
