package com.ustglobal.empwebapp1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

import com.ustglobal.empwebapp1.dto.Employeeinfo;

public class EmployeeDAOJdbcImpl implements EmployeeDAO {
	private final String URL = "jdbc:mysql://localhost:3306/ust_ty_web_db?user=root&password=root";
	private static final String DRIVER_CLASS_NAME= "com.mysql.jdbc.Driver";
	private static final String SELECT ="select * from employee_info where id = ?";
	private static final String UPDATE = "update employee_info set password =? where id = ?";
	private static final String INSERT = "insert into employee_info values(?,?,?,?)";

	@Override
	public Employeeinfo auth(int id, String password) {
		Employeeinfo  info = searchEmployee(id);
		if(info!=null) {
			String pass = info.getPassword();
			if(pass.equals(password)) {
				return info;
			}else {
				return null;
			}
		}
		return null;
	}

	@Override
	public Employeeinfo searchEmployee(int id) {

		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(URL);
					PreparedStatement pstmt = conn.prepareStatement(SELECT)){
				pstmt.setInt(1, id);
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						Employeeinfo info = new Employeeinfo();
						info.setId(rs.getInt("id"));
						info.setName(rs.getString("name"));
						info.setEmail(rs.getString("email"));
						info.setPassword(rs.getString("password"));
						
						return info;
					}else {
						return null;
					}
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	

	@Override
	public boolean ChangePassword(int id, String password) {
		try {
		Class.forName(DRIVER_CLASS_NAME);
		try(Connection conn = DriverManager.getConnection(URL);
				PreparedStatement pstmt = conn.prepareStatement(UPDATE )){
			pstmt.setString(1, password);
			pstmt.setInt(2, id);
			int count = pstmt.executeUpdate();
			boolean check = count>0? true :  false;
			return check;
		}
	}catch(Exception e) {
		e.printStackTrace();
		return false;
	}
	
	}

	@Override
	public boolean registerEmployee(Employeeinfo info) {
		

		try {
			Class.forName(DRIVER_CLASS_NAME);
			try(Connection conn = DriverManager.getConnection(URL);
					PreparedStatement pstmt = conn.prepareStatement(INSERT)){
				pstmt.setInt(1, info.getId());
				pstmt.setString(2, info.getName());
				pstmt.setString(3, info.getEmail());
				pstmt.setString(4, info.getPassword());

				int count = pstmt.executeUpdate();
				if(count>0) {
					return true;
				}else {
					return false;
				}
			}

		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}//end of register


}//end of class
