package com.fanniemae.interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class EmpSortClient {
	public static void main(String[] args){

	Emp [] emps = {
			new Emp(101,"Becky",20000),
			new Emp(23, "Andy", 23232),
			new Emp(88, "Peter", 10000)
			
	};
	
	for (Emp temp : emps){
	
	System.out.println(temp);
	}
	
	//Arrays.sort(emps);
	//Arrays.sort(emps, new EmpSorter());
	
	Arrays.sort(emps,new Comparator<Emp>(){
		public int compare(Emp o1, Emp o2){
			return o2.getEmpName().compareTo(o1.getEmpName());
		}
	});
	
	for (Emp temp : emps){
		
	System.out.println(temp);
	}
	
	}
}
