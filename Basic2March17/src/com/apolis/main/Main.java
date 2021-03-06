
//  Single Inheritance
// Method overriding
//Access super class method in case of method overriding 
//How to access parent class method in case of method overriding

package com.apolis.main;


    // This class can not be public because in each file must be only one public class	 
   class Department{
	String name;
	public void setName(String name) {
		this.name=name;
	}
}	

   class School extends Department{
	    String type;
	    public void setType(String type) {
	        this.type= type;
	        super.setName("Edjucation");
	    }
	    public void setDepartmentName(String departmentName){
	    	name=departmentName;
	    }
	    
	    
	}

	 class StudentA extends School{
	    
	    private String name;
	    private int grade; 
	   
	    
	    
	    public void changeData(String name,int score) {
	   
	        this.name=name;
	        this.grade=score;
	    }
	    
	    
	    public void displayData() {
	        //System.out.println("School type is : "+super.type);
	    	System.out.println("Department name is : "+super.name);
	    	System.out.println("School type is : "+this.type);
	        System.out.println("Student name is : "+name);
	        System.out.println("Grade is : "+ grade);
	        System.out.println("");
	    }
	 }
	  
	 class StudentB extends School{
		    
		    private String name;
		    private int grade; 
		    
		    public void changeData(String name,int score)
		    {
		        this.name=name;
		        this.grade=score;
		    }
		    
		    public void setType(String type) {
		        this.type= type;
		        super.setName("Edjucation"+"Department");}
		    
		    public void displayData() {
		        System.out.println("Department name is : "+super.name);
		        System.out.println("School type is : "+type);
		        System.out.println("Student name is : "+name);
		        System.out.println("Grade is : "+ grade);
		    }
	 
	 }
	public class Main{ 
	 
	 public static void main(String[] args) {
	        StudentA student = new StudentA();
	        student.changeData("Evan",55);
	        student.setType("High School");
	        student.displayData();
	        
	        StudentB student1 = new StudentB();
	       student1.setDepartmentName("Talant Department"); student1.changeData("John",90);
	        student1.setType("Elementray");
	        student1.setDepartmentName("Talant Department");
	        student1.displayData();
	    }
	}



