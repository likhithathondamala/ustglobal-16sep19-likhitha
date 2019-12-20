package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.util.Properties;

public class InsertwithTryResources {
public static void main(String[] args) {
	try(FileReader reader = new FileReader("db.properties")){
	
		Properties prop1 = new Properties();
		prop1.load(reader);
	Class.forName(prop1.getProperty("driver-class-name"));
	String url = prop1.getProperty("url");
	String sql = prop1.getProperty("insert-query");
	try(Connection  conn = DriverManager.getConnection(url,prop1);
			PreparedStatement pstmt = conn.prepareStatement(sql))
	{
	
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1,id);
		String name = args[1];
		pstmt.setString(2, name);
		String empsal = args[2];
		int sal = Integer.parseInt(empsal);
		pstmt.setInt(3, sal);
		String gender = args[3];
		pstmt.setString(4, gender);
		
		int count = pstmt.executeUpdate();
		
		//step 4 read the result
		System.out.println(count + "rows inserted");
	}	
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}
}



