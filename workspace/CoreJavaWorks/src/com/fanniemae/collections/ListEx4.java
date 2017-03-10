package com.fanniemae.collections;

import java.util.Vector;

public class ListEx4 {
	
	public static void main(String args[]){
		Vector<String> vec = new Vector<String>(5, 3);
		
		System.out.println("Initial capacity "+ vec.capacity());
		System.out.println("Initial size "+ vec.size());
		
		vec.add("One");
		vec.add("One");
		vec.add("One");
		vec.add("One");
		vec.add("Five");

		System.out.println("Initial capacity "+ vec.capacity());
		System.out.println("Initial size "+ vec.size());
		
		vec.add("One");
		vec.add("One");
		vec.add("One");
		vec.add("One");
		vec.add("Ten");	
		vec.add("11");

		System.out.println("Initial capacity "+ vec.capacity());
		System.out.println("Initial size "+ vec.size());
	
		
		

	}

}
