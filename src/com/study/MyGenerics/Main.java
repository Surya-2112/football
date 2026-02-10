package com.study.MyGenerics;

import com.footBall.Player;

import java.util.ArrayList;
import java.util.List;

import com.footBall.Human;
import com.footBall.SupportStaff;

public class Main {

	public static void bounded() {
		GenericBounded<Integer> l1 = new GenericBounded<Integer>();
		// GenericBounded<Human> l2=new GenericBounded<Human>(); // Its shows Bound
		// mismatch Exception at runtime
		l1.add(10);
		System.out.println(l1.get(0));
	}

	public static MyList createList() {
		MyList<Human> list = new MyList<>();
		for (int i = 0; i < 5; i++) {
			list.add(new Player());
		}
		for (int i = 0; i < 5; i++) {
			list.add(new Human());
		}
		for (int i = 0; i < 5; i++) {
			list.add(new SupportStaff());
		}
		System.out.println(list.size() + " " + list.get(10));
		list.remove(10);
		System.out.println(list.get(10));

		MyList<Integer> l = new MyList<>();
		l.add(1000);
		l.add(1000);
		System.out.println(l.compare(l.get(0), l.get(1)));
		return list;
	}
	
	public static void upperBound()
	{    UpperBound up=new UpperBound();
		MyList<Integer>list=new MyList<>();
		for(int i=0;i<5;i++)
		{
			list.add(i+1);
		}
		System.out.println("This is UpperBound = "+ up.sumListElement(list));
	}
	
	public static void lowerBound()
	{
		LowerBound lb=new LowerBound();
		MyList<Number>list=new MyList();
		lb.addElement(list);
		System.out.println("This is LowerBound Value");
		for(int i=0;i<5;i++)
		{
			System.out.println(list.get(i));
		}
		
	}
	public static void main(String[] args) {
		createList();
		bounded();
		upperBound();
		lowerBound();
	}

}
