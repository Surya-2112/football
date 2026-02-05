package com.study;

public class PrivateClass {
	private class Inner1 extends NestedClass1{
		void inner1() {
			System.out.println("Inner1");
		}
	}

	public class Inner2 {
		static void inner2() {
			System.out.println("Inner2");
		}
	}

	class Inner3 extends Inner1 {
		void inner3() {
			System.out.println("Inner3");
		}
	}

	protected class Inner4 {
		void inner4() {
			System.out.println("Inner4");
		}
	}

	private static class NestedClass1 {
		void nested1() {
			System.out.println("nested1");
		}
	}

	public static class NestedClass2 {
		static void nested2() {
			System.out.println("nested2");
		}
	}

	static class NestedClass3 { //extends Inner1 static class not extends static class
		void nested3() {
			System.out.println("nested3");
		}
	}

	protected static class NestedClass4 extends NestedClass1 {
		void nested4() {
			System.out.println("nested4");
		}
	}
	
	public void outerClass()
	{
		NestedClass1 n1= new NestedClass1();
		n1.nested1();
		Inner1 in1 =new Inner1();
		in1.inner1();
	}
}