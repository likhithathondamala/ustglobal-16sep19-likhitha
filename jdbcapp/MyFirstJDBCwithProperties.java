package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCwithProperties {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	FileReader reader = null;
	
	try {
		reader = new FileReader("db.properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		//step1 load the driver
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		Class.forName(prop.getProperty("driver-class-name"));
		 //step2 get the connection
		String url = prop.getProperty("url");
				
		conn = DriverManager.getConnection(url,prop);
		//step3-issue SQL query
		stmt = conn.createStatement();
		String sql = prop.getProperty("select-query");
		rs=stmt.executeQuery(sql);
		
		//step4- Read the result
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int sal = rs.getInt("sal");
			String gender = rs.getString("gender");
			System.out.println(" Id : " +id);
			System.out.println("Name : "+name);
			System.out.println("Sal : "+sal);
			System.out.println("Gender : "+gender );
			System.out.println("=============");
			}
	}catch (Exception e) {
			e.printStackTrace();
		}finally {
			//step5-close all JDBC objects
			try {
				if(conn!= null) {
					conn.close();
					
				}if(stmt!= null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
				if(reader!=null) {
					reader.close();
				}
				
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
		
		
	
}
}
