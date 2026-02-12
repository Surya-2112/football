package com.study.mythread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		MyThread t1= new MyThread();
		//System.out.println("---------- This methods ---");
		//t1.run();// it will normal methos call not thread
		Thread myThread = (new Thread(t1));
		System.out.println(myThread.getName());
		
		MyThreadClass myThreadClass1 = new MyThreadClass(); 
		System.out.println(myThreadClass1.getName());
		
		MyThreadClass myThreadClass2 = new MyThreadClass();
		System.out.println(myThreadClass2.getName());
		
		myThreadClass1.start();
		//myThreadClass1.join();
		System.out.println("this is sleeping");
		myThread.start();
		myThread.join();
		myThreadClass2.start();
		System.out.println(myThread.equals(myThreadClass1)); 
	}
}
