package observer;

public class SendRaven {

	public static void main(String[] args) {
		Raven raven = new Raven("Winter is coming!!");
		new Subscriber("John Snow",raven);
		new Subscriber("Denerys Targarian",raven);
		new Subscriber("Tyrion Lannister",raven);
		new Subscriber("Jammie Lannister",raven);
		raven.notifySubscribers();
	}

}
