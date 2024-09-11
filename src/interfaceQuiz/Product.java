package interfaceQuiz;

public class Product implements Promotion {
	String name;
	int price;
	int weight;
	int delivery;

	public int getDiscountAmount(){
		if(weight<3){
			delivery = 1000;
		} else if(weight>=3 && weight<10) {
			delivery = 5000;
		} else {
			delivery = 10000;
		}

		if(price+delivery <30000){
			return delivery;
		} else if(price+delivery >= 30000 && price+delivery < 100000){
			return delivery-1000;
		} return 0;
	}
}