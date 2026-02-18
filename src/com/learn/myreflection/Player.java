package com.learn.myreflection;

import com.learn.myannotations.Age;
import com.learn.myannotations.CannotAccess;
import com.learn.myannotations.Editable;
import com.learn.myannotations.GetAge;
import com.learn.myannotations.GetJerseyNumber;
import com.learn.myannotations.JerseyNumber;
import com.learn.myannotations.Name;
import com.learn.myannotations.OnlyRead;
import com.learn.myannotations.Range;
import com.learn.myannotations.SetAge;
import com.learn.myannotations.SetJerseyNumber;

public class Player {
	
	@OnlyRead
	final private int id;
	
	@CannotAccess
	static private int genrated=1;
	
	@Editable
	@Name
	public String name;
	
	@Editable
	@Age
	@Range(min=15,max=45)
	public int age;
	
	@Editable
	@JerseyNumber
	private int jerseyNumber;
	
	Player()
	{
		this.id=genrated;
		this.age=15;
		auto();
	}
	
	Player(String name,int age,int jerseyNumber)
	{
		this.name=name;
		this.age=age;
		this.jerseyNumber=jerseyNumber;
		this.id=genrated;
		auto();
	}
	
	public void auto()
	{
		genrated+=1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@GetAge
	public int getAge() {
		return age;
	}
	
	@SetAge
	public void setAge(int age) {
		this.age = age;
	}
	
	@GetJerseyNumber
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	
	@SetJerseyNumber
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", jerseyNumber=" + jerseyNumber + "]";
	}
	
	
}
