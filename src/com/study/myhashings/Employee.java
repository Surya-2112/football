package com.study.myhashings;

public class Employee {
	public int id;
	public String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean Myequals(Employee e) {
		if (e != null) {
			return this.MyhashCode() == e.MyhashCode();}
		else {
			return false;}
	}

	public int MyhashCode() {
		int hash = 31;
		hash = hash * id + name.hashCode();
		return hash;
	}
}
