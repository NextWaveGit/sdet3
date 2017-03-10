package com.fanniemae.db;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fanniemae.dbworks.EmpBean;
import com.fanniemae.dbworks.EmployeeDB;

public class DBTest1 {

	static EmployeeDB edb = null;
	static EmpBean bean = null;
	
	
	@BeforeClass
	public static void empObjInit(){
		System.out.println("before once");
		edb = new EmployeeDB();
		bean = new EmpBean();
	}
	
	
	@Test(timeout=500)
	public void getEmployeeNotNullTest() {
		//fail("Not yet implemented");
		

		assertNotNull("testing not null ", edb.getEmployee());
		
	}

	@Test(timeout=500)
	public void gettEmployeeNullTest() {
		//fail("Not yet implemented");
		

		assertNull("testing null ", edb.getEmployee());
		
	}
}
