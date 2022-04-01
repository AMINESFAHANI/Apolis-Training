
 
package com.apolis.main;

import java.util.HashMap;

public class OccurrenceOfWords {

	
	public static void main(String[] args) {
		
        HashMap<String,Integer> ocurrence = new HashMap<String, Integer>();
        String sentence ="Alice is girl and Bob is boy";
        String[] words = sentence.split(" ");
        for(String word:words) {
        	if (ocurrence.containsKey(word)) ocurrence.put(word, ocurrence.get(word)+1);
        	else ocurrence.put(word, 1);
        }
        System.out.println(ocurrence);
	}

}
