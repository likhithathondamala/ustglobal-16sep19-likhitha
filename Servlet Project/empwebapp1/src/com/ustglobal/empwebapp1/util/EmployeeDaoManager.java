package com.ustglobal.empwebapp1.util;

import com.ustglobal.empwebapp1.dao.EmployeeDAO;
import com.ustglobal.empwebapp1.dao.EmployeeDAOJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {
		
	}
	public static EmployeeDAO getEmployeeDAO() {
		return new EmployeeDAOJdbcImpl();
	}
}
