package com.ustglobal.mobilesimulator.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.mysql.jdbc.Driver;
import com.ustglobal.mobilesimulator.MobileApp;
import com.ustglobal.mobilesimulator.dto.Contactbean;

public class ContactDaoImpl implements ContactDao {

	@Override
	public List<Contactbean> showAllContacts() {
		String url ="jdbc:mysql://localhost:3306/mobileapp_db?user=root&password=root";
		String sql ="select * from contactfile";
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs =null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			
			stmt = conn.createStatement();
			rs= stmt.executeQuery(sql);
			ArrayList<Contactbean> result = new ArrayList<>();
			
			while(rs.next()) {
				Contactbean bean = new Contactbean();
				
				String  name = rs.getString("name");
				bean.setName(name);
				
				long phoneno = rs.getLong("phoneno");
				bean.setPhoneno(phoneno);
				
				String groupname = rs.getString("groupname");
				bean.setGroupname(groupname);
				
				result.add(bean);
				} //end of while loop
			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} //end of try -catch block
		finally {
			try { if(conn!=null)
			{
				conn.close();
			}
			if(stmt!=null)
			{
				stmt.close();
			}
			if(rs!=null)
			{
				rs.close();
			}


			} catch (Exception e2) {
				e2.printStackTrace();
			} //end of try-catch block
		} //end of finally


	}
		
	
		
	

	@Override
	public Contactbean searchContact(String name) {
		String url ="jdbc:mysql://localhost:3306/mobileapp_db?user=root&password=root";
		String sql ="select * from contactfile where name =?";
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =  DriverManager.getConnection(url);
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				Contactbean bean = new Contactbean();
				bean.setName(rs.getString("name"));
				bean.setPhoneno(rs.getLong("phoneno"));
				bean.setGroupname(rs.getString("groupname"));
				return bean;
			}
			else {
				return null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		} finally {
			try {
				if(con!=null)
				{
					con.close();
				}
				if(pstmt!=null)
				{
					pstmt.close();
				}
				if(rs!=null)
				{
					rs.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
				
			} //end of try catch block
		}
		
	}

	

	@Override
	public void call() {
		System.out.println("Calling To ->"+"Call ended");		
	}

	@Override
	public void message() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Write a message");
		String str= scn.nextLine();
		System.out.println(str+"The message has been sending"+".......");
		System.out.println("Sended");
		
	}
	

	@Override
	public void goBack() {
	MobileApp ap = new MobileApp();
	ap.main(null);
	}

	@Override
	public void operateOnContact() {
		System.out.println("Press 1 to add new contact");
		System.out.println("Press 2 to delete contact");
		System.out.println("Press 3 to edit contact");
	}

	@Override
	public int[] insertContact() {
		String url = "jdbc:mysql://localhost:3306/mobileapp_db?user=root&password=root";
		String sql ="insert into contactfile values(?,?,?)";
		try(FileReader in = new FileReader("csv.txt");
				BufferedReader reader = new BufferedReader(in);
				Connection con =DriverManager.getConnection(url);
				PreparedStatement pstmt = con.prepareStatement(sql)){
			while(reader.ready())
			{
				String line = reader.readLine();
				String[]  datas = line.split(",");
				String name = datas[0];
				long phoneno = Long.parseLong(datas[1]);
				String groupname= datas[2];
				
				pstmt.setString(1, name);
				pstmt.setLong(2, phoneno);
				pstmt.setString(3, groupname);
				
				pstmt.addBatch();
			
			} //end of while loop
			int[] counts = pstmt.executeBatch();
			return counts;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}//end of try catch block
	}


	

	@Override
	public int deleteContact() {
		Connection con = null;
		Statement stmt = null;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name to delete contact");
		String name =s.next();
		
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3306/mobileapp_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			
			String sql = "delete from contactfile where name="+"'"+name+"'";
			stmt = con.createStatement();
			int count = stmt.executeUpdate(sql);
			return count;
		}catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
		finally {
			s.close();
			try {
			if(con!=null)
			{
				con.close();
			}
			if(stmt!=null)
			{
				stmt.close();
			}
			} catch (SQLException e) {

			e.printStackTrace();
			}
		}
	}

	@Override
	public int editContact() {
		Connection con = null;
		Statement stmt = null;
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter contact to edit");
		long contact1 = s1.nextLong();
		System.out.println("Enter name to edit");
		String str= s1.next();
		
		

		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			String url = "jdbc:mysql://localhost:3306/mobileapp_db?user=root&password=root";
			con = DriverManager.getConnection(url);
			
			String sql ="update contactfile set phoneno ="+contact1+" where name="+"'"+str+"'";
			stmt = con.createStatement();
			
			int count = stmt.executeUpdate(sql);
			return count;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}

		finally {
			try {
				if(con!=null)
				{
					con.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
	}	

}
