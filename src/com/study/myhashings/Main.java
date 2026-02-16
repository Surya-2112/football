package com.study.myhashing;

public class Main {


	public static void checkForInteger() {
		//int a = 10; // By Equals Methods:true , == true ,HashCode for b =10
		//Integer b = 10;
		
		//int a=129; // == true
		//int b=a;

		//Integer a = 129; // By Equals Methods:true, == true,HashCode for a = 129
		//int b = 129;

		Integer a = new Integer(5); // By Equals Methods:true, == false,HashCode for a = 5 for b =5
		Integer b = new Integer(5);

		//Integer a = new Integer(5); // By Equals Methods:true, == true,HashCode for a = 5 
		//int b = a;
				
		System.out.print("By Equals Methods:" + a.equals(b));
		System.out.print(", == " + (a==b));
		System.out.println(",HashCode for a = " + a.hashCode() + " for b =" + b.hashCode());
	}
	
	public static void checkForString()
	{
		//String a="hi"; //By Equals Methods:true, == true,HashCode for a = 3329 for b =3329
		// String b="hi";

		String a="hi"; // By Equals Methods:true, == false,HashCode for a = 3329 for b =3329
		String b=new String("hi");
		
		System.out.print("By Equals Methods:" + a.equals(b));
		System.out.print(", == " + (a==b));
		System.out.println(",HashCode for a = " + a.hashCode() + " for b =" + b.hashCode());
	}
	
	public static void checkForClass()
	{
		Employee e1=new Employee(1,"Surya"); 
		Employee e2=new Employee(1,"Surya"); 
		Print(e1,e2); //By Equals Methods:false, == false,,HashCode for a = 1896277646 for b =2128227771
		MyPrint(e1,e2);//By Equals Methods:true, == false,HashCode for a = 80251223 for b =80251223
		
		Employee e3=new Employee(1,"Surya");
		Employee e4=e3; 	
		Print(e3,e4);//By Equals Methods:true, == true,HashCode for a = 396180261 for b =396180261
		MyPrint(e3,e4); //By Equals Methods:true, == true,HashCode for a = 80251223 for b =80251223
		
		Employee e5=new Employee(1,"Surya");
		Employee e6=new Employee(2,"Surya");
		Print(e5,e6);// By Equals Methods:false, == false,HashCode for a = 625576447 for b =1560911714
		MyPrint(e5,e6);// By Equals Methods:false, == false,HashCode for a = 80251223 for b =80251254
		
		Employee e7=new Employee(1,"Surya");
		Employee e8=new Employee(1,"Prakash");
		Print(e7,e8); //By Equals Methods:false, == false,HashCode for a = 939047783 for b =1237514926
		MyPrint(e7,e8); //By Equals Methods:false, == false,HashCode for a = 80251223 for b =1342439753

	}
	
	public static void Print(Employee a,Employee b)
	{
		System.out.print("By Equals Methods:" + a.equals(b));
		System.out.print(", == " + (a==b));
		System.out.println(",HashCode for a = " + a.hashCode() + " for b =" + b.hashCode());
	}
	
	public static void MyPrint(Employee a,Employee b)
	{
		System.out.print("By Equals Methods:" + a.Myequals(b));
		System.out.print(", == " + (a==b));
		System.out.println(",HashCode for a = " + a.MyhashCode() + " for b =" + b.MyhashCode());
	}
	
	public static void main(String[] args) {
		//checkForInteger();
		//checkForString();
		checkForClass();
	}

}
