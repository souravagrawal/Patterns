package cor;

public class SmallOrderHandler extends AbstractOrderHandler {

	public SmallOrderHandler(int price) {
		this.price = price;
	}
	
	@Override
	public void approvePurchase(int price) {
		super.approvePurchase(price);
		System.out.println("SmallOrderHandler.approvePurchase()");
	}
}
