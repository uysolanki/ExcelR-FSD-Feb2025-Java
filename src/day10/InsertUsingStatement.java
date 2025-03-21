package day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertUsingStatement {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver"); //driver loading
		
		//estb connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathyabamadb","root","");
		
		Statement st=con.createStatement();
		String query1="insert into myemp values(3,'Chris',900)";
		st.addBatch(query1);
		String query2="insert into myemp values(4,'David',1000)";
		st.addBatch(query2);
		String query3="insert into myemp values(5,'Elcid',1100)";
		st.addBatch(query3);
		
		
		int rows[]=st.executeBatch();
		
		if(rows.length>0)
			System.out.println(rows.length  +" rows Inserted");
		else
			System.out.println("No rows Inserted");
	}

}
