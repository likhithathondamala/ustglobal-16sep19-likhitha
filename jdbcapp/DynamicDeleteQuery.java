package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
public static void main(String[] args) {
	
	Connection conn =null;
	PreparedStatement pstmt = null;
	
	try {
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(url);
		String sql = "delete from Employee_info where id = ?";
		
		pstmt = conn.prepareStatement(sql);
		
//		String empid = args[0];
//		int id = Integer.parseInt(args[0]);
		pstmt.setInt(1, Integer.parseInt(args[0]));
		int count = pstmt.executeUpdate();
		//step 4 read the result
		System.out.println(count + "row deleted");
		
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	
		
		
		
	}
}

