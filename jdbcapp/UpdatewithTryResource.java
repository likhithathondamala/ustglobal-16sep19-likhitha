package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.Properties;

public class UpdatewithTryResource {
public static void main(String[] args) {
	try (FileReader reader = new FileReader("db.properties"))
	{
		Properties prop = new Properties();
		prop.load(reader);
	Class.forName(prop.getProperty("driver-class-name"));
	String url = prop.getProperty("url");
	String sql = prop.getProperty("update-query");
	try(Connection  conn = DriverManager.getConnection(url,prop);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
		String empid = args[0];
		int id = Integer.parseInt(empid);
		
		String name = args[1];
		
		String empsal = args[2];
	    int sal = Integer.parseInt(empsal);
	    
	    String gender = args[3];
	  
	    pstmt.setInt(4,id);
	    pstmt.setString(1, name);
	    pstmt.setString(3, gender);
	    pstmt.setInt(2, sal);
	    
	    
		int count = pstmt.executeUpdate();
		//step 4 read the result
		System.out.println(count + "row updated");
		
	}
	
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
