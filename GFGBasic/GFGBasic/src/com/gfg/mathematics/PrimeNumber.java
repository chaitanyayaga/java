package com.gfg.mathematics;

// Number which is divisble only  by 1 and itself is prime ex: 2 , 3 , 5 , 7 ....
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// divisors always appear in pairs
		// 30 ( 1 , 30 ) ( 2 , 15) ( 3 , 10 ) ( 5, 6)
		// so you can start from 2 traverse till sq root of n

		int x = 35;
		PrimeNumber primeNumber = new PrimeNumber();
		boolean y = primeNumber.isPrime(x);
		System.out.println(y);
	}

	boolean isPrime(int n) {
		// efficient checks starts
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		// efficient checks ends
		for (int i = 5; i * i < n; i = i + 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		/*
		 * for(int i=2;i*i<n;i++) { if(n%i ==0) { return false; } }  // normal check
		 */
		return true;
	}
}
