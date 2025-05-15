import java.sql.*;
import java.util.*;
public class InsertData
{
	public static void main(String[] args)throws Exception
	{
		Scanner s=new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("Enter Id");
		emp.setId(s.nextInt());
		System.out.println("Enter Name");
		emp.setName(s.next());
		System.out.println("Enter Dept");
		emp.setDept(s.next());
		System.out.println("Enter City");
		emp.setCity(s.next());
		System.out.println("Enter Salary");
		emp.setSalary(s.nextInt());
		String query = "INSERT INTO kajal.Employees VALUES("+emp.getId()+",'"+emp.getName()+"','"+emp.getDept()+"','"+emp.getCity()+"',"+emp.getSalary()+")";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		Statement st=conn.createStatement();
		int i=st.executeUpdate(query);
		if(i==0)
		{
			System.out.println("no record insert");
		}
		else
		{
			System.out.println("record insert");
		}
		st.close();
		conn.close();
	}
}