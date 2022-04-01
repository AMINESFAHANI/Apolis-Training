package com.apolis.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'possibleChanges' function below
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY usernames as parameter.
     */

    public static List<String> possibleChanges(List<String> list) {
    	
        List<String>resaul = new ArrayList<String>();
        for (String username: list) {
        	int lengthOfUsername = username.length();
        	boolean possibleChange=false;
        	for (int i=0;i<lengthOfUsername-1;i++) {
        		if(possibleChange) break;
        		for(int j=i+1;j<lengthOfUsername;j++) {
        			if(username.charAt(i)>username.charAt(j)) {resaul.add("Yes");
        			possibleChange=true;
        			break;}
        		}
        	}
            if(!possibleChange) resaul.add("No");
        }
    return resaul;
    }
}

public class PossibleChanges {
    public static void main(String[] args) throws IOException {
    	List<String> results = Result.possibleChanges(Arrays.asList("amin","1","foo","bar","baz"));
    	System.out.println(results);
    }
}