package com.study.StaticBLock;

public class ChildClassForStatic extends MyStaticBlock{
		static String a1="Child a";
		
		static {
			String b1="Child in static b";
			System.out.println(b1);
			PrintChild();
		}
	    String b1="Child b";
		static String c1="Child c";
		public static void PrintChild()
		{
			System.out.println(a1+" "+c1);
		}
		  
}
