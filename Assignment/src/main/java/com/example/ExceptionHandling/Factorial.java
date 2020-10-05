package com.example.ExceptionHandling;

class FactorialDemo {

	public int factorial(int n) throws Exception{
		int fact=1;
		for(int i=n;i>0;i--) {
			if(fact<0) {				
				throw new Exception("factorial is out of int range");
			}
			fact=fact*i;
		}
		return fact;
	}
}

public class Factorial {
	public static void main(String[]args) {
		FactorialDemo fd = new FactorialDemo();
		try {
			int result = fd.factorial(6);
			System.out.println(result);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
