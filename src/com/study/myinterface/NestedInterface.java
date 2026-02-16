package com.study.myinterface;

public interface NestedInterface {
	interface InnerInterface //All interfaces declared inside another interface are implicitly public static abstract
	{
		String inclass="interface in interface";
		  default void view2()
		 {
			 System.out.println(inclass);
		 }
		 static void view3()
		 {
			 System.out.println(" view3"+inclass);
		 }
		
	}
    class InnerClassForInterface{ // this will be public and static  by default and can be final or not
		private String inclass="interfaceclass";
		 public void view()
		 {
			 System.out.println(inclass);
		 }
	}
    
    default void thisOuterInterface()
    {
    	System.out.println("His is OuterInterface method");
    	 InnerClassForInterface ic=new InnerClassForInterface();
    	 ic.view();
    	 InnerInterface.view3();//it allows because its static and non static not allowed
    	//InnerClassForInterface.view();// if method class only static because non static methos needs he objects
    }
     
}
