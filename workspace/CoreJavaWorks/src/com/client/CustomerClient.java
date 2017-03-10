package com.client;

import com.fanniemae.*;

public class CustomerClient {
	
	public static void main(String[] args){
	
	Customer cust = new Customer();
	
	cust.setcId(101);
	
	Name name = new Name();
	name.setfName("peter");
	name.setlName("Scott");
	
	cust.setName(name);
	
	//cust.set(100000);
	
	System.out.println("Fname "+cust.getName().getfName());
	
	System.out.println(cust.toString());
	}
}
