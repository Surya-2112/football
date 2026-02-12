package com.study.mystaticblock;

public class MyStaticBlock {
	static int c = -2;
	static {
		int a = 10;
		System.out.println("This is from staic block = s" + a);
		PrintValue();// we only call the the static methods
	}

	MyStaticBlock() {
		System.out.println("This is constructor");
	}

	int a = 100;
	static int b = -1;

	public static void PrintValue() {
		System.out.println(b+" "+c);
	}

	public int AddedValue(int a, int b) {
		return a + b;
	}
}
