package com.study.mythread;

public class DecrementRun extends Thread{
	 
	public void run()
	{
		//Count.c.decrement();
		Count2.c.decrement();
		//System.out.println("This is from run"+Thread.currentThread().getName());
	}
}

