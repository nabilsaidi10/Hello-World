//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.destatis.ubreg.neueanlageBZSt.domain.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Autor_QNAME = new QName("http://xoev.de/schemata/basisnachricht/g2g/1_0", "autor");
    private static final QName _IdentifikationNachricht_QNAME = new QName("http://xoev.de/schemata/basisnachricht/g2g/1_0", "identifikation.nachricht");
    private static final QName _Leser_QNAME = new QName("http://xoev.de/schemata/basisnachricht/g2g/1_0", "leser");
    private static final QName _NachrichtenkopfG2G_QNAME = new QName("http://xoev.de/schemata/basisnachricht/g2g/1_0", "nachrichtenkopf.g2g");
    private static final QName _Erreichbarkeit_QNAME = new QName("http://xoev.de/schemata/basisnachricht/kommunikation/1_0", "erreichbarkeit");
    private static final QName _Anschrift_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "anschrift");
    private static final QName _AnschriftAusland_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "anschriftAusland");
    private static final QName _AnschriftInland_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "anschriftInland");
    private static final QName _Anschriftenzeile_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "anschriftenzeile");
    private static final QName _ArtAnschrift_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "artAnschrift");
    private static final QName _FruehererGemeindename_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "fruehererGemeindename");
    private static final QName _Gemeindeschluessel_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "gemeindeschluessel");
    private static final QName _GrossempfaengerAnschriftInland_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "grossempfaengerAnschriftInland");
    private static final QName _Hausnummer_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "hausnummer");
    private static final QName _Ort_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "ort");
    private static final QName _Postfach_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "postfach");
    private static final QName _PostfachanschriftInland_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "postfachanschriftInland");
    private static final QName _Postleitzahl_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "postleitzahl");
    private static final QName _Staat_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "staat");
    private static final QName _StaatCode_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "staat.code");
    private static final QName _StaatFreitext_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "staat.freitext");
    private static final QName _Strasse_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "strasse");
    private static final QName _StrassenanschriftInland_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "strassenanschriftInland");
    private static final QName _Wohnungsinhaber_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "wohnungsinhaber");
    private static final QName _Zusatzangaben_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", "zusatzangaben");
    private static final QName _Datum_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", "datum");
    private static final QName _Jahr_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", "jahr");
    private static final QName _JahrMonat_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", "jahrMonat");
    private static final QName _Unbekannt_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", "unbekannt");
    private static final QName _ArtEintragung_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", "artEintragung");
    private static final QName _RegistergerichtCode_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", "registergericht.code");
    private static final QName _RegistergerichtBezeichnung_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", "registergericht.bezeichnung");
    private static final QName _Stiftungsverzeichnis_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", "stiftungsverzeichnis");
    private static final QName _Eintragungsnummer_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", "eintragungsnummer");
    private static final QName _Rechtsformcode_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1", "rechtsformcode");
    private static final QName _ArtBetriebsstaette_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", "artBetriebsstaette");
    private static final QName _Geschaeftsbezeichnung_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", "geschaeftsbezeichnung");
    private static final QName _KlassifikationKommunikation_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", "klassifikationKommunikation");
    private static final QName _Hinweis_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", "hinweis");
    private static final QName _Telefon_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", "telefon");
    private static final QName _Telefax_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", "telefax");
    private static final QName _EMail_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", "eMail");
    private static final QName _DeMail_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", "deMail");
    private static final QName _WebAdresse_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", "webAdresse");
    private static final QName _BundeseinheitlicheWirtschaftsnummer_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", "bundeseinheitlicheWirtschaftsnummer");
    private static final QName _Taetigkeit_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", "taetigkeit");
    private static final QName _WirtschaftlichTaetigerId_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", "wirtschaftlichTaetiger.id");
    private static final QName _Wirtschaftszweigschluessel_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", "wirtschaftszweigschluessel");
    private static final QName _EingetragenerName_QNAME = new QName("urn:xoev-de:xunternehmen:standard:basismodul:eingetragenername_1.1", "eingetragenerName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.destatis.ubreg.neueanlageBZSt.domain.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Lieferungspaket }
     * 
     * @return
     *     the new instance of {@link Lieferungspaket }
     */
    public Lieferungspaket createLieferungspaket() {
        return new Lieferungspaket();
    }

    /**
     * Create an instance of {@link Lieferungspaketkopf }
     * 
     * @return
     *     the new instance of {@link Lieferungspaketkopf }
     */
    public Lieferungspaketkopf createLieferungspaketkopf() {
        return new Lieferungspaketkopf();
    }

    /**
     * Create an instance of {@link Unternehmenseinheit }
     * 
     * @return
     *     the new instance of {@link Unternehmenseinheit }
     */
    public Unternehmenseinheit createUnternehmenseinheit() {
        return new Unternehmenseinheit();
    }

    /**
     * Create an instance of {@link BeWiNrUndStatus }
     * 
     * @return
     *     the new instance of {@link BeWiNrUndStatus }
     */
    public BeWiNrUndStatus createBeWiNrUndStatus() {
        return new BeWiNrUndStatus();
    }

    /**
     * Create an instance of {@link Registergerichtseintragung }
     * 
     * @return
     *     the new instance of {@link Registergerichtseintragung }
     */
    public Registergerichtseintragung createRegistergerichtseintragung() {
        return new Registergerichtseintragung();
    }

    /**
     * Create an instance of {@link WIdNr }
     * 
     * @return
     *     the new instance of {@link WIdNr }
     */
    public WIdNr createWIdNr() {
        return new WIdNr();
    }

    /**
     * Create an instance of {@link Identifikator }
     * 
     * @return
     *     the new instance of {@link Identifikator }
     */
    public Identifikator createIdentifikator() {
        return new Identifikator();
    }

    /**
     * Create an instance of {@link Gueltigkeit }
     * 
     * @return
     *     the new instance of {@link Gueltigkeit }
     */
    public Gueltigkeit createGueltigkeit() {
        return new Gueltigkeit();
    }

    /**
     * Create an instance of {@link IdentifikationLieferungspaket }
     * 
     * @return
     *     the new instance of {@link IdentifikationLieferungspaket }
     */
    public IdentifikationLieferungspaket createIdentifikationLieferungspaket() {
        return new IdentifikationLieferungspaket();
    }

    /**
     * Create an instance of {@link BehoerdeInfo }
     * 
     * @return
     *     the new instance of {@link BehoerdeInfo }
     */
    public BehoerdeInfo createBehoerdeInfo() {
        return new BehoerdeInfo();
    }

    /**
     * Create an instance of {@link CodeGeschaeftfallkenner }
     * 
     * @return
     *     the new instance of {@link CodeGeschaeftfallkenner }
     */
    public CodeGeschaeftfallkenner createCodeGeschaeftfallkenner() {
        return new CodeGeschaeftfallkenner();
    }

    /**
     * Create an instance of {@link BehoerdeType }
     * 
     * @return
     *     the new instance of {@link BehoerdeType }
     */
    public BehoerdeType createBehoerdeType() {
        return new BehoerdeType();
    }

    /**
     * Create an instance of {@link IdentifikationNachrichtType }
     * 
     * @return
     *     the new instance of {@link IdentifikationNachrichtType }
     */
    public IdentifikationNachrichtType createIdentifikationNachrichtType() {
        return new IdentifikationNachrichtType();
    }

    /**
     * Create an instance of {@link NachrichtenkopfG2GType }
     * 
     * @return
     *     the new instance of {@link NachrichtenkopfG2GType }
     */
    public NachrichtenkopfG2GType createNachrichtenkopfG2GType() {
        return new NachrichtenkopfG2GType();
    }

    /**
     * Create an instance of {@link NachrichtG2GType }
     * 
     * @return
     *     the new instance of {@link NachrichtG2GType }
     */
    public NachrichtG2GType createNachrichtG2GType() {
        return new NachrichtG2GType();
    }

    /**
     * Create an instance of {@link CodeVerzeichnisdienstType }
     * 
     * @return
     *     the new instance of {@link CodeVerzeichnisdienstType }
     */
    public CodeVerzeichnisdienstType createCodeVerzeichnisdienstType() {
        return new CodeVerzeichnisdienstType();
    }

    /**
     * Create an instance of {@link KommunikationType }
     * 
     * @return
     *     the new instance of {@link KommunikationType }
     */
    public KommunikationType createKommunikationType() {
        return new KommunikationType();
    }

    /**
     * Create an instance of {@link CodeKommunikationKanalType }
     * 
     * @return
     *     the new instance of {@link CodeKommunikationKanalType }
     */
    public CodeKommunikationKanalType createCodeKommunikationKanalType() {
        return new CodeKommunikationKanalType();
    }

    /**
     * Create an instance of {@link Code }
     * 
     * @return
     *     the new instance of {@link Code }
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link AnschriftType }
     * 
     * @return
     *     the new instance of {@link AnschriftType }
     */
    public AnschriftType createAnschriftType() {
        return new AnschriftType();
    }

    /**
     * Create an instance of {@link AnschriftAuslandType }
     * 
     * @return
     *     the new instance of {@link AnschriftAuslandType }
     */
    public AnschriftAuslandType createAnschriftAuslandType() {
        return new AnschriftAuslandType();
    }

    /**
     * Create an instance of {@link AnschriftInlandType }
     * 
     * @return
     *     the new instance of {@link AnschriftInlandType }
     */
    public AnschriftInlandType createAnschriftInlandType() {
        return new AnschriftInlandType();
    }

    /**
     * Create an instance of {@link CodeArtAnschrift }
     * 
     * @return
     *     the new instance of {@link CodeArtAnschrift }
     */
    public CodeArtAnschrift createCodeArtAnschrift() {
        return new CodeArtAnschrift();
    }

    /**
     * Create an instance of {@link CodeGemeindeschluessel }
     * 
     * @return
     *     the new instance of {@link CodeGemeindeschluessel }
     */
    public CodeGemeindeschluessel createCodeGemeindeschluessel() {
        return new CodeGemeindeschluessel();
    }

    /**
     * Create an instance of {@link GrossempfaengerAnschriftInlandType }
     * 
     * @return
     *     the new instance of {@link GrossempfaengerAnschriftInlandType }
     */
    public GrossempfaengerAnschriftInlandType createGrossempfaengerAnschriftInlandType() {
        return new GrossempfaengerAnschriftInlandType();
    }

    /**
     * Create an instance of {@link PostfachanschriftInlandType }
     * 
     * @return
     *     the new instance of {@link PostfachanschriftInlandType }
     */
    public PostfachanschriftInlandType createPostfachanschriftInlandType() {
        return new PostfachanschriftInlandType();
    }

    /**
     * Create an instance of {@link StaatType }
     * 
     * @return
     *     the new instance of {@link StaatType }
     */
    public StaatType createStaatType() {
        return new StaatType();
    }

    /**
     * Create an instance of {@link CodeStaat }
     * 
     * @return
     *     the new instance of {@link CodeStaat }
     */
    public CodeStaat createCodeStaat() {
        return new CodeStaat();
    }

    /**
     * Create an instance of {@link StrassenanschriftInlandType }
     * 
     * @return
     *     the new instance of {@link StrassenanschriftInlandType }
     */
    public StrassenanschriftInlandType createStrassenanschriftInlandType() {
        return new StrassenanschriftInlandType();
    }

    /**
     * Create an instance of {@link DatumMitTeilbekanntType }
     * 
     * @return
     *     the new instance of {@link DatumMitTeilbekanntType }
     */
    public DatumMitTeilbekanntType createDatumMitTeilbekanntType() {
        return new DatumMitTeilbekanntType();
    }

    /**
     * Create an instance of {@link DatumMitTeilbekanntUndUnbekanntType }
     * 
     * @return
     *     the new instance of {@link DatumMitTeilbekanntUndUnbekanntType }
     */
    public DatumMitTeilbekanntUndUnbekanntType createDatumMitTeilbekanntUndUnbekanntType() {
        return new DatumMitTeilbekanntUndUnbekanntType();
    }

    /**
     * Create an instance of {@link DatumMitUnbekanntType }
     * 
     * @return
     *     the new instance of {@link DatumMitUnbekanntType }
     */
    public DatumMitUnbekanntType createDatumMitUnbekanntType() {
        return new DatumMitUnbekanntType();
    }

    /**
     * Create an instance of {@link CodeArtDerEintragung }
     * 
     * @return
     *     the new instance of {@link CodeArtDerEintragung }
     */
    public CodeArtDerEintragung createCodeArtDerEintragung() {
        return new CodeArtDerEintragung();
    }

    /**
     * Create an instance of {@link Eintragung }
     * 
     * @return
     *     the new instance of {@link Eintragung }
     */
    public Eintragung createEintragung() {
        return new Eintragung();
    }

    /**
     * Create an instance of {@link CodeRegistergericht }
     * 
     * @return
     *     the new instance of {@link CodeRegistergericht }
     */
    public CodeRegistergericht createCodeRegistergericht() {
        return new CodeRegistergericht();
    }

    /**
     * Create an instance of {@link Rechtsform }
     * 
     * @return
     *     the new instance of {@link Rechtsform }
     */
    public Rechtsform createRechtsform() {
        return new Rechtsform();
    }

    /**
     * Create an instance of {@link CodeRechtsformen }
     * 
     * @return
     *     the new instance of {@link CodeRechtsformen }
     */
    public CodeRechtsformen createCodeRechtsformen() {
        return new CodeRechtsformen();
    }

    /**
     * Create an instance of {@link CodeArtNiederlassung }
     * 
     * @return
     *     the new instance of {@link CodeArtNiederlassung }
     */
    public CodeArtNiederlassung createCodeArtNiederlassung() {
        return new CodeArtNiederlassung();
    }

    /**
     * Create an instance of {@link Betriebsstaette }
     * 
     * @return
     *     the new instance of {@link Betriebsstaette }
     */
    public Betriebsstaette createBetriebsstaette() {
        return new Betriebsstaette();
    }

    /**
     * Create an instance of {@link Kommunikation }
     * 
     * @return
     *     the new instance of {@link Kommunikation }
     */
    public Kommunikation createKommunikation() {
        return new Kommunikation();
    }

    /**
     * Create an instance of {@link KommunikationBasis }
     * 
     * @return
     *     the new instance of {@link KommunikationBasis }
     */
    public KommunikationBasis createKommunikationBasis() {
        return new KommunikationBasis();
    }

    /**
     * Create an instance of {@link CodeKlassifikationKommunikation }
     * 
     * @return
     *     the new instance of {@link CodeKlassifikationKommunikation }
     */
    public CodeKlassifikationKommunikation createCodeKlassifikationKommunikation() {
        return new CodeKlassifikationKommunikation();
    }

    /**
     * Create an instance of {@link WirtschaftlichTaetiger }
     * 
     * @return
     *     the new instance of {@link WirtschaftlichTaetiger }
     */
    public WirtschaftlichTaetiger createWirtschaftlichTaetiger() {
        return new WirtschaftlichTaetiger();
    }

    /**
     * Create an instance of {@link WirtschaftlicheTaetigkeit }
     * 
     * @return
     *     the new instance of {@link WirtschaftlicheTaetigkeit }
     */
    public WirtschaftlicheTaetigkeit createWirtschaftlicheTaetigkeit() {
        return new WirtschaftlicheTaetigkeit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BehoerdeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BehoerdeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xoev.de/schemata/basisnachricht/g2g/1_0", name = "autor")
    public JAXBElement<BehoerdeType> createAutor(BehoerdeType value) {
        return new JAXBElement<>(_Autor_QNAME, BehoerdeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifikationNachrichtType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentifikationNachrichtType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xoev.de/schemata/basisnachricht/g2g/1_0", name = "identifikation.nachricht")
    public JAXBElement<IdentifikationNachrichtType> createIdentifikationNachricht(IdentifikationNachrichtType value) {
        return new JAXBElement<>(_IdentifikationNachricht_QNAME, IdentifikationNachrichtType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BehoerdeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BehoerdeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xoev.de/schemata/basisnachricht/g2g/1_0", name = "leser")
    public JAXBElement<BehoerdeType> createLeser(BehoerdeType value) {
        return new JAXBElement<>(_Leser_QNAME, BehoerdeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NachrichtenkopfG2GType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NachrichtenkopfG2GType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xoev.de/schemata/basisnachricht/g2g/1_0", name = "nachrichtenkopf.g2g")
    public JAXBElement<NachrichtenkopfG2GType> createNachrichtenkopfG2G(NachrichtenkopfG2GType value) {
        return new JAXBElement<>(_NachrichtenkopfG2G_QNAME, NachrichtenkopfG2GType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KommunikationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KommunikationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://xoev.de/schemata/basisnachricht/kommunikation/1_0", name = "erreichbarkeit")
    public JAXBElement<KommunikationType> createErreichbarkeit(KommunikationType value) {
        return new JAXBElement<>(_Erreichbarkeit_QNAME, KommunikationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnschriftType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnschriftType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "anschrift")
    public JAXBElement<AnschriftType> createAnschrift(AnschriftType value) {
        return new JAXBElement<>(_Anschrift_QNAME, AnschriftType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnschriftAuslandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnschriftAuslandType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "anschriftAusland")
    public JAXBElement<AnschriftAuslandType> createAnschriftAusland(AnschriftAuslandType value) {
        return new JAXBElement<>(_AnschriftAusland_QNAME, AnschriftAuslandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnschriftInlandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AnschriftInlandType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "anschriftInland")
    public JAXBElement<AnschriftInlandType> createAnschriftInland(AnschriftInlandType value) {
        return new JAXBElement<>(_AnschriftInland_QNAME, AnschriftInlandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "anschriftenzeile")
    public JAXBElement<String> createAnschriftenzeile(String value) {
        return new JAXBElement<>(_Anschriftenzeile_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeArtAnschrift }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeArtAnschrift }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "artAnschrift")
    public JAXBElement<CodeArtAnschrift> createArtAnschrift(CodeArtAnschrift value) {
        return new JAXBElement<>(_ArtAnschrift_QNAME, CodeArtAnschrift.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "fruehererGemeindename")
    public JAXBElement<String> createFruehererGemeindename(String value) {
        return new JAXBElement<>(_FruehererGemeindename_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeGemeindeschluessel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeGemeindeschluessel }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "gemeindeschluessel")
    public JAXBElement<CodeGemeindeschluessel> createGemeindeschluessel(CodeGemeindeschluessel value) {
        return new JAXBElement<>(_Gemeindeschluessel_QNAME, CodeGemeindeschluessel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrossempfaengerAnschriftInlandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GrossempfaengerAnschriftInlandType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "grossempfaengerAnschriftInland")
    public JAXBElement<GrossempfaengerAnschriftInlandType> createGrossempfaengerAnschriftInland(GrossempfaengerAnschriftInlandType value) {
        return new JAXBElement<>(_GrossempfaengerAnschriftInland_QNAME, GrossempfaengerAnschriftInlandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "hausnummer")
    public JAXBElement<String> createHausnummer(String value) {
        return new JAXBElement<>(_Hausnummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "ort")
    public JAXBElement<String> createOrt(String value) {
        return new JAXBElement<>(_Ort_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "postfach")
    public JAXBElement<String> createPostfach(String value) {
        return new JAXBElement<>(_Postfach_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostfachanschriftInlandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PostfachanschriftInlandType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "postfachanschriftInland")
    public JAXBElement<PostfachanschriftInlandType> createPostfachanschriftInland(PostfachanschriftInlandType value) {
        return new JAXBElement<>(_PostfachanschriftInland_QNAME, PostfachanschriftInlandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "postleitzahl")
    public JAXBElement<String> createPostleitzahl(String value) {
        return new JAXBElement<>(_Postleitzahl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StaatType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StaatType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "staat")
    public JAXBElement<StaatType> createStaat(StaatType value) {
        return new JAXBElement<>(_Staat_QNAME, StaatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeStaat }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeStaat }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "staat.code")
    public JAXBElement<CodeStaat> createStaatCode(CodeStaat value) {
        return new JAXBElement<>(_StaatCode_QNAME, CodeStaat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "staat.freitext")
    public JAXBElement<String> createStaatFreitext(String value) {
        return new JAXBElement<>(_StaatFreitext_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "strasse")
    public JAXBElement<String> createStrasse(String value) {
        return new JAXBElement<>(_Strasse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StrassenanschriftInlandType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StrassenanschriftInlandType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "strassenanschriftInland")
    public JAXBElement<StrassenanschriftInlandType> createStrassenanschriftInland(StrassenanschriftInlandType value) {
        return new JAXBElement<>(_StrassenanschriftInland_QNAME, StrassenanschriftInlandType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "wohnungsinhaber")
    public JAXBElement<String> createWohnungsinhaber(String value) {
        return new JAXBElement<>(_Wohnungsinhaber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1", name = "zusatzangaben")
    public JAXBElement<String> createZusatzangaben(String value) {
        return new JAXBElement<>(_Zusatzangaben_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", name = "datum")
    public JAXBElement<XMLGregorianCalendar> createDatum(XMLGregorianCalendar value) {
        return new JAXBElement<>(_Datum_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", name = "jahr")
    public JAXBElement<XMLGregorianCalendar> createJahr(XMLGregorianCalendar value) {
        return new JAXBElement<>(_Jahr_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", name = "jahrMonat")
    public JAXBElement<XMLGregorianCalendar> createJahrMonat(XMLGregorianCalendar value) {
        return new JAXBElement<>(_JahrMonat_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:datumsangaben_1.1", name = "unbekannt")
    public JAXBElement<Boolean> createUnbekannt(Boolean value) {
        return new JAXBElement<>(_Unbekannt_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeArtDerEintragung }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeArtDerEintragung }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", name = "artEintragung")
    public JAXBElement<CodeArtDerEintragung> createArtEintragung(CodeArtDerEintragung value) {
        return new JAXBElement<>(_ArtEintragung_QNAME, CodeArtDerEintragung.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeRegistergericht }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeRegistergericht }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", name = "registergericht.code")
    public JAXBElement<CodeRegistergericht> createRegistergerichtCode(CodeRegistergericht value) {
        return new JAXBElement<>(_RegistergerichtCode_QNAME, CodeRegistergericht.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", name = "registergericht.bezeichnung")
    public JAXBElement<String> createRegistergerichtBezeichnung(String value) {
        return new JAXBElement<>(_RegistergerichtBezeichnung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", name = "stiftungsverzeichnis")
    public JAXBElement<String> createStiftungsverzeichnis(String value) {
        return new JAXBElement<>(_Stiftungsverzeichnis_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eintragung_1.1", name = "eintragungsnummer")
    public JAXBElement<String> createEintragungsnummer(String value) {
        return new JAXBElement<>(_Eintragungsnummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeRechtsformen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeRechtsformen }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:rechtsform_1.1", name = "rechtsformcode")
    public JAXBElement<CodeRechtsformen> createRechtsformcode(CodeRechtsformen value) {
        return new JAXBElement<>(_Rechtsformcode_QNAME, CodeRechtsformen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeArtNiederlassung }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeArtNiederlassung }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", name = "artBetriebsstaette")
    public JAXBElement<CodeArtNiederlassung> createArtBetriebsstaette(CodeArtNiederlassung value) {
        return new JAXBElement<>(_ArtBetriebsstaette_QNAME, CodeArtNiederlassung.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", name = "geschaeftsbezeichnung")
    public JAXBElement<String> createGeschaeftsbezeichnung(String value) {
        return new JAXBElement<>(_Geschaeftsbezeichnung_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeKlassifikationKommunikation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodeKlassifikationKommunikation }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", name = "klassifikationKommunikation")
    public JAXBElement<CodeKlassifikationKommunikation> createKlassifikationKommunikation(CodeKlassifikationKommunikation value) {
        return new JAXBElement<>(_KlassifikationKommunikation_QNAME, CodeKlassifikationKommunikation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", name = "hinweis")
    public JAXBElement<String> createHinweis(String value) {
        return new JAXBElement<>(_Hinweis_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", name = "telefon")
    public JAXBElement<String> createTelefon(String value) {
        return new JAXBElement<>(_Telefon_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", name = "telefax")
    public JAXBElement<String> createTelefax(String value) {
        return new JAXBElement<>(_Telefax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", name = "eMail")
    public JAXBElement<String> createEMail(String value) {
        return new JAXBElement<>(_EMail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", name = "deMail")
    public JAXBElement<String> createDeMail(String value) {
        return new JAXBElement<>(_DeMail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:kommunikation_1.1", name = "webAdresse")
    public JAXBElement<String> createWebAdresse(String value) {
        return new JAXBElement<>(_WebAdresse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", name = "bundeseinheitlicheWirtschaftsnummer")
    public JAXBElement<String> createBundeseinheitlicheWirtschaftsnummer(String value) {
        return new JAXBElement<>(_BundeseinheitlicheWirtschaftsnummer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", name = "taetigkeit")
    public JAXBElement<String> createTaetigkeit(String value) {
        return new JAXBElement<>(_Taetigkeit_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", name = "wirtschaftlichTaetiger.id")
    public JAXBElement<String> createWirtschaftlichTaetigerId(String value) {
        return new JAXBElement<>(_WirtschaftlichTaetigerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:wirtschaftlichetaetigkeit_1.1", name = "wirtschaftszweigschluessel")
    public JAXBElement<String> createWirtschaftszweigschluessel(String value) {
        return new JAXBElement<>(_Wirtschaftszweigschluessel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:xoev-de:xunternehmen:standard:basismodul:eingetragenername_1.1", name = "eingetragenerName")
    public JAXBElement<String> createEingetragenerName(String value) {
        return new JAXBElement<>(_EingetragenerName_QNAME, String.class, null, value);
    }

}
