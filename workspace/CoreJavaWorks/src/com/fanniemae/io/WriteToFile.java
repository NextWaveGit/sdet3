package com.fanniemae.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteToFile {
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int empId;
		String empName;
		double empSal;
		
		System.out.println("Enter Emp Id");
		
		empId = Integer.parseInt(br.readLine());
		
		empName = br.readLine();
		
		empSal = Double.parseDouble(br.readLine());
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Sample.txt", true));
		
		bw.write(new Integer(empId).toString());
		bw.write(empName);
		bw.write(new Double(empSal).toString());
		bw.newLine();
		
		bw.close();
		
		System.out.println("data written");
	}

}
