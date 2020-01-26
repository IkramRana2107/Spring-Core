package beans;

public class Bus {
	private Engine engine;
	public void setEngine(Engine engine) {
		System.out.println("setter Engine");
		this.engine = engine;
	}
	 public Bus()
	{
		System.out.println("default constructor");
	}
	
	
	public Bus(Engine engine)
	{
	System.out.println("parameter bus constructor");
	this.engine=engine;	
	}
	public void printData()
	{
		System.out.println("Bus Engine Modelyear:="+engine.getModelyear());
	}

}
