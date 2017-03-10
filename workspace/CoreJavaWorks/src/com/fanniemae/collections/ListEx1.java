package com.fanniemae.collections;

import java.util.ArrayList;

public class ListEx1 {
	
	public static void main(String args[]){
		ArrayList list = new ArrayList();
		
		list.add("hi");
		list.add(122);
		list.add(true);
		
		for (Object temp : list){
			System.out.println(temp);
		}
	}

}
