package th.ac.ku.kps.eng.cpe.soa.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Customer {
	private String name;
	private List<PhoneNumber> phoneNumber;
	
	public Customer() {
		// TODO Auto-generated constructor stub
		phoneNumber = new ArrayList<PhoneNumber>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="phone-number")
	public List<PhoneNumber> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
