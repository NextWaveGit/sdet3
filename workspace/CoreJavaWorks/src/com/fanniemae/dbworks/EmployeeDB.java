package com.fanniemae.dbworks;


public class EmployeeDB {
	
	public boolean insertEmployee(EmpBean bean){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	public EmpBean getEmployee(){
		return new EmpBean();
	}

}
