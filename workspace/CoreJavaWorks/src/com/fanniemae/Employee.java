package com.fanniemae;

public class Employee {
	
	public Employee(){
	
	}
	private int empId;
	private String empName;
	private double empSal;
	
	public int getEmpId(){
		return empId;
	}

	public String getEmpName(){
		return empName;
	}

	public Double getEmpSal(){
		return empSal;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		if(empName.length()<5){
			System.out.println("Name too short");
		}
		this.empName = empName;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}


	
	
	

}
