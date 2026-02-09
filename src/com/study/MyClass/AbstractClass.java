package com.study.MyClass;

public abstract class AbstractClass {
	// it as construtor and we cannot create a object for the class
	// it is common as the class for top level access modifier

	private int a; // it allow all access modifier, final and static

	public AbstractClass() {
	}

	private void view() // it allow all access modifier, final and static
	{
	}

	abstract void view1();// it doesnot allow private because it must override ,static and final

	class innerClass { // it comman as nested class

	}

	static interface Interface { // it comman as nested interfaces

	}

	 static abstract class InnerAbstractClass { // it allows all access modifier and static
		private int b = 10;

		public InnerAbstractClass() {

		}

		public void view1() {
			// TODO Auto-generated method stub
			
		}
	}
}
