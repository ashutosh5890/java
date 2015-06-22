package com.deepak.dao;

import java.sql.*;

import com.deepak.model.Student;

public class StudentService {
	
	Connection con;

	public void addStudent(Student st){
				
		try {
			con = MyConnection.createCon();
			System.out.println(con.hashCode()+"");
			String insertTableSQL = "INSERT INTO STUDENT"
					+ "( NAME, EMAIL, USERNAME, BIRTHDAY, GENDER, MOBILE, PASSWORD, JOINED) VALUES"
					+ "(?,?,?,?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(insertTableSQL);
			pstmt.setString(1, st.getName());
			pstmt.setString(2, st.getEmail());
			pstmt.setString(3, st.getUsername());
			pstmt.setDate(4, st.getBirthday());
			pstmt.setString(5, st.getGender());
			pstmt.setString(6, st.getMobile());
			pstmt.setString(7, st.getPassword());
			pstmt.setTimestamp(8, st.getJoined());
			
			int a = pstmt.executeUpdate();		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkStudent(String login, String password){
		boolean st = false;
		try {
			Connection con = MyConnection.createCon();
			System.out.println(con.hashCode()+"");
			String selectSQL = "SELECT * FROM STUDENT"
					+ " WHERE (USERNAME=? OR EMAIL=?) AND PASSWORD=?";
			
			PreparedStatement pstmt = con.prepareStatement(selectSQL);
			pstmt.setString(1, login);
			pstmt.setString(2, login);
			pstmt.setString(3, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			st = rs.next();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}
}
