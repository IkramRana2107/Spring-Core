package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	public static void main(String[] args) {
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("resource/spring.xml");
	// check xml document
	// it will create instances to singleton beans
	ap.getBean("t");
	ap.getBean("t");
	}

}
