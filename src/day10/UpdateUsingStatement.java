package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateUsingStatement {
	//update the salary to 5000 of emp no 1
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver"); //driver loading
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathyabamadb","root","");
		
		Statement st=con.createStatement();
		
		String query="update myemp set salary=5000 where eno=1";
		
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows  +" rows Updated");
		else
			System.out.println("No rows Updated");
	}

}
