package com.client;

public class SomeLogic {
	
	static{
		System.out.println("some logi");
		
		try {
			Class.forName("com.clients.SomeLogic");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
