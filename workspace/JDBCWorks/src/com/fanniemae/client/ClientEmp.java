package com.fanniemae.client;

import com.fanniemae.beans.Employee;
import com.fanniemae.dao.EmployeeDAO;
import com.fanniemae.interfaces.IEmployeeDAO;

public class ClientEmp {
	public static void main(String[] args) {
		IEmployeeDAO dao = new EmployeeDAO();

		
		/*System.out.println(dao.insertEmployee(
			new Employee(" Suresh", 223344, "Suresh@fanniemae.com")));
		*/
		
//		Employee emp = dao.getEmp(2);
//		
//		System.out.println("emp id " + emp.getEmpId());
//		System.out.println("Emp Name " + emp.getEmpName());
//		System.out.println("Emp Sal " + emp.getEmpSal());
//		System.out.println("Emp Email " + emp.getEmpEmail());
//		
		
		
		//System.out.println(dao.deleteEmp(1));
		
		
		for(Employee emp : dao.getAllEmps()){
			System.out.println(emp);
		}
		
		//dao.updateEmp(2, 600000);
		
		
	}
}
