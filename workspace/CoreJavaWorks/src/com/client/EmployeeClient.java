package com.client;

import com.fanniemae.Employee;

public class EmployeeClient {
	public static void main(String[] args){
		
		Employee emp1;
		emp1 = new Employee();
		
		emp1.setEmpId(101);
		emp1.setEmpName("Sco");
		emp1.setEmpSal(100000);
		
		System.out.println("EmpId " + emp1.getEmpId());
		System.out.println("EmpName " + emp1.getEmpName());
		System.out.println("EmpSar " + emp1.getEmpSal());
		
		System.out.println(emp1.toString());
	}

}
