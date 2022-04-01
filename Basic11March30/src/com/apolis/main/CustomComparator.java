package com.apolis.main;

import java.util.Comparator;

public class CustomComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if (o2.salary>o1.salary) return 1;
		else if (o2.salary<o1.salary)return -1;
		else {
			if(o2.name.charAt(0)>o1.name.charAt(0))return 1;
			else if (o2.name.charAt(0)<o1.name.charAt(0))return -1;
			else return 0;
		}
	
	}
}
