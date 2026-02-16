package com.study.mygeneric;

import java.util.List;

public class LowerBound {

	public static void addElement(MyList <? super Integer> list)
	{
		for(int i=0;i<5;i++)
		{
			list.add(i);
		}
	}
	
}
