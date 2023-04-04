//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v4.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
//


package de.destatis.ubreg.neueanlageBZSt.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Code.Staat complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>{@code
 * <complexType name="Code.Staat">
 *   <complexContent>
 *     <restriction base="{http://xoev.de/schemata/code/1_0}Code">
 *       <sequence>
 *         <element name="code" type="{http://www.w3.org/2001/XMLSchema}token" form="unqualified"/>
 *       </sequence>
 *       <attribute name="listURI" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       <attribute name="listVersionID" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code.Staat", namespace = "urn:xoev-de:xunternehmen:standard:basismodul:adressen_1.1")
public class CodeStaat
    extends Code
{


}
