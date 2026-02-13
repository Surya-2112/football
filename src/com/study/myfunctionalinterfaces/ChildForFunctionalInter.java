package com.study.myfunctionalinterfaces;

public class ChildForFunctionalInter implements FunctionalInter {

	@Override
	public String fun(String x) {
		return "hi " +x;
	}

	// FunctionalInter a= x-> "Hi"+ x;// no need to implementclass use it this  like
	
	
}
