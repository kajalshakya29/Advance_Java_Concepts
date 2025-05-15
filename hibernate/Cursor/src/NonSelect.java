import java.sql.*;
import java.util.*;

public class NonSelect 
{
	public static void main(String[] args) throws Exception
	{
		
		//read i/p values
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee city name");
		String city=sc.next();
		
		//load jdbc driver class and create connection object
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		
		//create collableStatement obj
		
		CallableStatement cs = conn.prepareCall("{call kajal.fireEmployees(?,?)}");
		
		//register out param with JDBC types
		
		cs.registerOutParameter(2, Types.INTEGER);
		cs.setString(1,city);
		
		//call pl/sql procedure
		cs.execute();
		
		//collect result from OUT parameter
		
		System.out.println("No of record affected by this query are :"+cs.getInt(2));
		
		//close jdbc object
		
		cs.close();
		conn.close();
	}
}
