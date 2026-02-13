package com.study.mythread;

public class Count {
	final static Count c = new Count();
	public int count = 0;

	public synchronized void  increment() {
		for (int i = 0; i < 5; i++) {
			count++;
			System.out.println(count + " " + Thread.currentThread().getName());
		}
	}

	public synchronized void decrement() {
		for (int i = 0; i < 5; i++) {
			count--;
			System.out.println(count + " " + Thread.currentThread().getName());
		}
	}
}
