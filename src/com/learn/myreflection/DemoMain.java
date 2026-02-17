package com.learn.myreflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class DemoMain {
	public static void main(String args[]) throws Exception
	{
		Players p1=new Players("surya",21,2);
		System.out.println("Players :"+p1.toString());
		
		Class<?> cl=Class.forName("com.learn.myreflection.Players");
		Object obj=cl.newInstance();
		System.out.println("New Inst"+obj);
		
		Constructor constructor= cl.getDeclaredConstructor(String.class,int.class,int.class);
		Object obj2=constructor.newInstance("hi",20,10);
		System.out.println("This by Constructor : "+obj2.toString());
		
		System.out.println("---------------------------- This are fields and annotations in Player Class----------------------------");
		Field[] fields=cl.getDeclaredFields();
		Field nameField=cl.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj,"nameField");
		nameField.setAccessible(false);
		for(Field f: fields) {
		Annotation[] annotations=f.getDeclaredAnnotations();
		for(Annotation ann:annotations)
		{   System.out.println("Field = "+f.getName());
			System.out.println("Annotatons = "+ann.annotationType());
		}
		}
		
		for(Field field:fields)
		{   field.setAccessible(true);
			if(field.getName().equals("name"))
			{
				System.out.println(field.get(obj));
				field.set(obj, "Ram");
				System.out.println(field.get(obj));
			}
			if(field.getName().equals("age"))
			{
				System.out.println(field.getInt(obj));
				field.setInt(obj,10 );
				System.out.println(field.getInt(obj));
			}
			if(field.getName().equals("jerseyNumber"))
			{
				System.out.println(field.getInt(obj));
				field.setInt(obj, 100);
				System.out.println(field.getInt(obj));
			}
			field.setAccessible(false);
		}
		System.out.println(obj);
		System.out.println("---------------------------- This are Methods in Player Class----------------------------");
		Method[] methods=cl.getDeclaredMethods();
		for(Method m:methods)
		{
			System.out.println("Methods = "+m.getName());
		}
		System.out.println(obj2);
		Method method1=cl.getMethod("getName");
		method1.setAccessible(true);
		System.out.println(method1.invoke(obj2));
		method1.setAccessible(true);
		for(Method m:methods)
		{  m.setAccessible(true);
			
			if(m.getName().equals("getName"))
			{
				System.out.println(m.invoke(obj2));
			}
			if(m.getName().equals("getAge"))
			{
				System.out.println(m.invoke(obj2));
			}
			if(m.getName().equals("getJerseyNumber"))
			{
				System.out.println(m.invoke(obj2));
			}
			if(m.getName().equals("setName"))
			{
				System.out.println(m.invoke(obj2,"hello"));
			}
			if(m.getName().equals("setAge"))
			{
				System.out.println(m.invoke(obj2,100));
			}
			if(m.getName().equals("setJerseyNumber"))
			{
				System.out.println(m.invoke(obj2,100));
			}
		   m.setAccessible(false);
		}
		System.out.println(obj2);
	}
}
