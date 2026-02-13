package com.study.mythread;

public class Worker implements Runnable {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Child: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child: Interrupted!");
        }
    }
}