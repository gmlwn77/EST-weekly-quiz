package interfaceQuiz;

public class Main {
	public static void main(String[] args) {
		Product beauty = new Beauty("beauty", 30000, 2); // 1000 - 1000
		Product grocery = new Grocery("grocery", 20000, 3); // 5000
		Product largeAppliance = new LargeAppliance("largeAppliance", 50000, 5); // 5000- 1000

		Cart cart = new Cart(new Product[] {beauty, grocery, largeAppliance});
		int totalDeliveryCharge = cart.calculateDeliveryCharge();
		System.out.println(totalDeliveryCharge);
	}
}