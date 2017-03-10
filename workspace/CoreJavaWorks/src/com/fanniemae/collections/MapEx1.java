package com.fanniemae.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapEx1 {

	public static void main(String args[]){
		Map<String, Integer>  map = new HashMap<String, Integer>();
		
		map.put("Smita", 1000);
		map.put("Linda", 500);
		
		System.out.println(map.get("Linda"));
		
		map.put("Linda", 666);
		
		System.out.println(map.get("Linda"));
		
		Set set = map.entrySet();
		
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){ 
			Map.Entry<String, Integer> temp =  (Entry<String, Integer>) itr.next();
			System.out.println(temp.getKey() + " "+ temp.getValue());
		}
		
		
		
		
		
		
	}
}
