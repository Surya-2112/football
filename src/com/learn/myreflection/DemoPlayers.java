package com.learn.myreflection;

import com.learn.myannotations.Age;
import com.learn.myannotations.JerseyNumber;
import com.learn.myannotations.Name;
import com.learn.myannotations.Range;

public class DemoPlayers {

	final int id;
	
	final int id1 = 10;
	
	static int value;

	@Name
	private String name;

	@Age
	@Range(min=15,max=50)
	private int age;

	@JerseyNumber
	private int jerseyNumber;

	DemoPlayers() {
		this.age = 15;
		this.id = value;
		value++;
	}

	DemoPlayers(String name, int age, int jerseyNumber) {
		this.name = name;
		this.age = age;
		this.jerseyNumber = jerseyNumber;
		this.id = value;
		value++;
	}

	public static int getValue() {
		
		return value;
	}

	public static void setValue(int value) {
		DemoPlayers.value = value;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", age=" + age + ", jerseyNumber=" + jerseyNumber + "]";
	}

}
