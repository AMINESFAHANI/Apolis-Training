package com.apolis.main;

class CustomThread extends Thread{  
    public CustomThread(String threadName) {
    super(threadName);
}
    public void run(){ 
        for(int i=0;i<=10;i++) {
                System.out.println(Thread.currentThread().getName()+" "+i+"time : is running...");
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getPriority());
                } catch (InterruptedException e) {
                    
                    e.printStackTrace();
                }
        }
    }  
    public static void main(String args[]){  
    	System.out.println(Thread.currentThread().getName());
    	System.out.println(Thread.currentThread().getName());
    	System.out.println(Thread.currentThread().getClass());
      	CustomThread t1=new CustomThread("Custom Thread");  
    	//CustomThread t1=new CustomThread(); 
    	t1.start();  
       System.out.println(Thread.currentThread().getName());
     }  
    } 


