package beans;

public class Car {
	private Engine engine;
	private String carname;
	public Car()
	{
		System.out.println("Car");
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void printCarData()
	{
		System.out.println("CanName="+carname);
		System.out.println("ModelYear="+engine.getModelyear());
	}

}
