import java.sql.*;
public class InsertValue
{
	public void insertValue()throws Exception
	{
		java.util.Scanner sc=new  java.util.Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter Dept");
		String dept=sc.next();
		System.out.println("Enter City");
		String city=sc.next();
		System.out.println("Enter Salary");
		String salary=sc.next();
		name="'"+name+"'";
		dept="'"+dept+"'";
		city="'"+city+"'";
		String query = "INSERT INTO kajal.Employees VALUES("+id+","+name+","+dept+","+city+","+salary+")";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
		rs.close();
		st.close();
		conn.close();
	}
}