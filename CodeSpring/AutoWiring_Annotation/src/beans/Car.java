package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Qualifier(value="e1")
	@Autowired
	private Engine engine;
	// no need to have setter or constructor 
	public void printData()
	{
		System.out.println("EngineModelYear"+engine.getModelyear());
		
	}

}
