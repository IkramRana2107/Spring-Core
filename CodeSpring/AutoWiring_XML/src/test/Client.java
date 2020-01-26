package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Bus;

public class Client {
	public static void main(String s[]) throws Exception{
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring_autodetect.xml");
		Bus b=(Bus)ap.getBean("b");
		b.printData();
	}

}
