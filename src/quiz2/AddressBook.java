package quiz2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	List<Contact> contacts = new ArrayList<>();

	public void displayContacts() {
		if(contacts.isEmpty()){
			System.out.println("연락처가 비어있습니다.");
		} else {
			for(Contact con : contacts){
				System.out.println(con);
			}
		}
	}

	public void searchContact(String name) {
		Contact str = null;
		for (Contact con : contacts) {
			if (String.valueOf(con).contains(name)) {
				System.out.println(con);
				str = con;
			}
		}
		if(str==null){
			System.out.println("연락처를 찾을 수 없습니다.");
		}
	}
}
