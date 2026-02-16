package com.study.myannotations;

import java.util.ArrayList;
import java.util.List;

@Author 
public class Annotation {

	@SuppressWarnings(value = { "unchecked" })
	void Suppress() {
		List l= new ArrayList();
	    l.add(10);
	    l.add("hi");
	    System.out.println(l.toString());
	}
}
