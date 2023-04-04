//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für Unternehmenseinheit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Unternehmenseinheit">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="erstellungszeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="unternehmenseinheitUUID" type="{http://xoev.de/schemata/basisnachricht/g2g/1_0}UUID"/>
 *         <element name="geschaeftsfallkenner" type="{urn:BZStBasisregisterSST_0.2.6}Code.Geschaeftfallkenner"/>
 *         <element name="nrUnternehmen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="gesamtzahlUnternehmen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *         <element name="updatezeitpunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         <element name="natuerlichePerson" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="beWiNr" type="{urn:BZStBasisregisterSST_0.2.6}BeWiNrUndStatus" minOccurs="0"/>
 *         <element name="verwaltungsname" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" maxOccurs="unbounded"/>
 *         <element name="registergerichtseintragung" type="{urn:BZStBasisregisterSST_0.2.6}Registergerichtseintragung" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="w-IdNr.Identifikator" type="{urn:BZStBasisregisterSST_0.2.6}W-IdNr"/>
 *         <element name="anschrift" type="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}AnschriftType" maxOccurs="unbounded"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}wirtschaftszweigschluessel" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1}rechtsformcode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Unternehmenseinheit", propOrder = {
    "erstellungszeitpunkt",
    "unternehmenseinheitUUID",
    "geschaeftsfallkenner",
    "nrUnternehmen",
    "gesamtzahlUnternehmen",
    "updatezeitpunkt",
    "natuerlichePerson",
    "beWiNr",
    "verwaltungsname",
    "registergerichtseintragung",
    "wIdNrIdentifikator",
    "anschrift",
    "wirtschaftszweigschluessel",
    "rechtsformcode"
})
public class Unternehmenseinheit {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erstellungszeitpunkt;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String unternehmenseinheitUUID;
    @XmlElement(required = true)
    protected CodeGeschaeftfallkenner geschaeftsfallkenner;
    @XmlElement(required = true)
    protected String nrUnternehmen;
    @XmlElement(required = true)
    protected String gesamtzahlUnternehmen;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatezeitpunkt;
    protected boolean natuerlichePerson;
    protected BeWiNrUndStatus beWiNr;
    @XmlElement(required = true)
    protected List<String> verwaltungsname;
    protected List<Registergerichtseintragung> registergerichtseintragung;
    @XmlElement(name = "w-IdNr.Identifikator", required = true)
    protected WIdNr wIdNrIdentifikator;
    @XmlElement(required = true)
    protected List<AnschriftType> anschrift;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
    protected List<String> wirtschaftszweigschluessel;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1")
    protected CodeRechtsformen rechtsformcode;

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
     * Ruft den Wert der unternehmenseinheitUUID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnternehmenseinheitUUID() {
        return unternehmenseinheitUUID;
    }

    /**
     * Legt den Wert der unternehmenseinheitUUID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnternehmenseinheitUUID(String value) {
        this.unternehmenseinheitUUID = value;
    }

    /**
     * Ruft den Wert der geschaeftsfallkenner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CodeGeschaeftfallkenner }
     *     
     */
    public CodeGeschaeftfallkenner getGeschaeftsfallkenner() {
        return geschaeftsfallkenner;
    }

    /**
     * Legt den Wert der geschaeftsfallkenner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGeschaeftfallkenner }
     *     
     */
    public void setGeschaeftsfallkenner(CodeGeschaeftfallkenner value) {
        this.geschaeftsfallkenner = value;
    }

    /**
     * Ruft den Wert der nrUnternehmen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrUnternehmen() {
        return nrUnternehmen;
    }

    /**
     * Legt den Wert der nrUnternehmen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrUnternehmen(String value) {
        this.nrUnternehmen = value;
    }

    /**
     * Ruft den Wert der gesamtzahlUnternehmen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGesamtzahlUnternehmen() {
        return gesamtzahlUnternehmen;
    }

    /**
     * Legt den Wert der gesamtzahlUnternehmen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGesamtzahlUnternehmen(String value) {
        this.gesamtzahlUnternehmen = value;
    }

    /**
     * Ruft den Wert der updatezeitpunkt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatezeitpunkt() {
        return updatezeitpunkt;
    }

    /**
     * Legt den Wert der updatezeitpunkt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatezeitpunkt(XMLGregorianCalendar value) {
        this.updatezeitpunkt = value;
    }

    /**
     * Ruft den Wert der natuerlichePerson-Eigenschaft ab.
     * 
     */
    public boolean isNatuerlichePerson() {
        return natuerlichePerson;
    }

    /**
     * Legt den Wert der natuerlichePerson-Eigenschaft fest.
     * 
     */
    public void setNatuerlichePerson(boolean value) {
        this.natuerlichePerson = value;
    }

    /**
     * Ruft den Wert der beWiNr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BeWiNrUndStatus }
     *     
     */
    public BeWiNrUndStatus getBeWiNr() {
        return beWiNr;
    }

    /**
     * Legt den Wert der beWiNr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BeWiNrUndStatus }
     *     
     */
    public void setBeWiNr(BeWiNrUndStatus value) {
        this.beWiNr = value;
    }

    /**
     * Gets the value of the verwaltungsname property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the verwaltungsname property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVerwaltungsname().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the verwaltungsname property.
     */
    public List<String> getVerwaltungsname() {
        if (verwaltungsname == null) {
            verwaltungsname = new ArrayList<>();
        }
        return this.verwaltungsname;
    }

    /**
     * Gets the value of the registergerichtseintragung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the registergerichtseintragung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistergerichtseintragung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Registergerichtseintragung }
     * 
     * 
     * @return
     *     The value of the registergerichtseintragung property.
     */
    public List<Registergerichtseintragung> getRegistergerichtseintragung() {
        if (registergerichtseintragung == null) {
            registergerichtseintragung = new ArrayList<>();
        }
        return this.registergerichtseintragung;
    }

    /**
     * Ruft den Wert der wIdNrIdentifikator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WIdNr }
     *     
     */
    public WIdNr getWIdNrIdentifikator() {
        return wIdNrIdentifikator;
    }

    /**
     * Legt den Wert der wIdNrIdentifikator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WIdNr }
     *     
     */
    public void setWIdNrIdentifikator(WIdNr value) {
        this.wIdNrIdentifikator = value;
    }

    /**
     * Gets the value of the anschrift property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the anschrift property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnschrift().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnschriftType }
     * 
     * 
     * @return
     *     The value of the anschrift property.
     */
    public List<AnschriftType> getAnschrift() {
        if (anschrift == null) {
            anschrift = new ArrayList<>();
        }
        return this.anschrift;
    }

    /**
     * Element zur Übertragung des Wirtschaftszweigs und der Gültigkeit.Gets the value of the wirtschaftszweigschluessel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wirtschaftszweigschluessel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWirtschaftszweigschluessel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the wirtschaftszweigschluessel property.
     */
    public List<String> getWirtschaftszweigschluessel() {
        if (wirtschaftszweigschluessel == null) {
            wirtschaftszweigschluessel = new ArrayList<>();
        }
        return this.wirtschaftszweigschluessel;
    }

    /**
     * Element zur Übertragung der Rechtsform
     * 
     * @return
     *     possible object is
     *     {@link CodeRechtsformen }
     *     
     */
    public CodeRechtsformen getRechtsformcode() {
        return rechtsformcode;
    }

    /**
     * Legt den Wert der rechtsformcode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeRechtsformen }
     *     
     */
    public void setRechtsformcode(CodeRechtsformen value) {
        this.rechtsformcode = value;
    }

}
