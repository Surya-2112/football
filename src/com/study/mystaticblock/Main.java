package com.study.mystaticblock;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("This is from Main Method");
		MyStaticBlock sb = new MyStaticBlock();
		System.out.println("---------- By the Object------");
		MyStaticBlock.PrintValue();
		System.out.println(sb.a);
		System.out.println(sb.AddedValue(1000, 2000));
		
		System.out.println("This is from parent Method");
		
		MyStaticBlock sb1 = new ChildClassForStatic();
		System.out.println("---------- By the parent Object------");
		ChildClassForStatic.PrintChild();
		System.out.println(sb1.a);
		
		System.out.println("This is from Child object");
		ChildClassForStatic cs=new ChildClassForStatic();
		System.out.println("---------- By the Child Object------");
		cs.PrintChild();
		System.out.println(cs.AddedValue(3000, 333));
		cs.PrintValue();
		ChildClassForStatic c=new ChildClassForStatic();
	}

}
