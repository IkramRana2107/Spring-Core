package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Client {
	public static void main(String s[]) throws Exception{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
		Bank b=(Bank)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		b.deposit();
		b.wirhdraw();
		b.calInt();
		
			}
}
