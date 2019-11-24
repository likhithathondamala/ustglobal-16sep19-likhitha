package com.ustglobal.empwebapp1.util;

import com.ustglobal.empwebapp1.dao.EmployeeDAO;
import com.ustglobal.empwebapp1.dao.EmployeeDAOJdbcImpl;

public class EmployeeDaoManagers {
private EmployeeDaoManagers() {
	
}
public static EmployeeDAO getEmployeeDAO() {
	return new EmployeeDAOJdbcImpl();
}
}
