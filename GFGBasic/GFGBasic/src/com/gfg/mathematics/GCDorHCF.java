package com.gfg.mathematics;

public class GCDorHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 7, y = 8;

		GCDorHCF gcdorHCF = new GCDorHCF();
		int z = gcdorHCF.gcdofNumbers(x, y);
		System.out.println(" GCD of x and y is " + z);

	}
	// euclidian algorithm optimized

	public int gcdofNumbers(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcdofNumbers(b, a % b);    // time complexity log( min (a,b);
	}
	
	// euclidian algorithm basic
	
	public int gcdeuclidianBasic(int a, int b) {
		while(a!=b) {
			if(a > b) {
				a= a-b;
			}else {
				b= b-a;
			}
		}
		return a;                // time complexity min(a, b))
	}

}
