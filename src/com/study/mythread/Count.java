package com.study.mythread;

public class Count {
	final static Count c = new Count();
	public int count = 0;

	public synchronized void  increment() {
		/*for (int i = 0; i < 5; i++) {
			count++;
			System.out.println(count + " " + Thread.currentThread().getName());
		}*/
		count++;
		System.out.println("Increments Sync = "+count + " " + Thread.currentThread().getName());
	}

	public  void decrement() {
		/*for (int i = 0; i < 5; i++) {
			synchronized(this){
			count--;
			}
			System.out.println(count + " " + Thread.currentThread().getName());
		}*/
		synchronized(this){
			count--;
			}
	}
}
