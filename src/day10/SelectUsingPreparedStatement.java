package day10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
//accept ename and display his/her details
public class SelectUsingPreparedStatement {
public static void main(String[] args) throws Exception
{
	
	Connection con=MySqlConnection.getConnection();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ename");
	String a=sc.next();
	
	String query="select * from myemp where ename like ?";
	
	PreparedStatement ps=con.prepareStatement(query);
	
	ps.setString(1, a);
	
	ResultSet rs=ps.executeQuery();
	System.out.println(String.format("%-15s", "Emp Number") +String.format("%-10s", "Emp Name") + String.format("%-10s", "Salary"));
	System.out.println(String.format("%-15s", "----") +String.format("%-10s", "-------") + String.format("%-10s", "-------"));
	while(rs.next())
	{
		System.out.println(String.format("%-15d", rs.getInt("eno")) +String.format("%-10s", rs.getString("ename")) + String.format("%-10d", rs.getInt("salary")));
	}
	
	rs.close();
	ps.close();
	con.close();
}
}
