package com.fanniemae.db;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fanniemae.dbworks.EmpBean;
import com.fanniemae.dbworks.EmployeeDB;

public class DBTest {

	static EmployeeDB edb = null;
	static EmpBean bean = null;
	
	
	@BeforeClass
	public static void empObjInit(){
		System.out.println("before once");
		edb = new EmployeeDB();
		bean = new EmpBean();
	}
	
	
	@Before
	public void beforeAllMethods(){
		System.out.println("before each");
	}
	
	@After
	public void afterAllMethods(){
		System.out.println("after each");
	}
	
	@Test(timeout=500)
	public void insertEmployeePassTest() {
		//fail("Not yet implemented");
		

		assertEquals("testing pass", true, edb.insertEmployee(bean));
		
	}

	@Test
	public void insertEmployeeFailTest() {
		//fail("Not yet implemented");
			
		assertNotEquals("testing fail", false, edb.insertEmployee(bean));
		
	}
}
