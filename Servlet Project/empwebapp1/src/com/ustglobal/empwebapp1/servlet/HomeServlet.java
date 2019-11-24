package com.ustglobal.empwebapp1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebapp1.dto.Employeeinfo;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session  = req.getSession(false);
		
		if(session!=null) {
			Employeeinfo info = (Employeeinfo)session.getAttribute("info");
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>Welcome "+info.getName());
	    out.println("</h1>");
	    out.println("<a href = './Search.html'>Search</a>");
	    out.println("<a href = './changepass.html'>Change Password</a>");
	    out.println("<a href = './logout'>Logout</a>");
		}else {
			RequestDispatcher dispatcher = 
					req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
	    
		
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}

}
