package th.ac.ku.kps.eng.cpe.soa.lab2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import th.ac.ku.kps.eng.cpe.soa.models.Customer;
import th.ac.ku.kps.eng.cpe.soa.models.PhoneNumber;

public class JAXBGenerateObject {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("customer-jaxb.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer cus = (Customer) jaxbUnmarshaller.unmarshal(is);
			System.out.println("Customer Name: " + cus.getName());
			ArrayList<PhoneNumber> phoneList = (ArrayList<PhoneNumber>) cus.getPhoneNumber();
			for (PhoneNumber p : phoneList) {
				System.out.println("phone number Id: " + p.getNumber());
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
