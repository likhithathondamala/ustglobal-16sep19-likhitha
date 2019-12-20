package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class DynamicUpdatewithProp {

public static void main(String[] args) {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	FileReader reader = null;
	try {
		reader = new FileReader("db.properties");
		Properties prop = new Properties();
		prop.load(reader);
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
	Class.forName(prop.getProperty("driver-class-name"));
		//step2 get the connection
		
		String url = prop.getProperty("url");
		conn = DriverManager.getConnection(url,prop);
		
		//step3 issue the SQL query
		
		String sql = prop.getProperty("update-query");
//		stmt = conn.createStatement();
		pstmt = conn.prepareStatement(sql);
		
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
		
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(reader!=null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	
}

}
