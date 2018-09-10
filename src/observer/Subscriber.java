package observer;

public class Subscriber extends AbstractSubscribers {

	public Subscriber(String name, Raven raven) {
		this.name = name;
		raven.attachToList(this);
	}
	
	@Override
	public void showContent(Raven newsLetter) {
		super.showContent(newsLetter);
		System.out.println("Brace yourself " + name);
	}
}
