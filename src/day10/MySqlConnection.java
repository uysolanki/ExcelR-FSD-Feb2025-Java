package day10;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection {
	
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver"); //driver loading
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathyabamadb","root","");
		
		return con;	
	}

}
