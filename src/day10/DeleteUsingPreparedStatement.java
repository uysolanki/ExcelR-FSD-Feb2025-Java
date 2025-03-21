package day10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		Connection con=MySqlConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter eno");
		int a=sc.nextInt();
		
		String query="delete from myemp where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, a);
		
		int rows=ps.executeUpdate();
		
		if(rows>0)
			System.out.println(rows  +" rows Deleted");
		else
			System.out.println("No rows Deleted");

	}
}
