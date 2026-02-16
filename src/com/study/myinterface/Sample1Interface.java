package com.study.myinterfaces;

interface Sample1Interface {
	//interface always public abstract 
	// Interface variable all are in public static final and method not be final
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
	  abstract  void show3() ; // it always public abstract and it must be override by  child class or parents class
//	 default static void show3()
//	 {
//		 System.out.println(a+" "+b+" "+" "+c+" "+d);
//	 } this combination is not allowed
}
