package quiz2;

public class PersonalContact extends Contact{
	String relationship;

	PersonalContact(){
	}

	PersonalContact(String name, String phoneNumber, String relationship){
		super(name, phoneNumber);
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		return String.valueOf("이름: " + name + ", 전화번호: " + phoneNumber + ", 관계: " + relationship);
	}

	@Override
	public Contact add(){
		System.out.println("이름을 입력하세요: ");
		super.name = scanner.nextLine();
		System.out.println("연락처를 입력하세요: ");
		super.phoneNumber = scanner.nextLine();
		System.out.println("관계 입력하세요: ");
		this.relationship = scanner.nextLine();
		return new PersonalContact(name, phoneNumber, relationship);
	}

}