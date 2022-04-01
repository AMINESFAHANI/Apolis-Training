package com.apolis.main;

public class Volatile {
	
	//volatile implementation


	    private volatile static int counter = 0;

	    public static void main(String[] args) throws InterruptedException {
	        Thread t1= new Thread(new Runnable(){
	            @Override
	            public void run() {
	                int localCounter = counter;
	                while(localCounter<10) {
	                	
	                	if(localCounter != counter) {
	                        System.out.println(counter+"  "+localCounter+"  Thread1 reads the shared variable changes.");
	                        localCounter=counter;
	                    }
	                }    
	            }
	        });
	        
	        t1.start();
	        Thread t2= new Thread(new Runnable(){
	            
	            @Override
	            public void run() {
	            int localCounter = counter;
	            while(localCounter<10) {
	            	   
	            	System.out.println("Thread2 update sahred variable to "+ (localCounter+1));
	                    counter = ++localCounter;
	                    try {
	                        Thread.sleep(500);
	                    } catch (InterruptedException e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
	                    }
	                }
	            }
	        });
	        t2.start();
	    }
	}



