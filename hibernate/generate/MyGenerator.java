package com.hibernate.generate;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyGenerator implements IdentifireGenerator{
	//@override
	public Serializable generator (SessionImplementor si, Object o)
	{
		String id = "";
		try {
			Connection con = si.connection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select new_sequence.nextual from dual");
			while(rs.next())
			{
				int = i=rs.getInt();
				if(i<=9)
					id=
			}
		}
	}
	

}
