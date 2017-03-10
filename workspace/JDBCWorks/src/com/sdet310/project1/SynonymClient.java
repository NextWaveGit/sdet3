package com.sdet310.project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SynonymClient {
	
	public static void main(String arr[]) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word;
		
		System.out.println("Enter the word to find its synonyms:");
		
		word = br.readLine();
		
		//Synonyms syn = new Synonyms();
		
		
		
		System.out.println(Synonyms.getSynonyms(word));
		
		
	}
	
	

}
