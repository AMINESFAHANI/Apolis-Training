package com.apolis.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StringList {

	public static void main(String[] args) {
		
        List<String> stringArray1 = new ArrayList<String>();
		stringArray1.add(0,"Jim");
        stringArray1.add("John");
        stringArray1.add(2,"Tom");
		
	    List<String> stringArray = new ArrayList<String>();
		stringArray.add(0,"Jim");
        stringArray.add("John");
        stringArray.add(2,"Tom");
        stringArray.addAll(1,stringArray1);
        
        System.out.println(stringArray1);
        //stringArray.remove(0);
        stringArray.remove("John");
        System.out.println(stringArray);
        Iterator iter = stringArray.iterator();
        while (iter.hasNext()) {
        	String x= (String)iter.next();
        	if(x=="Jim")iter.remove();
        }
       System.out.println(stringArray);
       ListIterator<String> reverseIterator = stringArray.listIterator(stringArray.size());
	   while(reverseIterator.hasPrevious()) {
		   String x = (String)reverseIterator.previous();
		   System.out.println(x);
	   }
	   
	   stringArray.forEach((x)->System.out.println(x));
	}
	}


