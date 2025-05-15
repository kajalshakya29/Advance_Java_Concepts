import java.util.*;
import java.sql.*;
import oracle.jdbc.*;
public class CursorTest 
{
	public static void main(String[] args) throws Exception
	{
		// read i/p values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name");
		String city = sc.next();
		// load jdbc driver class and create jdbc connection obj
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		
		// create jdbc collabaleStatement obj
		String query="{call kajal.getStudDetails(?,?)}";
		
		CallableStatement cs = conn.prepareCall(query);
		
		//register with out param with jdbc type
		cs.registerOutParameter(2,OracleTypes.CURSOR);
		
		//set values to in parameter
		cs.setString(1,city);
		
		//call pl/sql procedure
		
		cs.execute();
		
		//collect result from out parameter
		ResultSet rs = (ResultSet)cs.getObject(2);
		
		//process the result
		while (rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		rs.close();
		cs.close();
		conn.close();
		}
}
