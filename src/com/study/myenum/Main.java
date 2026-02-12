package com.study.myenum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("------------------  This Main ------------------------");
		Maths add2 = Maths.ADD;
		System.out.println("------------------  This Main ------------------------");
		System.out.println(add2.operations());
		System.out.println(Maths.SUBTRACT.operations());
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------ This Get Input from user----------");
		System.out.println("Enter String for operations");
		String str = sc.nextLine();
		str = str.toUpperCase().trim();
		int count = 0;

		for (Maths m : Maths.values()) {
			if ((m.toString()).equals(str)) {
				count++;
			}
//			System.out.println("String " + m + "  " + str);
//			System.out.println("Equals " + m.equals(str));
//			SysAtem.out.println("to string hashcode " + m.hashCode() + " " + str.hashCode());
//		    System.out.println(m.toString().hashCode() + " " + str.hashCode());
//			System.out.println();
		}
		System.out.println(count);
		if (count > 0) {
			Maths in = Maths.valueOf(str);
			System.out.println(Maths.valueOf(str));
			System.out.println(in.toString());

		System.out.println(	switch (in) {
			case Maths m when m == Maths.ADD -> {
			//	System.out.println(in.operations());
				yield in.operations();
			}
			case SUBTRACT -> {
				//System.out.println(in.operations());
				yield in.operations();
			}
			case Maths.MULTIPLY -> {
				//System.out.println(in.operations());
				yield in.operations();
			}
			case DIVISION ->{
				//System.out.println(in.operations());
				yield in.operations();
			}
			
			default -> {
				yield -1;
			}
			});

		} else {
			System.out.println("String is not vaild");
		}
		String a="hi";
		String b=new String("hi");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode()+" "+b.hashCode());
	
	}
//	@ Override
//	public int hashCode()
//	{  
//	
//		
//	}

}
