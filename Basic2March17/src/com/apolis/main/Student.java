/**
 * Method Overloading
 */
package com.apolis.main;


public class Student {

	    private String sname;
	    private int score; 
	    
	    public void changeData(String sname,int score)
	    {
	        this.score=score;
	        this.sname=sname;
	    }
	    
	    public void changeData(String sname)
	    {
	        this.sname = sname;
	    }

	    public void changeData(int grade)
	    {
	        score= grade;
	    }
	    
	    public void displayData() {
	        System.out.println(sname);
	        System.out.println(score);
	    }
	    
	    public static void main(String[] args) {
	        Student studentA = new Student();
	        studentA.changeData(55);
	        studentA.changeData("John");
	        studentA.displayData();
	        studentA.changeData("Alex", 80);
	        studentA.displayData();
	    }
	}
