package com.study.mythread;

public class Count2 {
	final static Count2 c = new Count2();
	public int count = 0;

	public void  increment() {
		/* for (int i = 0; i < 5; i++) {
			count++;
			System.out.println(count + " " + Thread.currentThread().getName());
		}*/
		count++;

	}

	public void decrement() {
		/*for (int i = 0; i < 5; i++) {
			count--;
			System.out.println(count + " " + Thread.currentThread().getName());
		}*/
		count--;
	}
}
