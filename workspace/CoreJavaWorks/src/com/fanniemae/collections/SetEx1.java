package com.fanniemae.collections;

import java.util.HashSet;

public class SetEx1 {
	
	public static void main(String args[]){
		HashSet<String> set = new HashSet<String>();
		
		
		set.add("Andy");
		set.add("Ann");
		set.add("Beecky");
		
		set.add("Andy");
		
		
		System.out.println(set);
	}

}
