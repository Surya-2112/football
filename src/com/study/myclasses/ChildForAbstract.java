package com.study.myclass;

public class ChildForAbstract extends AbstractClass.InnerAbstractClass {
	//we can extends the InnerAbstractclass when it was static else we need a object for outer class and with that object only exends the class
	@Override
	public void view1()
	{
		System.out.println("Hi ChildForAbstract ");
	}
}
