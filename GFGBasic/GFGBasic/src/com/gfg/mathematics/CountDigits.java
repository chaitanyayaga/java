package com.gfg.mathematics;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 863456789;
		
		int digits = 0;
		
		while(x > 0) {
			x = x/10;
			digits++;
		}

		System.out.println("Digits in " + x + " is " + digits);
	}

}
