package com.apolis.main;

public class NestedTryTest {  
    
    public static void main(String args[])  
    {         
        try { int arr1[] = { 1, 2, 3, 4 };    
        System.out.println(arr1[10]); 
            //inner try block 1   
    //—-----line1
           //—------line2
    //----------line3
            try {  
                // inner try block 2  
                    try {  
                          
                    	int arr[] = { 1, 2, 3, 4 };    
                            System.out.println(arr[10]);  
                            }  
                     catch (ArithmeticException e) {  
                            System.out.println("Arithmetic exception");  
                                       System.out.println(" inner try block 2");  
                     } 
                    catch ( ArrayIndexOutOfBoundsException e) {  
                        System.out.println(e);  
                        System.out.println(" inner try block 2");  
                 } 
                 finally {
                	 System.out.println("inner finally block 2");
                 }   
                    
                //  —----------
            } 
            catch (ArithmeticException e) {  
                System.out.println("Arithmetic exception");  
                System.out.println("inner try block 1");  
            }  
        } 
        catch (ArrayIndexOutOfBoundsException e4) {  
            System.out.print(e4);  
            System.out.println(" outer (main) try block");  
        }  
        catch (Exception e5) {  
            System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
        }  
    }  
}  

