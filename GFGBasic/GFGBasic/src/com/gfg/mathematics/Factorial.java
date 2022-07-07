package com.gfg.mathematics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 19; // use BigInteger instead of int  for value greater than 19
		
		Factorial factorial = new Factorial();
		int factorailValue =factorial.fact(x);
		System.out.println("Factorial of " + x + " is " + factorailValue );

	}
	
	public int fact(int x) {
		
		if( x== 0) {
			return 1;
		}
		return x*fact(x-1);
	}
}
