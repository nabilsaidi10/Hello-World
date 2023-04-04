//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Mit diesem Datentyp kann ein Datum, dass auch nur teilweise bekannt sein kann, angeben werden.
 * 
 * <p>Java-Klasse für Datum.MitTeilbekanntType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Datum.MitTeilbekanntType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1}datum"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1}jahrMonat"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1}jahr"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datum.MitTeilbekanntType", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", propOrder = {
    "datum",
    "jahrMonat",
    "jahr"
})
public class DatumMitTeilbekanntType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar jahrMonat;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar jahr;

    /**
     * Angabe eines vollständigen Datums.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Legt den Wert der datum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Angabe des Jahres und des Monats
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJahrMonat() {
        return jahrMonat;
    }

    /**
     * Legt den Wert der jahrMonat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJahrMonat(XMLGregorianCalendar value) {
        this.jahrMonat = value;
    }

    /**
     * Angabe des Jahres
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJahr() {
        return jahr;
    }

    /**
     * Legt den Wert der jahr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJahr(XMLGregorianCalendar value) {
        this.jahr = value;
    }

}
