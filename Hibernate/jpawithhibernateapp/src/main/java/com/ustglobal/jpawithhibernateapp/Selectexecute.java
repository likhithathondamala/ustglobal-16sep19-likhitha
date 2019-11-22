package com.ustglobal.jpawithhibernateapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selectexecute {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//step1 load the driver
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			 //step2 get the connection
			String url = 
					"jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url,"root","root");
			//step3-issue SQL query
			stmt = conn.createStatement();
			String sql = "select * from Employee_info";
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
					
				}catch(Exception e ) {
					e.printStackTrace();
				}
			}
			
			


	}

}
