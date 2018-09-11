package cor;

public class HighOrderPurchaseHandler extends AbstractOrderHandler {

	public HighOrderPurchaseHandler(int price) {
		this.price = price;
	}
	
	@Override
	public void approvePurchase(int price) {
		super.approvePurchase(price);
		System.out.println("HighOrderPurchaseHandler.approvePurchase()");
	}
}
