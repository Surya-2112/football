package com.study.mythread;

public class IncrementRun extends Thread{
	 
	public void run()
	{
		//Count.c.increment();
		Count2.c.increment();
		//System.out.println("This is from run"+Thread.currentThread().getName());
	}
}
