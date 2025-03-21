package day10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySqlConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno");
		int a=sc.nextInt();
		
		System.out.println("Enter ename");
		String b=sc.next();
		
		System.out.println("Enter Salary");
		int c=sc.nextInt();
		
		String query="insert into myemp values(?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setInt(1, a);
		ps.setString(2, b);
		ps.setInt(3, c);
		
		int rows=ps.executeUpdate();
		
		if(rows>0)
			System.out.println(rows  +" rows Inserted");
		else
			System.out.println("No rows Inserted");

	}

}
