package com.study.mythread;

public class MyThreadClass extends Thread{

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "This is the Thread from MyThreadClass  " + this.getName());
			try {
			Thread.sleep(4000);
			}catch(Exception e)
			{
				System.out.println("This exception on sleep");
			}
		}
	}

}
