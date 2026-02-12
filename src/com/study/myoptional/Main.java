package com.study.myoptional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
	public static void methods(Optional<String> obj) {
		if (!obj.isEmpty()) {
			System.out.println("This is Get = " + obj.get());
			System.out.println("This is Else Throw =" + obj.orElseThrow());
		} else {
			System.out.println("\"This is Get and else Throw = NoSuchElementException");
		}
		System.out.println("This is hashcode = " + obj.hashCode());
		System.out.println("This is isempty = " + obj.isEmpty());
		System.out.println("This is ispresent = " + obj.isPresent());
		System.out.println("This is orelse = " + obj.orElse(getValue())); // it will always call the methods
		System.out.println("This is orelseGet = " + obj.orElseGet(() -> getValue())); // it will call only values is null
		System.out.println( obj.filter(string -> string.length() > 5 ));// it will check for the condition and if true return that optional obj or return Optional.empty()
		System.out.println(obj.map(string -> string.split("_")[0])); //it possible return transform the value inside Optional obj or return same value ;
		obj.ifPresent(string -> System.out.println(string));
		obj.ifPresentOrElse(string -> System.out.println(string),()->System.out.println("This is Empty "));
	}
	
	public static void nestedMethods(Optional<Optional<String>> obj) {
		if (!obj.isEmpty()) {
			System.out.println("This is Get = " + obj.get());
			System.out.println("This is Else Throw =" + obj.orElseThrow());
		} else {
			System.out.println("\"This is Get and else Throw = NoSuchElementException");
		}
		System.out.println("This is hashcode = " + obj.hashCode());
		System.out.println("This is isempty = " + obj.isEmpty());
		System.out.println("This is ispresent = " + obj.isPresent());
		System.out.println("This is orelse = " + obj.get().orElse(getValue())); // when using this get show thw error when it is empty
		System.out.println(obj.flatMap(op -> op.map(string -> string.split("_")[0]))); // this is used for unwrap safely
	} 

	public static String getValue(){
		System.out.println("GetingValue:");
		return "hello";
		
	}

	public static void main(String args[]) {
		Optional<String> op1 = Optional.empty(); // this use singleton and prevent from the misusing the developer
		// Optional<String> op2=Optional.of(null); //NullPointerException
		Optional<String> op3 = Optional.ofNullable(null);
		Optional<String> op4 = Optional.of("hi_Of");
		Optional<String> op5 = Optional.ofNullable("hi of Nullable");
		
		Optional<Optional<String>> nested= Optional.of(Optional.of("This is_nested"));
		
		System.out.println(op1.toString()); // Optional.empty
		System.out.println(op3.toString()); // Optional.empty
		System.out.println(op4.toString()); // Optional[hi]
		System.out.println(op5.toString()); // Optional[hi]
		System.out.println("\n-----------This is Empty----------------");
		methods(op1);
		System.out.println("\n------------------This is Nullable is null---------------------");
		methods(op3);
		System.out.println("\n-------------------This is OF------------------------");
		methods(op4);
		System.out.println("\n------------------------This is Nullable is Value-----------------");
		methods(op5);
		System.out.println("\n----------------This is Nested--------------------");
		nestedMethods(nested);
		
		System.out.println("------------This is from MyOptionalClass:-------------");
		MyOptionalClass<String> o1=MyOptionalClass.of("hi");
		MyOptionalClass<String> o2=MyOptionalClass.empty();
		System.out.println(o2.get());
		System.out.println(o1.get());
	}

}
