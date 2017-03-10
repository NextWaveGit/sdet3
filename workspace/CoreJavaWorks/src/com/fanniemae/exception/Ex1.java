package com.fanniemae.exception;

public class Ex1 {

	public static void main(String[] args){
		try{int num1 = 0;
		int num2 = 20;
		try{
		int[] arr=new int[4];
		
		arr[10]=12;
		}catch(Exception e){
			System.out.println(e);
		}
		int res = num2/num1;
		
		
		System.out.println("result is " + res);
		}catch(ArithmeticException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("skdjflksdjfls");
	}
}
