package cor;

public abstract class AbstractOrderHandler implements OrderHandler {

	protected int price;

	private AbstractOrderHandler orderHandler;

	public void setNextOrderHandler(AbstractOrderHandler nextOrderHandler) {
		this.orderHandler = nextOrderHandler;
	}

	@Override
	public void handleOrder(int price) {
		if (orderHandler != null && price > this.price) {
			orderHandler.handleOrder(price);
			return;
		}
		approvePurchase(price);
	}

	public void approvePurchase(int price) {
		System.out.println("Your Request is approved for purchase " + price);
	}

}
