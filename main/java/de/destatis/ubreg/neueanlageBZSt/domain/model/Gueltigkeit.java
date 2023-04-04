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
 * Gültigkeitszeitraum der Unternehmensbasisdaten.
 * 
 * <p>Java-Klasse für Gueltigkeit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Gueltigkeit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ab" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         <element name="bis" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gueltigkeit", propOrder = {
    "ab",
    "bis"
})
public class Gueltigkeit {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ab;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bis;

    /**
     * Ruft den Wert der ab-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAb() {
        return ab;
    }

    /**
     * Legt den Wert der ab-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAb(XMLGregorianCalendar value) {
        this.ab = value;
    }

    /**
     * Ruft den Wert der bis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBis() {
        return bis;
    }

    /**
     * Legt den Wert der bis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBis(XMLGregorianCalendar value) {
        this.bis = value;
    }

}
