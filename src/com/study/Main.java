package com.study;

import java.util.function.Predicate;

public class Main {
	public static void main(String args[])
	{
		FunctionalInter a= x -> "Hello "+x;
		System.out.println(a.fun("surya"));
		Annotation an=new Annotation();
		an.Suppress();
	}
}
