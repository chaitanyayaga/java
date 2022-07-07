package com.gfg.mathematics;

public class TrailzerosInfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20;
		/*TrailzerosInfactorial trailzerosInfactorial = new TrailzerosInfactorial();
		int value = trailzerosInfactorial.factorialOfNumber(x);
		int trailingZeros = 0;
		while(value%10 == 0) {
			value = value/10;
			trailingZeros++;
		}
		System.out.println("Trailing Zeros in " + x + " factorial is " + trailingZeros);*/
		int trailingZeros = 0;
		for(int i=5;i<x;i=i*5) {
			trailingZeros = trailingZeros + x/i;
		}
		System.out.println("Trailing Zeros in " + x + " factorial is " + trailingZeros);
	}
	
	public int factorialOfNumber(int x) {
		//int value = 1;
		if(x==0)
			return 1;
		return x*factorialOfNumber(x-1);
		
	}

}
