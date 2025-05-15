import java.sql.*;
import java.io.*;
public class ReadImage*
{
public static void main(String[]args)throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn=DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
	String query="select *from kajal.InsertImage where id=?";
	PreparedStatement ps=conn.prepareStatement(query);
	ps.setInt(1,110);
	ResultSet rs=ps.executeQuery();
	while(rs.next())
		{
		String id=rs.getString(1);
		Blob bl=rs.getBlob(2);
		byte barr[]=bl.getBytes(1,(int)bl.length());
		FileOutputStream fos=new FileOutputStream("d:\\download2.jpg");
			fos.write(barr);
			fos.close();
			
		}
	}
}