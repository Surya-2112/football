package com.study.MyClass;

import com.study.MyInterfaces.NestedInterface;

public class ChildForNested extends NestedOuterClass implements NestedInterface{
	 
	void Access()
	{
		NestedOuterClass pc=new NestedOuterClass();
		pc.outerClass();
	}
}
