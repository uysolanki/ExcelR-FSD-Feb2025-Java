package day10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver"); //driver loading
		
		//estb connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sathyabamadb","root","");  

		//verifying the connection
		System.out.println(con.isClosed());
		
		//preparing the query
		String query="create table myemp(\r\n"
				+ "eno int(5) primary key,\r\n"
				+ "ename varchar(20),\r\n"
				+ "salary int(5))";
		
		Statement st=con.createStatement();
		
		st.execute(query);
		
		System.out.println("Table Created");
		
		st.close();
		con.close();
	}

}
