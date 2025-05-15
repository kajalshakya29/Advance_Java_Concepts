import java.sql.*;
import java.util.*;
import java.sql.Types;

public class CsTest 
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		String queryString="{?=call kajal.getEmpDetails(?,?,?)}";
		CallableStatement cs= conn.prepareCall(queryString);
		cs.registerOutParameter(1, Types.INTEGER);
		cs.registerOutParameter(3, Types.VARCHAR);
		cs.registerOutParameter(4, Types.VARCHAR);
		cs.setInt(2,1);
		cs.execute();
		System.out.println("name: "+cs.getInt(1)+"Desg: "+ cs.getString(3)+"Salary: "+cs.getString(4));
		cs.close();
		conn.close();
	}
	
}



