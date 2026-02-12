package com.study.myoptional;

public final class MyOptionalClass<A>{
	private static final MyOptionalClass<?> myOptionalClass=new MyOptionalClass<>(null);
	
	private final  A a;
	private MyOptionalClass(A a) {
        this.a = a;
    }

	
	public static <A> MyOptionalClass<A> empty()
	{   
		MyOptionalClass<A> obj= (MyOptionalClass<A>) myOptionalClass;
		return obj;
	}
	
	public A get()
	{  if(a==null) return (A) "This is null";
		return a;
	}
	
	
	public static <A> MyOptionalClass<A> of(A value)
	{
		if(value==null) return (MyOptionalClass<A>)myOptionalClass;
		return new MyOptionalClass(value);
 	}
}
