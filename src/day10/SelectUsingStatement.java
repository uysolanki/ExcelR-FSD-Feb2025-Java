package day10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//display name and salary of emps whose salary > 1000
public class SelectUsingStatement {
public static void main(String[] args) throws Exception
{
	Connection con=MySqlConnection.getConnection();
	
	Statement st=con.createStatement();
	
	String query="select salary,ename from myemp where salary>1000";
	
	ResultSet rs=st.executeQuery(query);
	System.out.println(String.format("%-10s", "Emp Name") + String.format("%-10s", "Salary"));
	System.out.println(String.format("%-10s", "-------") + String.format("%-10s", "-------"));
	while(rs.next())
	{
		System.out.println(String.format("%-10s", rs.getString("ename")) + String.format("%-10d", rs.getInt("salary")));
	}
	
	rs.close();
	st.close();
	con.close();
}
}

/*
Alice5000
Ben1400

Alice  5000
Ben    1400
*/