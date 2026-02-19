package com.learn.myreflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

import com.learn.myannotations.CannotAccess;
import com.learn.myannotations.Editable;
import com.learn.myannotations.OnlyRead;
import com.learn.myannotations.Range;

public class Main extends BaseClass {

	public static void methodSetValue(Method method, Field field, Object obj, Map.Entry pair)
			throws IllegalAccessException, InvocationTargetException {

		if (field.getType() == String.class) {
			method.invoke(obj, ObjectToString(pair.getValue()));
		}
		if (field.getType() == int.class) {
			method.invoke(obj, ObjectToInteger(pair.getValue()));
		}
	}

	public static void fieldSetValue(Field field, Object obj, Map.Entry pair)
			throws IllegalArgumentException, IllegalAccessException {
		if (field.getType() == String.class) {
			field.set(obj, ObjectToString(pair.getValue()));
		}
		if (field.getType() == int.class) {
			int value = ObjectToInteger(pair.getValue());
			if (field.isAnnotationPresent(Range.class)) {
				Range range = field.getAnnotation(Range.class);
				if (range.min() > value || range.max() < value) {
					System.out.println(field.getName() + " is out Of Range");
					return;
				}
			}
			field.setInt(obj, value);
		}
	}

	public static void ByField(Field field, Object obj, Map.Entry pair) throws Exception {
		if (field.isAnnotationPresent(Editable.class)) {
			fieldSetValue(field, obj, pair);
		} else if (field.isAnnotationPresent(OnlyRead.class)) {
			System.out.println(field.getName() + " cannot change");
		} else if (field.isAnnotationPresent(CannotAccess.class)) {
			System.out.println(field.getName() + " is not Accessable");
		}
	}

	public static void ByMethod(Field field, Object obj, Map.Entry map) throws Exception {
		String setter = "set" + changeName(field);
		Method method = null;
		try {
			method = obj.getClass().getMethod(setter, field.getType());
		} catch (Exception e) {
			System.out.println("Method is not founded");
			return;
		}
		methodSetValue(method, field, obj, map);
	}

	public static void accessPlayer(Map<String, Object> map, Object obj) throws Exception {
		System.out.println(obj.toString());
		for (Map.Entry pair : map.entrySet()) {
			Field field = null;
			try {
				Class cl=obj.getClass();
				field = cl.getDeclaredField((String) pair.getKey());
			} catch (NoSuchFieldException e) {
				System.out.println(pair.getKey().toString() + " is not a field of Players class");
				continue;
			}
			if (Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
				System.out.println(field.getName() + "is final or static value cannot be changed");
			} else if (Modifier.isPrivate(field.getModifiers())) {
				ByMethod(field, obj, pair);
			} else {
				ByField(field, obj, pair);
			}
		}
		System.out.println(obj.toString());
	}

	public static void main(String[] args) throws Exception {

		JsonToMap jtm = new JsonToMap();
		Class cl = Class.forName("com.learn.myreflection.Player");  
		Object	obj = cl.getDeclaredConstructor().newInstance();
		
		/*
		 * String json1 =
		 * "{ name : json1, age : 21, jerseyNumber : 2, id : 5, genrated : 5 }";
		 * Map<String, Object> map1 = jtm.jsonToMap(json1); accessPlayer(map1, obj);
		 * 
		 * String json2 = "{ name : json2, age : 22, jerseyNumber : 3 }"; Map<String,
		 * Object> map2 = jtm.jsonToMap(json2); accessPlayer(map2, obj);
		 */
		String json3 = "{ name : json3, age : 53, jerseyNumber : 4, phoneNumber : 9876543210 }";
		Map<String, Object> map3 = jtm.jsonToMap(json3);
		System.out.println(map3);
		accessPlayer(map3, obj);
	}
}
