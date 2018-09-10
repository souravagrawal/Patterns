package observer;

import java.util.ArrayList;
import java.util.List;

public class Raven {

	private List<ISubscriber> subscribes = new ArrayList<ISubscriber>();

	private String content;

	public Raven(String content) {
		this.content = content;
	}

	public void attachToList(ISubscriber subscriber) {
		this.subscribes.add(subscriber);
	}

	public void notifySubscribers() {
		for (ISubscriber subsriber : subscribes) {
			subsriber.showContent(this);
		}
	}
	
	public String getContent() {
		return content;
	}

}
