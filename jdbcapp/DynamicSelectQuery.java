     package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Exception;
//import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class DynamicSelectQuery {

		
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	String sql = "select * from Employee_info where id = ?";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
//		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url);
		
		pstmt = conn.prepareStatement(sql);
		
		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(1, id);
		
		rs=pstmt.executeQuery();
		
		if(rs.next()) {
			int emp_id = rs.getInt("id");
			String ename = rs.getString("name");
			int esal = rs.getInt("sal");
			String gen = rs.getString("gender");
			
			System.out.println("id is " +emp_id);
			System.out.println("Name is "+ename);
			System.out.println("Salary is "+esal);
			System.out.println("Gender is "+gen);
			System.out.println("============");
		}
		
		
	
		
		
	}catch(Exception e ) {
		e.printStackTrace();
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
}

}
