package beans;

import javax.annotation.Resource;
import javax.inject.Named;
@Named
public class Car {
	@Resource
	private Engine engine;
	public void printEng()
	{
		System.out.println("EngineName="+engine.getEngname());
		
	}

}
