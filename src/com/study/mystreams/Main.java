package com.study.mystreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<10;i++) l.add(i);
		System.out.println(l.toString());
		List<Integer> list=l.stream().filter((x)-> x %2 == 0 ).toList();
		System.out.println(list.toString());
	}

}
