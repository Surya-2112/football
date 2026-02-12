package com.study.mystaticblock;

public class ChildClassForStatic extends MyStaticBlock{
		static String a1="Child a";
		
		static {
			String b1="Child in static b";
			System.out.println(b1);
			PrintChild();
		}
	    String b1="Child b";
		static String c1="Child c";
		
		 ChildClassForStatic()
		 {
			 System.out.println("This is child Constructor");
		 }
		public static void PrintChild()
		{
			System.out.println(a1+" "+c1);
		}
		  
}
