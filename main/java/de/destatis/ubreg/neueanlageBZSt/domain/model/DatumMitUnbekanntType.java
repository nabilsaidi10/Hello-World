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
 * Mit diesem Datentyp kann ein Datum angeben werden oder die Tatsache explizit angegeben werden, dass ein Datum unbekannt ist.
 * 
 * <p>Java-Klasse für Datum.MitUnbekanntType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Datum.MitUnbekanntType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1}datum"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1}unbekannt"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Datum.MitUnbekanntType", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", propOrder = {
    "datum",
    "unbekannt"
})
public class DatumMitUnbekanntType {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    protected Boolean unbekannt;

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
     * Explizite Angabe der Tatsache, dass ein Datum unbekannt ist. Es ist nur der Wert "true" zulässig.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnbekannt() {
        return unbekannt;
    }

    /**
     * Legt den Wert der unbekannt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnbekannt(Boolean value) {
        this.unbekannt = value;
    }

}
