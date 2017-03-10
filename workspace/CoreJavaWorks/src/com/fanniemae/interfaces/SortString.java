package com.fanniemae.interfaces;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args){
		String[] str= {"hello", "how", "are"};
		Arrays.sort(str);
		for (String temp:str){
			System.out.println(temp);
		}
	}
}
