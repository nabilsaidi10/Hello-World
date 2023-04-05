package de.destatis.ubreg.BeispielDGUV;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.destatis.ubreg.BeispielDGUV.domain.model.Employee;

@SpringBootApplication
public class BeispielDguvApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeispielDguvApplication.class, args);
		try
		{
			File file = new File("src\\main\\resources\\employee.xml");
			JAXBContext jaxbContext= JAXBContext.newInstance(Employee.class);        
		 
		  Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		 
		  Employee employee = (Employee) unmarshaller.unmarshal(file);
		   
		  System.out.println(employee.getFirstName());
		}
		catch (Exception e) 
		{
		  e.printStackTrace();
		}
	}

	
}
