package quiz2;

public class PersonalContact extends Contact{
	private String relationship;

	PersonalContact(){
	}

	PersonalContact(String name, String phoneNumber, String relationship){
		super(name, phoneNumber);
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		return String.valueOf(super.toString() + ", 관계: " + relationship);
	}

	@Override
	public Contact add(){
		super.add();
		System.out.println("관계 입력하세요: ");
		this.relationship = scanner.nextLine();
		return new BusinessContact(super.getName(), super.getPhoneNumber(), relationship);
	}

}