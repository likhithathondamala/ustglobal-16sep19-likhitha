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
@WebServlet("/changepassword")
public class ChangePasswordServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session!=null) {
			String pass = req.getParameter("newpassword");
			String confirmpass = req.getParameter("confirmpassword");
			if(pass.equals(confirmpass)) {
				Employeeinfo info = (Employeeinfo)session.getAttribute("info");
				EmployeeDAO dao = EmployeeDaoManagers.getEmployeeDAO();
				dao.ChangePassword(info.getId(),pass);
				RequestDispatcher dispatcher = req.getRequestDispatcher("/home");
				dispatcher.forward(req, resp);
				
			}else {
				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<h4> password not matching</h4>");
				out.println("</html>");
				RequestDispatcher dispatcher = req.getRequestDispatcher("/changepass.html");
			}
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
	}//end of doPost
}//end of ChangePasswordServlet
