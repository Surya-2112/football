package com.study;

class PublicClass {
	public static void main(String args[]) {
//	  PrivateClass pc=new PrivateClass();
//		 //PrivateClass.NesttedClass3();
//	    pc.outerClass();
//	    PrivateClass.Inner2.inner2();
		
		///  when class as two interface with same variable and methods
		// InterfaceClass ic=new InterfaceClass();
		// ic.show1();
		// ic.show2(); //not allowed without overriding a methods
		// Sample1Interface.show2();
		// System.out.println(ic.a); when two Interface as same variable we can access
		// this like
		// only then access by the Interface name
		
		/// when class also extends
		InterfaceClass ic = new InterfaceClass();
		ic.show1();// Class methods always have higher priority than interface methods.
		ic.show2();// Class methods always have higher priority than interface methods.
		// System.out.println(ic.a); when two variable with same name in differn parent
		// cannot access by the object of child, only by the parent name to access
	}

}
