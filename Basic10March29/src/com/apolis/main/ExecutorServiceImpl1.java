package com.apolis.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Executor service with single worker thread pool
public class ExecutorServiceImpl1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Thread task1= new Thread(new Runnable(){
            @Override
            public void run() {
                
                        System.out.println(Thread.currentThread().getName());
                        System.out.println("Task1 executed");
        }
        });
        Thread task2= new Thread(new Runnable(){
            @Override
            public void run() {
                
                        System.out.println(Thread.currentThread().getName());
                        System.out.println("Task2 executed");
        }
        });
       // ExecutorService executorService1 = Executors.newSingleThreadExecutor();
      // executorService1.submit(task2);
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.shutdown();
    }
}

