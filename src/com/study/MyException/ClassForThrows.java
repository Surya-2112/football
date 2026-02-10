package com.study.MyException;

class ClassForThrows {

  public int div(int a,int b)
  {
	  if(b==0) throw new ArithmeticException("Divistion by zero in int");
	  return a/b;
  }
  
  public float divFloat(float a, float b) throws ArithmeticException //it throws exception to users
, UserExceptions
  { 
	  if(b==0.0) throw new ArithmeticException("Divistion by zero in float"); // it thow to handle the Exception
	  if(b>10) throw new  UserExceptions("b should not greater than 10");
	  return a/b;
  }
  
  public double divDouble(double a,double b) throws ArithmeticException,UserExceptions
  { 
	  if(b==0.0) throw new ArithmeticException("Divistion by zero in Double");
	  if(b<10) throw new  UserExceptions("b should not less than 10");
	  return a/b;
  }
}
