package com.fanniemae.collections;

import java.util.HashSet;
import java.util.Set;

public class WildCardEx {
	
	
	public static void display(Set<? extends Number> set){
		for (Number temp:set)
		{
			System.out.println(temp);
		}
	}

	public static void main(String args[]){
		Set<? extends Number> set;

		Set<Integer> iSet= new HashSet<Integer>();

		iSet.add(200);
		iSet.add(100);
		
		set = iSet;

		Set<Double> dSet= new HashSet<Double>();

		dSet.add(200d);
		dSet.add(100d);
		
		
		Set<String> sSet = new HashSet<String>();
		sSet.add("Linda");
		
		display(iSet);
		display(dSet);
		//display(sSet);


	}

}
