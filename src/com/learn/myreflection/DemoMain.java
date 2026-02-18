package com.learn.myreflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import com.learn.myannotations.Age;
import com.learn.myannotations.JerseyNumber;
import com.learn.myannotations.Name;

public class DemoMain {
	public static void main(String args[]) throws Exception
	{
		DemoPlayers p1=new DemoPlayers("surya",21,2);
		System.out.println("Players :"+p1.toString());
		
		Class<?> cl=Class.forName("com.learn.myreflection.DemoPlayers");
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
				field.setInt(obj,10 );  // we can add a values in out of ranges
				System.out.println(field.getInt(obj));
			}
			if(field.getName().equals("jerseyNumber"))
			{
				System.out.println(field.getInt(obj));
				field.setInt(obj, 100);  // we can changes the values  
				System.out.println(field.getInt(obj));
			}
			field.setAccessible(false);
		}
		System.out.println(obj);
		
		System.out.println(p1);
		for(Field  field: fields)
		{   field.setAccessible(true);
			Annotation[] ann=field.getDeclaredAnnotations();
			for(Annotation an: ann)
			{ 
				if(an.annotationType().equals(Name.class))
				{
					field.set(p1, "prakash");
				}
				if(an.annotationType().equals(Age.class))
				{	
					field.set(p1, 50);   // we can add a values in out of ranges

				}
				if(an.annotationType().equals(JerseyNumber.class))
				{
					System.out.println("JerseyNumber cannot be changes"); // we can changes the values  
				}
			}
			field.setAccessible(false);
		}
		System.out.println(p1);
		System.out.println("---------------------------- This are Methods in Player Class----------------------------");
		System.out.println(obj2);
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
				System.out.println(m.invoke(obj2,100));// we can add a values in out of ranges
			}
			if(m.getName().equals("setJerseyNumber"))
			{
				System.out.println(m.invoke(obj2,100)); // we can changes the values  
			}
		   m.setAccessible(false);
		}
		System.out.println(obj2);
		
		System.out.println("--------------------------This Final field-----------------------------");
		System.out.println(p1+" "+p1.getId());
		Field finalField=cl.getDeclaredField("id");
		finalField.setAccessible(true);
		finalField.setInt(p1, 20); // this will allow changing the final values when a value assign in constructor
		finalField.setAccessible(false);
		System.out.println(p1 +" "+p1.getId());
		System.out.println(obj);
		Field finalField1=cl.getDeclaredField("id1");
		finalField1.setAccessible(true);
		finalField1.setInt(obj, 20); // this will not allow changing the final values if it is initialize
		finalField1.setAccessible(false);
		System.out.println(obj);
		
		System.out.println("--------------------------This Final field-----------------------------");
		System.out.println(p1.getValue());
		Field staticField=cl.getDeclaredField("value");
	    staticField.setAccessible(true);
	    staticField.setInt(p1, 0);
	     System.out.println(p1.getValue());
		
		
	}
}
