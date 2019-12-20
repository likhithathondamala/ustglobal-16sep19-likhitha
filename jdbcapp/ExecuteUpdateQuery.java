package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
public static void main(String[] args) {
	Connection conn = null;
	Statement stmt = null;
	
	//step1 load the driver
	try {
//	Driver driver = new Driver();
//	DriverManager.registerDriver(driver);
//	
	//step2 get the connection
	
	String url = 
			"jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	conn = DriverManager.getConnection(url);
	
	//step3 issue the SQL query
	
	String sql = "update Employee_info set name ='raju',sal = 48000,gender = 'm' where id = 5";
	stmt = conn.createStatement();
	int count2 = stmt.executeUpdate(sql);
	//step 4 read the result
	System.out.println(count2 + "rows affected");
	
	}catch(SQLException e){
		e.printStackTrace();
		
	}finally {
		try {
			if(conn!=null) {
				conn.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
}
