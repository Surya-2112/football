package com.study.mygeneric;


public class GenericError {

	void Error(MyList<?> l) {
		//l.set(0, l.get(0)); // The method set(int, capture#1-of ?) in the type List<capture#1-of ?> is
								// notapplicable for the arguments (int, capture#2-of ?) (? is the uknowen type)
		helper(l);
		
	}
	
	private <A> void helper(MyList<A> l)
	{
		l.set(0,l.get(0)); //this is the A Type so that we can set the value 
	}

}
