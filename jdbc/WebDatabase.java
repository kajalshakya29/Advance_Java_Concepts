import java.sql.*;
public class WebDatabase
{
	public void webDb() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		String query = "INSERT INTO kajal.MACHINE(id, name, dept, city) VALUES (?, ?, ?, ?)";
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		rs.close();
		st.close();
		conn.close();
	}
}