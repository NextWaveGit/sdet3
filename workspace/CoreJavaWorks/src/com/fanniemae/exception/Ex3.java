package com.fanniemae.exception;

public class Ex3 {
	
	private static int accntId=0;
	
	static {System.out.println("hello");}
	
	
	public int getAccntId() {
		return accntId;
	}


	public Ex3() {
		super();
		accntId = ++accntId;
		//System.out.println(accntId++);
	}


	public static void main(String args[]){
		Ex3 a = new Ex3();
		System.out.println(a.getAccntId());
		
		Ex3 b = new Ex3();
		System.out.println(b.accntId);
		
		Ex3 c = new Ex3();
		System.out.println(c.getAccntId());
		
	}

}
