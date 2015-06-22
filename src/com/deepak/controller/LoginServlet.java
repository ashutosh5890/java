package com.deepak.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deepak.dao.StudentService;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if(StudentService.checkStudent(login, password)){
			HttpSession session = request.getSession();
            session.setAttribute("user", "Pankaj");
            //setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30*60);
			RequestDispatcher rs = request.getRequestDispatcher("loginhome.jsp");
            rs.forward(request, response);
		}else{
			request.setAttribute("error","Invalid Username or Password");
			
            RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            rs.include(request, response);
		}
	}

}
