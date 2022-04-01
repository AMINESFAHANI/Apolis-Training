package com.apolis.main;

public class CustomThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Running");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getClass());
    }

}
 class MainClass {
    public static void main(String[] args) throws InterruptedException  {
        Thread thread1 = new Thread(new CustomThread2(),"amin");
        thread1.start();
        //thread1.join();
        Thread thread2 = new Thread(new CustomThread2());
        thread2.start();
        CustomThread t2=new CustomThread("Custom Thread"); 
        Thread thread3 = new Thread(t2,"amin1");
        thread3.start();
        thread3.join();
        //thread1.start(); can not run a thread twice.
        t2.run();
    }
}



