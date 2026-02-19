package com.learn.myreflection;

import java.lang.reflect.Field;

public class BaseClass {

	public static String ObjectToString(Object obj) {
		return obj.toString();
	}
	
	public static int ObjectToInteger(Object obj)
	{
		String str=ObjectToString(obj);
		return Integer.parseInt(str);
	}
	
	public static String changeName(Field field) {
		return field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1, field.getName().length());
	}

}
