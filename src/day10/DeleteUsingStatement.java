package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUsingStatement {
//delete the record of eno 5
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver"); //driver loading
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathyabamadb","root","");
		
		Statement st=con.createStatement();
		
		String query="delete from myemp where eno=5";
		
		int rows=st.executeUpdate(query);
		
		if(rows>0)
			System.out.println(rows  +" rows Deleted");
		else
			System.out.println("No rows Deleted");
	}

}
