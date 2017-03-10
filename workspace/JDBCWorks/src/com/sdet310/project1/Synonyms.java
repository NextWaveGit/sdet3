package com.sdet310.project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Synonyms {
	
	public static List<String> synonyms = new ArrayList<>(Arrays.asList("affable", "amiable", "genial", "congenial", "cordial"));


	public static String getSynonyms(String word){
		
		if (word.equals("friendly")){
			
			SynonymSearchCountDAO.updateSearchCount(word);
		return "Synonyms of word "+ word +"  are: " +synonyms.toString();
		}
		else {
			return "Sorry no synonym is found";
		}
		
	}
}
