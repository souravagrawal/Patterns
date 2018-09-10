package observer;

public class AbstractSubscribers implements ISubscriber {

	protected String name;

	@Override
	public void showContent(Raven newsLetter) {
		System.out.println(String.format("Hello %s, %s", name, newsLetter.getContent()));
	}

}
