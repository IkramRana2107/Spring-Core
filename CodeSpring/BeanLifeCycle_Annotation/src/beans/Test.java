package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Test {
private String driver,url,username,pwd;
private Connection con;

public void setUrl(String url) {
	this.url = url;
}
public void setUsername(String username) {
	this.username = username;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public void setDriver(String driver) {
	this.driver = driver;
}
@PostConstruct
public void conInit() throws Exception {	
	Class.forName(driver);
	con=DriverManager.getConnection(url,username,pwd);
	System.out.println("Connection Opened");
}
public void save(int id,String name,String email,String address) throws Exception
{
	 PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setString(3, email);
	ps.setString(4, address);
	ps.executeUpdate();
	System.out.println("Insertion Success");
}
@PreDestroy
public void conCleanup() throws Exception {
con.close();
 System.out.println("Connection Close");	
}

}
