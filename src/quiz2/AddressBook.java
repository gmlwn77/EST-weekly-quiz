package quiz2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<Contact> contacts = new ArrayList<>();

	public AddressBook(){
		this.contacts = new ArrayList<>();
	}

	public void displayContacts() {
		if(contacts.isEmpty()){
			System.out.println("연락처가 비어있습니다.");
		} else {
			for(Contact con : contacts){
				System.out.println(con);
			}
		}
	}

	public List<Contact> getContacts(){
		return contacts;
	}

	public void searchContact(String name) {
		Contact str = null;
		for (Contact con : contacts) {
			if (con.getName().equals(name)) {
				System.out.println(con);
				str = con;
			}
		}
		if(str==null){
			System.out.println("연락처를 찾을 수 없습니다.");
		}
	}
}
