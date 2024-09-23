package quiz2;

public class BusinessContact extends Contact{
	private String company;

	BusinessContact(){
	}

	BusinessContact(String name, String phoneNumber, String company) {
	super(name, phoneNumber);
	this.company = company;
	}

	@Override
	public String toString() {
		return String.valueOf(super.toString()+ ", 회사명: " + company);
	}

	@Override
	public Contact add(){
		super.add();
		System.out.println("회사명을 입력하세요: ");
		this.company = scanner.nextLine();
		return new BusinessContact(super.getName(), super.getPhoneNumber(), company);
	}

}
