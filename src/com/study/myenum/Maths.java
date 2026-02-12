package com.study.myenum;

enum Maths {

	ADD(20, 10) {
		public int operations() {
			System.out.println("Add");
			return a + b;
		}
	}, // public static final Maths ADD = new Maths(20, 10); perfor when cclass is loaded
	SUBTRACT(2, 1) {
	 int operations() {
		 System.out.println("SUBTRACT");
			return a - b;
		}
	},
	MULTIPLY(200, 100) {
		 int operations() {
			 System.out.println("MULTIPLY");
			return a * b;
		}
	},
	DIVISION(2000, 1000) {
		protected int operations() {
			System.out.println("DIVISION");
			return a / b;
		}
	};

	int a, b;

	Maths(int i, int j) {
		this.a = i;
		this.b = j;
		System.out.println(operations());
	}

	abstract int operations();
//	int operations()
//	{
//		return a;
//	}
	
}
