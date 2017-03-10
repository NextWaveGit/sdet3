package com.fanniemae.interfaces;

import java.util.Comparator;

public class EmpSorter implements Comparator<Emp>{
	public int compare(Emp o1, Emp o2){
		return (int) (o1.getEmpSal() - o2.getEmpSal() );
	}

}
