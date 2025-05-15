package com;
import java.sql.*;

public class MyConnection1{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn= DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		if(conn!=null)
		{
			System.out.println("Connection build");
		}
		else
		{
			System.out.println("Connection failed");

		}
	}

}
