package com.study.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.study.MyGenerics.MyList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Value:");
			int a = sc.nextInt();
			
			MyList<Integer> l = new MyList<>();
			l.add(20);
			l.add(null);
			//l.get(2).intValue();
			int b = l.get(0).intValue();
			try {
				ClassForThrows cft = new ClassForThrows();
				 System.out.println("Integer Divistion :"+cft.div(b, a));
				System.out.println("Float Divistion"+cft.divFloat(b, a));
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
			}
			
		} catch (InputMismatchException e) {
			System.out.println(e.toString());
		} catch (NullPointerException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			sc.close();
			System.out.println("This is finnaly block");
		}
	}

}
