package com.insurance.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");  
			/*Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from patient");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();*/  
		} catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}

