package com.study.myclass;

import com.study.myinterfaces.NestedInterface;

public class ChildForNested extends NestedOuterClass implements NestedInterface{
	 
	void Access()
	{   System.out.println("This access");
		NestedOuterClass pc=new NestedOuterClass();
		pc.outerClass();
	}
}
