package com.study.mythread;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//MyThread t1= new MyThread();
		//System.out.println("---------- This methods ---");
		//t1.run();// it will normal methos call not thread
		//Thread myThread = (new Thread(t1));
		//stem.out.println(myThread.getName());
		
		MyThreadClass myThreadClass1 = new MyThreadClass(); 
		System.out.println(myThreadClass1.getName());
		
		MyThreadClass myThreadClass2 = new MyThreadClass();
		System.out.println(myThreadClass2.getName());
		
		//myThreadClass1.start();
		//myThreadClass1.join();
		System.out.println("this is sleeping");
		//myThread.start();
		//myThread.join();
		//myThreadClass1.join();
		//myThreadClass2.start();
		//System.out.println(myThread.equals(myThreadClass1)); 
		
		/*
		MyThread t= new MyThread();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		t2.join();
		System.out.println(t.get()+" "+Thread.currentThread().getName()); */
		
		/*
		IncrementRun inr=new IncrementRun();
		DecrementRun der=new DecrementRun();
		inr.start();
		der.start(); */
		
		for(int i=0;i<5;i++)
		{
			IncrementRun inr=new IncrementRun();
			DecrementRun der=new DecrementRun();
			inr.start();
			der.start();
		}
		
	}
}
