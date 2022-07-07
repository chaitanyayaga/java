package com.gfg.mathematics;

// Prime factors are the divisors which are Prime
// A number can be written as mutiplication's of power of prime factors
// ex : 45 = 2 3*3 5*5 ( any numbers has mutiplication of power of prime numbers) 

public class PrimeFactors {

	public static void main(String[] args) {
		PrimeFactors primeFactors = new PrimeFactors();
		primeFactors.printPrimeFactors(20);
	}
	
	void printPrimeFactors(int x) {
		
		if(x <= 1) return;
		
		for(int i=2;i*i <= x;i++) {
			
			if(x%2 ==0) {
				System.out.println(" "+i);
				x= x/i;
			}
			
		}
			
		if(x>1) {
			System.out.println(" "+x);
		}
		
	}

}
