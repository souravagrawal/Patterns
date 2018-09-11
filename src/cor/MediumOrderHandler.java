package cor;

public class MediumOrderHandler extends AbstractOrderHandler {

	public MediumOrderHandler(int price) {
		this.price = price;
	}
	
	@Override
	public void approvePurchase(int price) {
		super.approvePurchase(price);
		System.out.println("MediumOrderHandler.approvePurchase()");
	}
}
