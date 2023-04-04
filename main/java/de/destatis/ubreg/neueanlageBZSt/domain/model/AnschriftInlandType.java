//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r AnschriftInlandType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="AnschriftInlandType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}strassenanschriftInland"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}postfachanschriftInland"/>
 *         <element ref="{urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1}grossempfaengerAnschriftInland"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnschriftInlandType", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", propOrder = {
    "strassenanschriftInland",
    "postfachanschriftInland",
    "grossempfaengerAnschriftInland"
})
public class AnschriftInlandType {

    protected StrassenanschriftInlandType strassenanschriftInland;
    protected PostfachanschriftInlandType postfachanschriftInland;
    protected GrossempfaengerAnschriftInlandType grossempfaengerAnschriftInland;

    /**
     * Angaben f�r die Adressierung im Inland, soweit es sich um die Anschrift eines Geb�udes handelt.
     * 
     * @return
     *     possible object is
     *     {@link StrassenanschriftInlandType }
     *     
     */
    public StrassenanschriftInlandType getStrassenanschriftInland() {
        return strassenanschriftInland;
    }

    /**
     * Legt den Wert der strassenanschriftInland-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StrassenanschriftInlandType }
     *     
     */
    public void setStrassenanschriftInland(StrassenanschriftInlandType value) {
        this.strassenanschriftInland = value;
    }

    /**
     * Angaben f�r die Adressierung im Inland, soweit es sich um die Anschrift eines Postfachs handelt.
     * 
     * @return
     *     possible object is
     *     {@link PostfachanschriftInlandType }
     *     
     */
    public PostfachanschriftInlandType getPostfachanschriftInland() {
        return postfachanschriftInland;
    }

    /**
     * Legt den Wert der postfachanschriftInland-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostfachanschriftInlandType }
     *     
     */
    public void setPostfachanschriftInland(PostfachanschriftInlandType value) {
        this.postfachanschriftInland = value;
    }

    /**
     * Angaben f�r die Adressierung im Inland, soweit es sich um die Anschrift eines Gro�empf�ngers handelt.
     * 
     * @return
     *     possible object is
     *     {@link GrossempfaengerAnschriftInlandType }
     *     
     */
    public GrossempfaengerAnschriftInlandType getGrossempfaengerAnschriftInland() {
        return grossempfaengerAnschriftInland;
    }

    /**
     * Legt den Wert der grossempfaengerAnschriftInland-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GrossempfaengerAnschriftInlandType }
     *     
     */
    public void setGrossempfaengerAnschriftInland(GrossempfaengerAnschriftInlandType value) {
        this.grossempfaengerAnschriftInland = value;
    }

	@Override
	public String toString() {
		return "AnschriftInlandType [strassenanschriftInland=" + strassenanschriftInland + ", postfachanschriftInland="
				+ postfachanschriftInland + ", grossempfaengerAnschriftInland=" + grossempfaengerAnschriftInland + "]";
	}
    
    

}
