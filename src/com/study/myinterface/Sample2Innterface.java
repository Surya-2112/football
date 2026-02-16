package com.study.myinterface;

interface Sample2Innterface {
	    int a=1;
		static int b=2;
		final int c=3;
		static final int d=4;
		
		default void show1()
		{
			System.out.println(a+" "+b+" "+c+" "+d);
		}
		 static void show2() //when the method is static we need to override that method to use
		 {
			 System.out.println(a+" "+b+" "+c+" "+d);
		 }
		 default void show3()
		 {
			 System.out.println("I2");
		 }
}
