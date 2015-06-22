package com.deepak.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deepak.dao.StudentService;
import com.deepak.model.Student;


@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dob = request.getParameter("BirthYear")+"-"+request.getParameter("BirthMonth")+"-"+request.getParameter("BirthDay");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date parsed;
        java.sql.Date sql = null;
		try {
			parsed = format.parse(dob);
			sql = new java.sql.Date(parsed.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		
		java.util.Date today = new java.util.Date();
		java.sql.Timestamp joined = new java.sql.Timestamp(today.getTime());
        
        
		Student st = new Student();
		st.setName(request.getParameter("name"));
		st.setEmail(request.getParameter("email"));
		st.setBirthday(sql);
		st.setUsername(request.getParameter("username"));
		st.setGender(request.getParameter("gender"));
		st.setPassword(request.getParameter("password"));
	    st.setMobile(request.getParameter("phone"));
		st.setJoined(joined);
		
		StudentService str = new StudentService();
		str.addStudent(st);
	}

}
