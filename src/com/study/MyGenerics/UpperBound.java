package com.study.mygenerics;



public class UpperBound{
	
	public int  sumListElement(MyList<? extends Number> list)
	{    int sum=0;
	    for(int i=0;i<list.size();i++)
	    {
	    		sum=sum+list.get(i).intValue();
	    }
		return sum;
	}
}
