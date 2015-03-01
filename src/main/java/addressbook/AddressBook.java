package addressbook;

// Samyak is creating CI Session ScreenCast using SVN, MVN, Jenkins and Artifactory

// Hook Script policy testing

import java.util.HashMap;
import java.util.Map;

// Samyak created this ScreenCast that showcase Continuous Integration --> Continuous Deployment --> Continuous Delivery and meant for Infosys POC purpose

public class AddressBook {
	private Map<String, String> addressMap = new HashMap<String, String>();
	
	public void addEntry(String firstName, String phoneNumber) {
		addressMap.put(firstName, phoneNumber);		
	}

	public int size() {
		return addressMap.size();
	}

}
