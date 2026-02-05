package com.study;

public interface Sample1Interface {
	// Interface variable all are in public static final 
    int a=10;
	static int b=20;
	final int c=30;
	static final int d=40;
	
	default void show1()
	{
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	 static void show2() //when the method is static we need to override that method to use
	 {
		 System.out.println(a+" "+b+" "+c+" "+d);
	 }
//	 default static void show3()
//	 {
//		 System.out.println(a+" "+b+" "+" "+c+" "+d);
//	 } this combination is not allowed
}
