package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.util.Properties;

public class DynamicDeletewithprop {
	public static void main(String[] args) {
		
		Connection conn =null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			reader = new FileReader("db.properties");
			Properties prop = new Properties();
			prop.load(reader);
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			String sql = prop.getProperty("delete-query");
			
			pstmt = conn.prepareStatement(sql);
			
//			String empid = args[0];
//			int id = Integer.parseInt(args[0]);
			pstmt.setInt(1, Integer.parseInt(args[0]));
			int count = pstmt.executeUpdate();
			//step 4 read the result
			System.out.println(count + "row deleted");
			
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
