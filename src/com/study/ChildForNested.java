package com.study;

public class ChildForNested extends NestedOuterClass implements NestedInterface{
	 
	void Access()
	{
		NestedOuterClass pc=new NestedOuterClass();
		pc.outerClass();
	}
}
