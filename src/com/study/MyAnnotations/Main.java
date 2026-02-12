package com.study.myannotations;

import java.util.function.Predicate;

import com.study.myinterfaces.FunctionalInter;

public class Main {
	public static void main(String args[])
	{
		FunctionalInter a= x -> "Hello "+x;
		System.out.println(a.fun("surya"));
		Annotation an=new Annotation();
		an.Suppress();
	}
}
