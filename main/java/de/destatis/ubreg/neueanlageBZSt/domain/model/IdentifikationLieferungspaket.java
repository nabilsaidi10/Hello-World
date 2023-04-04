//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Dieser Typ enthält Angaben zur eindeutigen Identifikation eines Lieferungspakets.
 * 
 * <p>Java-Klasse für Identifikation.Lieferungspaket complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Identifikation.Lieferungspaket">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="nrLieferung" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         <element name="lieferungspaketUUID" type="{http://xoev.de/schemata/basisnachricht/g2g/1_0}UUID"/>
 *         <element name="erstellungszeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="gesamtzahlLieferungspakete" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="NrLieferungspaket" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="letztesLieferungspaket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifikation.Lieferungspaket", propOrder = {
    "nrLieferung",
    "lieferungspaketUUID",
    "erstellungszeitpunkt",
    "gesamtzahlLieferungspakete",
    "nrLieferungspaket",
    "letztesLieferungspaket"
})
public class IdentifikationLieferungspaket {

    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nrLieferung;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String lieferungspaketUUID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erstellungszeitpunkt;
    @XmlElement(required = true)
    protected String gesamtzahlLieferungspakete;
    @XmlElement(name = "NrLieferungspaket", required = true)
    protected String nrLieferungspaket;
    protected Boolean letztesLieferungspaket;

    /**
     * Ruft den Wert der nrLieferung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrLieferung() {
        return nrLieferung;
    }

    /**
     * Legt den Wert der nrLieferung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrLieferung(BigInteger value) {
        this.nrLieferung = value;
    }

    /**
     * Ruft den Wert der lieferungspaketUUID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLieferungspaketUUID() {
        return lieferungspaketUUID;
    }

    /**
     * Legt den Wert der lieferungspaketUUID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLieferungspaketUUID(String value) {
        this.lieferungspaketUUID = value;
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

    /**
     * Ruft den Wert der gesamtzahlLieferungspakete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGesamtzahlLieferungspakete() {
        return gesamtzahlLieferungspakete;
    }

    /**
     * Legt den Wert der gesamtzahlLieferungspakete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesamtzahlLieferungspakete(String value) {
        this.gesamtzahlLieferungspakete = value;
    }

    /**
     * Ruft den Wert der nrLieferungspaket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrLieferungspaket() {
        return nrLieferungspaket;
    }

    /**
     * Legt den Wert der nrLieferungspaket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrLieferungspaket(String value) {
        this.nrLieferungspaket = value;
    }

    /**
     * Ruft den Wert der letztesLieferungspaket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLetztesLieferungspaket() {
        return letztesLieferungspaket;
    }

    /**
     * Legt den Wert der letztesLieferungspaket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLetztesLieferungspaket(Boolean value) {
        this.letztesLieferungspaket = value;
    }

}
