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
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Dieser Typ enthält Angaben zur eindeutigen Identifikation einer Nachricht.
 * 
 * <p>Java-Klasse für Identifikation.NachrichtType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Identifikation.NachrichtType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nachrichtenUUID" type="{http://xoev.de/schemata/basisnachricht/g2g/1_0}UUID"/>
 *         <element name="nachrichtentyp" type="{http://xoev.de/schemata/code/1_0}Code"/>
 *         <element name="erstellungszeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifikation.NachrichtType", namespace = "http://xoev.de/schemata/basisnachricht/g2g/1_0", propOrder = {
    "nachrichtenUUID",
    "nachrichtentyp",
    "erstellungszeitpunkt"
})
public class IdentifikationNachrichtType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nachrichtenUUID;
    @XmlElement(required = true)
    protected Code nachrichtentyp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erstellungszeitpunkt;

    /**
     * Ruft den Wert der nachrichtenUUID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNachrichtenUUID() {
        return nachrichtenUUID;
    }

    /**
     * Legt den Wert der nachrichtenUUID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNachrichtenUUID(String value) {
        this.nachrichtenUUID = value;
    }

    /**
     * Ruft den Wert der nachrichtentyp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getNachrichtentyp() {
        return nachrichtentyp;
    }

    /**
     * Legt den Wert der nachrichtentyp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setNachrichtentyp(Code value) {
        this.nachrichtentyp = value;
    }

    /**
     * Ruft den Wert der erstellungszeitpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErstellungszeitpunkt() {
        return erstellungszeitpunkt;
    }

    /**
     * Legt den Wert der erstellungszeitpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErstellungszeitpunkt(XMLGregorianCalendar value) {
        this.erstellungszeitpunkt = value;
    }

}
