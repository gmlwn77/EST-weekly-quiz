package quiz2;

public class BusinessContact extends Contact{
	String company;

	BusinessContact(){
	}

	BusinessContact(String name, String phoneNumber, String company) {
	super(name, phoneNumber);
	this.company = company;
	}

	@Override
	public String toString() {
		return String.valueOf("이름: " + name + ", 전화번호: " + phoneNumber + ", 회사명: " + company);
	}

	@Override
	public Contact add(){
		System.out.println("이름을 입력하세요: ");
		super.name = scanner.nextLine();
		System.out.println("연락처를 입력하세요: ");
		super.phoneNumber = scanner.nextLine();
		System.out.println("회사명을 입력하세요: ");
		this.company = scanner.nextLine();
		return new BusinessContact(name, phoneNumber, company);
	}

}
