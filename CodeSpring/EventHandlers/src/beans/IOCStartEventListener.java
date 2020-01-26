package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class IOCStartEventListener implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent cse) {
		System.out.println("On IOC Start..method");

		
	}

}
