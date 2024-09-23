package quiz2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		BusinessContact businessContact = new BusinessContact();
		PersonalContact personalContact = new PersonalContact();
		AddressBook addressBook = new AddressBook();

		boolean a = true;
		while(a){
			System.out.println("1. 비즈니스 연락처 추가");
			System.out.println("2. 개인 연락처 추가");
			System.out.println("3. 연락처 출력");
			System.out.println("4. 연락처 검색");
			System.out.println("5. 종료");
			System.out.print("메뉴를 선택해주세요: ");
			String str = scanner.nextLine();

			switch (str){
				case "1" -> {
					addressBook.getContacts().add(businessContact.add());
				}
				case "2" -> {
					addressBook.getContacts().add(personalContact.add());
				}
				case "3" -> addressBook.displayContacts();
				case "4" -> {
					System.out.println("검색할 이름을 입력하세요: ");
					String name = scanner.nextLine();
					addressBook.searchContact(name);
				}
				case "5" -> a=false;
			}
		}
	}
}
