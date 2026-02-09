package com.study.MyGenerics;
import com.footBall.Player;

import java.util.ArrayList;

import com.footBall.Human;
import com.footBall.SupportStaff;

public class Main {

	public static void main(String[] args) {
		MyList<Human> list= new MyList<>();
		for(int i=0;i<5;i++) {
			list.add(new Player()); }
		for(int i=0;i<5;i++) {
			list.add(new Human()); }
		for(int i=0;i<5;i++) {
			list.add(new SupportStaff());
		}
		System.out.println(list.size()+ " "+list.get(10));
		list.remove(10);
		System.out.println(list.get(10));
	}

}
