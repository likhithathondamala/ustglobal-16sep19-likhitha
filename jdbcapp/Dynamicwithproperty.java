package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.util.Properties;

//import com.mysql.jdbc.Driver;

public class Dynamicwithproperty {
public static void main(String[] args) {
		
		Connection conn = null;
	    PreparedStatement pstmt = null;
		FileReader reader= null;
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
			//step 1  load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			Class.forName(prop.getProperty("driver-class-name"));
			//step 2 get the connection
			
			String url = prop.getProperty("url");
					
			conn = DriverManager.getConnection(url,prop);
			
			//step 3 issue sql query
			
			String sql = prop.getProperty("insert-query");
			pstmt =conn.prepareStatement(sql);
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
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//step 5 close all the JDBC objects
		finally {
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
			}catch(Exception e ){
				e.printStackTrace();
			}
		}
		

	}//end main()

}
