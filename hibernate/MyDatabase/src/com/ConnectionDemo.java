/**
 * 
 */
package com;
import java.sql.*;
import java.sql.SQLException;
/**
 * 
 */
public class ConnectionDemo {

	
	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		oracle.jdbc.driver.OracleDriver od = new oracle.jdbc.driver.OracleDriver();
		
		DriverManager.registerDriver(od);
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:kajal/kajal@localhost:1521:XE","System","system");
		
		if(conn!=null)
		{
			System.out.println("connection is establish");
		}
		else
		{
			System.out.println("connection is not establish");
		}

	}

}
