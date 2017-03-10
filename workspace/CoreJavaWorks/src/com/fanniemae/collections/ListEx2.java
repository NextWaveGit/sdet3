package com.fanniemae.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("hi");
		list.add("how");
		list.add("are you");
		
		System.out.println("size = " +list.size() + " "+list);
		
		list.remove(1);
		System.out.println("size = " +list.size() + " "+list);
		
		
		list.add("Japan");
		list.add("China");
		list.add("USA");
		
		
		
		List<String> newList = list.subList(3, list.size());
		System.out.println("sublist size = " +newList.size() + " "+newList);
		
		
		String [] arr = (String[])newList.toArray(new String[newList.size()]);
		
		for(String temp:arr){
		System.out.println("sublist size = " + temp);
		}
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
