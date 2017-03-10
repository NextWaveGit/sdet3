package com.client;

import java.util.Arrays;

public class SortPrimitive {

	public static void main(String[] args){
		int []  nums = new int[7];
		
		nums[0]=10;
		nums[1]=2;
		

		
		for (int i :nums){
			System.out.println(i);
		}
		
		Arrays.sort(nums);
		
		
		for (int i :nums){
			System.out.println(i);
		}
			
	}
}
