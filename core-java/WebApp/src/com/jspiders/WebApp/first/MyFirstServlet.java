package com.jspiders.WebApp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException 
	{
		Date date=new Date();
		PrintWriter out = resp.getWriter();
		out.println("current Date & Time:" +date);
	}

}
