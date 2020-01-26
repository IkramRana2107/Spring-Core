package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Car;



public class Client {

	public static void main(String[] args) {
	// String files[]=new String[]{"resource/car.xml","resource/engine.xml"};
	// ApplicationContext ap=new ClassPathXmlApplicationContext(files);
	   ApplicationContext ap=new ClassPathXmlApplicationContext("resource/car-engine.xml");
	Car c=(Car)ap.getBean("c");
	c.printCarData();
	}

}
