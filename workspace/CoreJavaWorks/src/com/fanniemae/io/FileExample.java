package com.fanniemae.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
	
	public static void main(String[] args){

	File f = new File("Sample.txt");
	
	int myList [] = {4, 3, 7};
	int [] myLis = {4, 3, 7};
	

	try {
		System.out.println(f.createNewFile());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(f.getAbsolutePath());
	}
		
}
