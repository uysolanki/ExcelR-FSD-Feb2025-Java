package day10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
//accept eno and increment amount, and increase the salary of the emp by the increment amount
//1 500 means increase salary of eno 1 by 500 rs
public class UpdateUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySqlConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno");
		int a=sc.nextInt();
		
		System.out.println("Enter increment");
		int b=sc.nextInt();
		
		String query="update myemp set salary=salary+? where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, b);
		ps.setInt(2, a);
		
		int rows=ps.executeUpdate();
		
		if(rows>0)
			System.out.println(rows  +" rows Updated");
		else
			System.out.println("No rows Updated");

	}

}
