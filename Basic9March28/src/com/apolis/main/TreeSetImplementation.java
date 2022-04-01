package com.apolis.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer int1, Integer int2) {
		
		if(int1<int2)return 1;
		else if (int1>int2)return -1;
		else return 0;
	}
	
}


public class TreeSetImplementation {

	public static void main(String[] args) {
		
		Set<Integer> treeSetArray = new TreeSet<Integer>(new MyComparator());
		treeSetArray.add(3);
		treeSetArray.add(7);
		treeSetArray.add(0);
		System.out.println(treeSetArray);
	

	}

	
	}


