package interfaceQuiz;

public class Cart{
	Product product = new Product();
	Product[] products;


	public Cart(Product[] products){
		this.products = products;
	}

	public int calculateDeliveryCharge() {
		int result =0;
		for(int i=0; i<products.length; i++){
			result += products[i].getDiscountAmount();
		}
		return result;
	}
}
