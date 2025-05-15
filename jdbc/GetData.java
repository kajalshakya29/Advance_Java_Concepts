import java.sql.*;
import java.util.Properties;
import java.io.*;
 public class GetData
 {
	public void getExternal()throws Exception
	{
		//bring data from property file
		FileInputStream fis = new FileInputStream("details.txt");
		Properties prop = new Properties();
		prop.load(fis);
		String dpt = prop.getProperty("dept");
		dpt="'"+dpt+"'";
		String cty=prop.getProperty("city");
		cty="'"+cty+"'";
		String query="select* from kajal.Employees where edept="+dpt+"and ecity="+cty;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		rs.close();
		st.close();
		conn.close();
	}
 }