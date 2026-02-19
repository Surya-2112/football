package com.learn.myreflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.learn.myannotations.CannotAccess;

public class ObjectToJsonMain extends BaseClass{
	
	public static String getValueByMethod(Field field,Object obj) throws IllegalAccessException, InvocationTargetException
	{
		String getter="get"+changeName(field);
		Method method=null;
		Class cl=obj.getClass();
		try {
		 method=cl.getMethod(getter);
		}catch(Exception e)
		{
			System.out.println(getter+" is not found the methods");
			return null;
		}
		return ""+method.invoke(obj);
	}

	public static String getValueFromField(Field field,Object obj) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{   String value="";
		if(Modifier.isPrivate(field.getModifiers()))
		{
			value=getValueByMethod(field,obj);
		}else
		value=ObjectToString(field.get(obj));
		return value;
	}
	public static void getValueFromObject(Class cl,Object obj,StringBuilder result) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		Field [] fields=cl.getDeclaredFields();
		int i=0;
		for(Field field:fields)
		{   
			if(field.isAnnotationPresent(CannotAccess.class))
			{   System.out.println(field.getName()+" not Accessable");
				continue;
			}
			if(i!=0) { 
				result.append(", ");
			}
			result.append(field.getName());
			result.append(" : ");
			result.append(getValueFromField(field,obj));
			i++;
		}
	}

	public static String getJsonString(Object obj) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		StringBuilder result = new StringBuilder();
		Class cl = obj.getClass();
		result.append(cl.getSimpleName());
		result.append(" {");
		getValueFromObject(cl, obj,result);
		result.append(" }");
		return result.toString();
	}

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		Player player = new Player("hello", 21, 2);
		System.out.println(getJsonString(player));

	}

}
