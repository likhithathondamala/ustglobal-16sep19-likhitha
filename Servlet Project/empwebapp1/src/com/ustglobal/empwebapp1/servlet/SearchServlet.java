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

import com.ustglobal.empwebapp1.dao.EmployeeDAO;
import com.ustglobal.empwebapp1.dto.Employeeinfo;
import com.ustglobal.empwebapp1.util.EmployeeDaoManagers;
@WebServlet("/search")
public class SearchServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session==null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
			dispatcher.forward(req, resp);
		}
		int id  = Integer.parseInt(req.getParameter("id"));
		EmployeeDAO dao = EmployeeDaoManagers.getEmployeeDAO();
		Employeeinfo info = dao.searchEmployee(id);

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<a href ='./home'>Home</a>");
		out.println("<a href ='/logout' style='float:right'>Logout</a>");
		
		if(info!=null) {
		out.println("<table>");
		out.println("<tr>");
		out.println("<th>Id</th><th>Name</th><th>Email</th>");

		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>");
		out.println(info.getId());
		out.println("</td>");
		out.println("<td>");
		out.println(info.getName());
		out.println("</td>");
		out.println("<td>");
		out.println(info.getEmail());
		out.println("</td>");
		out.println("</tr>");
		out.println("</table>");
		}else {
			out.println("<h2>Data Not Found</h2>");
		}

		out.println("</body>");
		out.println("</html>");


	}
}
