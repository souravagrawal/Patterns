package cor;

public class CORDemo {

	public static void main(String[] args) {
		AbstractOrderHandler smallOrderHandler = new SmallOrderHandler(10);
		AbstractOrderHandler mediumOrderHandler = new MediumOrderHandler(20);
		AbstractOrderHandler highOrderHandler = new HighOrderPurchaseHandler(50);
		AbstractOrderHandler exceptionOrderHandler = new ExceptionOrderHandler(Integer.MAX_VALUE);
		smallOrderHandler.setNextOrderHandler(mediumOrderHandler);
		mediumOrderHandler.setNextOrderHandler(highOrderHandler);
		highOrderHandler.setNextOrderHandler(exceptionOrderHandler);
		
		smallOrderHandler.handleOrder(100000);
		
	}

}
