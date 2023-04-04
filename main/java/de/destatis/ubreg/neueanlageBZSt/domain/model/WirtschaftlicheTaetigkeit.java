//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}bundeseinheitlicheWirtschaftsnummer" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1}rechtsform" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}wirtschaftlichTaetiger" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}taetigkeit" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}wirtschaftszweigschluessel" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eingetragenername_1.1}eingetragenerName" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1}eintragung" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}anschrift" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}geschaeftsbezeichnung" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1}kommunikation" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1}betriebsstaette" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bundeseinheitlicheWirtschaftsnummer",
    "rechtsform",
    "wirtschaftlichTaetiger",
    "taetigkeit",
    "wirtschaftszweigschluessel",
    "eingetragenerName",
    "eintragung",
    "anschrift",
    "geschaeftsbezeichnung",
    "kommunikation",
    "betriebsstaette"
})
@XmlRootElement(name = "wirtschaftlicheTaetigkeit", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
public class WirtschaftlicheTaetigkeit {

    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
    protected String bundeseinheitlicheWirtschaftsnummer;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1")
    protected Rechtsform rechtsform;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
    protected WirtschaftlichTaetiger wirtschaftlichTaetiger;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
    protected String taetigkeit;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
    protected List<String> wirtschaftszweigschluessel;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eingetragenername_1.1")
    protected String eingetragenerName;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1")
    protected Eintragung eintragung;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1")
    protected List<AnschriftType> anschrift;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
    protected String geschaeftsbezeichnung;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1")
    protected List<Kommunikation> kommunikation;
    @XmlElement(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1")
    protected List<Betriebsstaette> betriebsstaette;

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
     * Die Rechtsform einer wirtschaftlichen Tätigkeit, einer juristischen Person, einer rechtsfähigen Personengesellschaft oder einer sonstigen Personenvereinigung im Sinne der Rechtsform-Codierung.
     * 
     * @return
     *     possible object is
     *     {@link Rechtsform }
     *     
     */
    public Rechtsform getRechtsform() {
        return rechtsform;
    }

    /**
     * Legt den Wert der rechtsform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rechtsform }
     *     
     */
    public void setRechtsform(Rechtsform value) {
        this.rechtsform = value;
    }

    /**
     * Mit dieser Rolle wird die natürliche Person, juristische Person, rechtsfähige Personengesellschaft oder sonstige Personenvereinigung identifiziert, die bei Abschluss der zivilen Rechtsgeschäfte in Ausübung ihrer gewerblichen oder selbständigen beruflichen Tätigkeit handelt (Unternehmer im Sinne des § 14 BGB, Kaufmann im Sinne des § 1 HGB bei Handelsgewerben). Diese Rolle bezeichnet immer die zivilrechtliche, nach außen am Wirtschaftleben teilnehmende Person bzw. Personenvereinigung. Sofern dieses Subjekt im jeweiligen verwaltungsrechtlichen Kontext nicht Träger von Rechten und Pflichten sein kann, kann der Antragsteller im jeweiligen Verwaltungsverfahren vom Unternehmenträger abweichen. Dies gilt insbesondere bei Personengesellschaften im Gewerberecht, die im Allgemeinen nicht selbst Gewerbetreibende sein können, sondern deren beteiligte Personen.
     * 
     * @return
     *     possible object is
     *     {@link WirtschaftlichTaetiger }
     *     
     */
    public WirtschaftlichTaetiger getWirtschaftlichTaetiger() {
        return wirtschaftlichTaetiger;
    }

    /**
     * Legt den Wert der wirtschaftlichTaetiger-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WirtschaftlichTaetiger }
     *     
     */
    public void setWirtschaftlichTaetiger(WirtschaftlichTaetiger value) {
        this.wirtschaftlichTaetiger = value;
    }

    /**
     * Benennung bzw. Bezeichnung der ausgeübten Tätigkeit
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaetigkeit() {
        return taetigkeit;
    }

    /**
     * Legt den Wert der taetigkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaetigkeit(String value) {
        this.taetigkeit = value;
    }

    /**
     * Klassifikation der wirtschaftlichen Tätigkeit gemäß der Klassifikation der Wirtschaftszweige des Statistischen Bundesamts (WZ 2008).Gets the value of the wirtschaftszweigschluessel property.
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
     * Die im Handels- oder Genossenschaftsregister eingetragene Firma eines wirtschaftlich Tätigen bzw. einer wirtschaftlichen Tätigkeit (z. B. eingetragenes Einzelunternehmen, eingetragene Zweigniederlassung) bzw. der im Vereinsregister, Partnerschaftsregister oder Stiftungsverzeichnis eingetragene Name.Der eingetragene Name kann auch in einem Register festgehalten sein, welches in einem anderen Staat geführt wird.Der eingetragene Name ist abzugrenzen von der Geschäftsbezeichnung.Das Kerndatenobjekt bildet auch die Namen juristischer Personen, rechtsfähiger Personengesellschaften oder sonstiger Personenvereinigungen ab, die nicht in einem Register, aber kraft Gesetz geführt werden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEingetragenerName() {
        return eingetragenerName;
    }

    /**
     * Legt den Wert der eingetragenerName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEingetragenerName(String value) {
        this.eingetragenerName = value;
    }

    /**
     * Dieses Kerndatenobjekt fasst die Daten, mit welchen die Eintragung eines wirtschaftlich Tätigen bzw. einer wirtschaftlichen Tätigkeit in ein Register (Handels-, Genossenschafts-, Partnerschafts- oder Vereinsregister) oder in ein Verzeichnis (Stiftungsverzeichnis) identifiziert werden kann.Die Eintragung kann auch in ein Register oder Verzeichnis erfolgen, welches in einem anderen Staat geführt wird.Zwischen Rechtsform und Eintragung besteht ein Zusammenhang. Welche Eintragungsarten (Handelsregister A, Handelsregister B, Genossenschaftsregister, Vereinsregister, Partnerschaftsregister, Register im Ausland, Kraft Gesetz) für welche Rechtsformen zulässig sein können, wird als Information in der Codeliste der Rechtsformen mitgeführt.
     * 
     * @return
     *     possible object is
     *     {@link Eintragung }
     *     
     */
    public Eintragung getEintragung() {
        return eintragung;
    }

    /**
     * Legt den Wert der eintragung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Eintragung }
     *     
     */
    public void setEintragung(Eintragung value) {
        this.eintragung = value;
    }

    /**
     * Angaben für die Adressierung. Eine Anschrift ist entweder eine Inlands- oder ein Auslandsanschrift.Gets the value of the anschrift property.
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
     * Zur Außendarstellung einer wirtschaftlichen Tätigkeit oder einer Betriebsstätte verwendeter Name, der nicht im Handel-, Genossenschafts-, Partnerschafts- oder Vereinsregister eingetragen ist oder davon abweicht (z.B. Gasthof "Zum lustigen Wirt"; "Ruck-Zuck-GbR").
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeschaeftsbezeichnung() {
        return geschaeftsbezeichnung;
    }

    /**
     * Legt den Wert der geschaeftsbezeichnung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeschaeftsbezeichnung(String value) {
        this.geschaeftsbezeichnung = value;
    }

    /**
     * Angaben zu Telefon, Telefax, Email-Adresse und/oder Webseite.Gets the value of the kommunikation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the kommunikation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommunikation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kommunikation }
     * 
     * 
     * @return
     *     The value of the kommunikation property.
     */
    public List<Kommunikation> getKommunikation() {
        if (kommunikation == null) {
            kommunikation = new ArrayList<>();
        }
        return this.kommunikation;
    }

    /**
     * Dieses Kerndatenobjekt identifiziert einen Ort, an welchem eine wirtschaftliche Tätigkeit tatsächlich und grundsätzlich dauerhaft ausgeübt wird.Gets the value of the betriebsstaette property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the betriebsstaette property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBetriebsstaette().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Betriebsstaette }
     * 
     * 
     * @return
     *     The value of the betriebsstaette property.
     */
    public List<Betriebsstaette> getBetriebsstaette() {
        if (betriebsstaette == null) {
            betriebsstaette = new ArrayList<>();
        }
        return this.betriebsstaette;
    }

}
