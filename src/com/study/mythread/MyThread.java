package com.study.mythread;

public class MyThread implements Runnable {
	private int c = 0, a = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			if (Thread.currentThread().getId() == 23) {
				c++;
				a++;
			} else {
				c--;
				a++;
			}
			System.out.println(c + " " + a + " " + Thread.currentThread().getId());
		}
	}

	public int get() {
		return c;
	}
}
