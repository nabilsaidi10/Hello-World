package de.destatis.ubreg.neueanlageBZSt.domain.service;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.destatis.ubreg.neueanlageBZSt.domain.model.Lieferungspaket;


public class UnmaeshalBZSt {

	File xmlFile = new File("BZStBasisregisterSST_0_2_6_Beispiel.xml");
	 
	private JAXBContext jaxbContext;
	try
	{
	  jaxbContext = JAXBContext.newInstance(Lieferungspaket.class);        
	 
	  Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	 
	  Lieferungspaket lieferungspaket = (Lieferungspaket) jaxbUnmarshaller.unmarshal(xmlFile);
	   
	  System.out.println(lieferungspaket);
	}
	catch (JAXBException e) 
	{
	  e.printStackTrace();
	}
}