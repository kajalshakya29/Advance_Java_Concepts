import java.sql.*;

 public class ClassConnection
 {
	public static final Statement getStatement(String uname,String upswd)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		//Statement st=new Statement();
		Statement st=conn.createStatement();
		return st;
	}
}