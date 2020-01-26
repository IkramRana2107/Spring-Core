package beans;

import javax.annotation.Resource;
import javax.inject.Inject;

public class Car {
	
	// Autowiring by using byName
  //  @Resource
   
   // Autowiring by using byType 
     @Inject
	private Engine engine;
	public void printData()
	{
		System.out.println("EngineModelYear"+engine.getModelyear());
		
	}

}
