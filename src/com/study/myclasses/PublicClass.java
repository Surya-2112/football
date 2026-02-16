package com.study.myclass;


class  PublicClass {
	public static void main(String args[]) {
//	  NestedOuterClass pc=new NestedOuterClass();
//		 //NestedOuterClass.NesttedClass3();
//	    pc.outerClass();
//	    NestedOuterClass.Inner2.inner2();// this is allowed by the access modifier
		
		///  when class as two interface with same variable and methods
		// InterfaceClass ic=new InterfaceClass();
		// ic.show1();
		// ic.show2(); //not allowed without overriding a methods
		// Sample1Interface.show2();
		// System.out.println(ic.a); when two Interface as same variable we can access
		// this like only then access by the Interface name
		 
		/// when class also extends
		//InterfaceClass ic = new InterfaceClass();
		//ic.show1();
		//ic.show1();// Class methods always have higher priority than interface methods.
		//ic.show2();// Class methods always have higher priority than interface methods.
		// System.out.println(ic.a); when two variable with same name in differn parent
		// cannot access by the object of child, only by the parent name to access
		//System.out.println(ic.a);
		//ic.show3();  
		
		/// Interface as nestedclass and innterfaces
		//NestedInterface.InnerClassForInterface ici= new NestedInterface.InnerClassForInterface();
		//ici.view(); // this is a way inner class can be access
		
		///nextedInterface and nestedclass  Implements the class
		//ChildForNested cfn=new ChildForNested();
		//cfn.outerClass(); //it only allow the outerclass and outerinterface which the child inheritance	
		//cfn.thisOuterInterface();//and cannot use the inner class or interface by the directly
		//we use the outerclass methods which as the innerclass objects and method in child class as the oject for inner class
		
		//
		System.out.println("hi");
	}

}
