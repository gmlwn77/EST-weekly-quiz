package quiz2;

import java.util.Scanner;

public class Contact {
	private String name;
	private String phoneNumber;

	Scanner scanner = new Scanner(System.in);

	Contact(){
	}

	Contact(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return String.valueOf("이름: " + name + ", 전화번호: " + phoneNumber);
	}

	public Contact add(){
		System.out.println("이름을 입력하세요: ");
		this.name = scanner.nextLine();
		System.out.println("연락처를 입력하세요: ");
		this.phoneNumber = scanner.nextLine();
		return new Contact(this.name, this.phoneNumber);
	}

	public String getName(){
		return name;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

}