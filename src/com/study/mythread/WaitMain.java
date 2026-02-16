package com.study.mythread;

import java.util.Scanner;

public class WaitMain {

		public static void main(String args[])
		{  Scanner sc=new Scanner(System.in);
			Wait w=new Wait();
			Thread t=new Thread(()->{
				try {
					w.AddName();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			
			Thread t1=new Thread(()->{
				try {
					w.AddAge();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			t.start();
			t1.start();
			String name;
			int age;
			System.out.println("Enter a name");
			name=sc.next();
			w.setName(name);
			System.out.println("Enter a age");
			age=sc.nextInt();
			w.setAge(age);
			System.out.println(w.getName()+"  "+w.getAge());
		}
}
