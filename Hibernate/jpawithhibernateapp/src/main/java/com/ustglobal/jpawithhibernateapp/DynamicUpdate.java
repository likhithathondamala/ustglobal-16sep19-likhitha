package com.ustglobal.jpawithhibernateapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicUpdate {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step2 get the connection
			
			String url = 
					"jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step3 issue the SQL query
			
			String sql = "update Employee_info set name =?,sal =?,gender = ? where id = ?";
//			stmt = conn.createStatement();
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
