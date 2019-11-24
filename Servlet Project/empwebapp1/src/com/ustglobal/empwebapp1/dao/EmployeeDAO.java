package com.ustglobal.empwebapp1.dao;

import com.ustglobal.empwebapp1.dto.Employeeinfo;

public interface EmployeeDAO {
public Employeeinfo auth(int id ,String password);
 
public Employeeinfo searchEmployee(int id);

public boolean ChangePassword(int id,String password);

public boolean registerEmployee(Employeeinfo info);
}
