package com.study.mythread;

public class Wait {
	boolean isvalue = false;
	String name;
	int age = 0;
	boolean isAge = false;

	public int getAge() {
		return age;

	}

	public synchronized void setAge(int age) {
		this.age = age;
		isAge = true;
		notifyAll();
	}

	public String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
		isvalue = true;
		notifyAll();
	}

	Wait() {
		this.name = null;
	}

	public synchronized void AddName() throws InterruptedException {
		while (!isvalue) {
			System.out.println("This is in wait state");
			wait();
		}
		System.out.println("Value is :" + name+" "+ age + " " + Thread.currentThread().getName());
	}

	public synchronized void AddAge() throws InterruptedException {
		while (!isAge) {
			System.out.println("This is in wait state");
			wait();
		}
		System.out.println("Value is :"+ name+" " + age + " " + Thread.currentThread().getName());
	}
}
