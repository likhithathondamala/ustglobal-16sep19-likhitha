package com.ustglobal.jpawithhibernateapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicInsert {
public static void main(String[] args) {
		
		Connection conn = null;
	    PreparedStatement pstmt = null;
		
		try {
			//step 1  load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 get the connection
			
			String url = 
					"jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3 issue sql query
			
			String sql = "insert into Employee_info"
					+" values(?,?,?,?) ";
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
			
			
		}catch(SQLException e) {
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
			}catch(SQLException e ){
				e.printStackTrace();
			}
		}
		

	}//end main()

}
