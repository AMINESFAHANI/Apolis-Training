// Cloninh, Shallow cloning , Deep Cloning

package com.apolis.main;


class Clone implements Cloneable{
	String name;

	public Clone(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Clone [name=" + name + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Clone)super.clone();
	}
	
	
}




public class Cloning implements Cloneable{
	
	int rollno;  
	String name;
	Clone clone;
	  
	Cloning(int rollno,String name,Clone clone){  
	super();
	this.rollno=rollno;  
	this.name=name;
	this.clone=clone;
	}  
	
	// Java as default ovrride This mrthod .   
//	public Object clone()throws CloneNotSupportedException{  
//	return super.clone();  
//	}
//	
    
	
		public Cloning clone()throws CloneNotSupportedException{  // Other way of overriding the clone method.
		Cloning cloning= (Cloning)super.clone();
		Clone clone = (Clone)this.clone.clone();
		cloning.clone=clone;
		return cloning;
		} 
	  
	@Override
	public String toString() {
		return "Cloning [rollno=" + rollno + ", name=" + name + ", clone=" + clone + "]";
	}
	
	
public static void main(String args[]){  
	try{  
	Clone clone =new Clone("Shaddow");
	Cloning s1=new Cloning(101,"John",clone);    
	Cloning s2=(Cloning)s1.clone();
	//Cloning s2=s1.clone(); By using the second way of overiding it does'nt need the down casting. 
	System.out.println(s1.rollno+" "+s1.name);  
	s1.name="Jim";
	System.out.println(s1.rollno+" "+s1.name); 
	System.out.println(s2.rollno+" "+s2.name);
	clone.name="Deep";
	System.out.println(s2.toString());
	System.out.println(s1.toString());
	  
	}catch(CloneNotSupportedException c){}  
	  
	}  
	} 



