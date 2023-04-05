package de.destatis.ubreg.BeispielDGUV.domain.model;

	
	import java.io.Serializable;
	import javax.xml.bind.annotation.XmlAccessType;
	import javax.xml.bind.annotation.XmlAccessorType;
	import javax.xml.bind.annotation.XmlRootElement;
	 
	@XmlRootElement(name = "employee")
	@XmlAccessorType(XmlAccessType.PROPERTY)
	public class Employee implements Serializable {
	 
	  private static final long serialVersionUID = 1L;
	   
	  private Integer id;
	  private String firstName;
	  private String lastName;
	 
	   
	  public Employee() {
	    
	  }
	 
	  public Employee(int id, String fName, String lName) {

	    this.id = id;
	    this.firstName = fName;
	    this.lastName = lName;
	    
	  }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	  
	  
	  
	}

