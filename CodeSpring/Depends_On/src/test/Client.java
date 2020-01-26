package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String s[]) throws Exception{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	}

}
