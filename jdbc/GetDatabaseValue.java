import java.sql.*;
public class GetDatabaseValue
{
	public void takeValue() throws Exception
	{
		// taking value from user
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter dept name");
		String empDept = sc.next();
		empDept="'"+empDept+"'";
		
		String query="select* from kajal.Employees where edept =" + empDept;
		System.out.println(query);
		
		//Connection Establishmet
		
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