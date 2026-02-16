package com.study.myexceptions;

public class MidClass extends ClassForThrows {

	// ClassForThrows cf=new ClassForThrows();
	float FloatDivition(float a, float b) {
		try {
			return divFloat(a, b);
		} catch (Exception e) {
			System.out.println("This from Mid Class " + e.toString());
			return -1;
		}
	}

	int IntegerDiviston(int a, int b) {
		return div(a, b);
	}

	double DoubleDivistion(double a, double b) throws ArithmeticException, UserExceptions {
		return divDouble(a, b);
	}
}
