package beans;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
private List fruits;
private Set cricketers;
private Map cc;
public List getFruits() {
	return fruits;
}
public void setFruits(List fruits) {
	this.fruits = fruits;
}
public Set getCricketers() {
	return cricketers;
}
public void setCricketers(Set cricketers) {
	this.cricketers = cricketers;
}
public Map getCc() {
	return cc;
}
public void setCc(Map cc) {
	this.cc = cc;
}
public void printData()
{
	System.out.println("Fruits......");
	for(Object fruit:fruits)
	{
		System.out.println(fruit);
	}
	System.out.println("Cricketers......");
	for(Object cricketer:cricketers)
	{
		System.out.println(cricketer);
	}
	System.out.println("Country and Capitals......");
	Set keys=cc.keySet();
	for(Object key:keys)
	{
		System.out.println("Country: "+key+ " "  +"Capital: "+cc.get(key));
	}
}	

}

