package com.study.myfunctionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String aargs[]) {
		
		FunctionalInter a = x -> "Hello " + x;
		ChildForFunctionalInter b = new ChildForFunctionalInter();
		System.out.println(a.fun("surya"));// lamada functions
		System.out.println(b.fun("surya"));// this class child method
	
		
		Predicate<Integer> p = x-> x>5 ;
		System.out.println(p.test(10));
		System.out.println(p.test(5));
		
		Function<Integer,String> f= x-> (x*10)+" ";
		System.out.println(f.apply(5));
		System.out.println(f.apply(-5));
		
		Supplier<String> s= ()->"Welcome";
		System.out.println(s.get());
		
		Consumer<Integer> c= x -> System.out.println(x);
		c.accept(100);
	}
}
