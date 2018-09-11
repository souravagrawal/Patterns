package cor;

public class ExceptionOrderHandler extends AbstractOrderHandler {

	public ExceptionOrderHandler(int price) {
		this.price = price;
	}
	
	@Override
	public void approvePurchase(int price) {
		super.approvePurchase(price);
		System.out.println("ExceptionOrderHandler.approvePurchase()");
	}
}
