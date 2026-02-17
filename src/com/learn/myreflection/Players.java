package com.learn.myreflection;

import com.learn.myannotations.Age;
import com.learn.myannotations.JerseyNumber;
import com.learn.myannotations.Name;

public class Players {
	
	@Name
	private String name;
	
	@Age
	private int age;
	
	@JerseyNumber
	private int jerseyNumber;
	
	Players() {}
	
	Players(String name, int age, int jerseyNumber)
	{
		this.name=name;
		this.age=age;
		this.jerseyNumber=jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
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
		return "Players [name=" + name + ", age=" + age + ", jerseyNumber=" + jerseyNumber + "]";
	}
	
	
}
