package com.study.mythread;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Worker());
        t.start();

        long startTime = System.currentTimeMillis();
        long patience = 4000;
 
        while(t.isAlive()) {
            t.join(1000);
            System.out.println("Main :This take more time");
            if(System.currentTimeMillis() - startTime > patience
                    && t.isAlive()) {
            	startTime=System.currentTimeMillis();
                System.out.println("Main: Too slow!");
                t.interrupt();
               t.join();
            }
        }

        System.out.println("Main: Finished");
    }
}