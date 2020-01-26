package beans;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;


public class Test {
private String driver;
private String url;
private String user;
private String password;
public String getUrl() {
	return url;
}
@Required
public void setUrl(String url) {
	this.url = url;
}

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
@Required
public void setDriver(String driver) {
	this.driver = driver;
}

public void printConnection() throws Exception
{
	Class.forName(driver);
	Connection con=DriverManager.getConnection(url);
	System.out.println(con);
}

}
