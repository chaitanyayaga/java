package com.gfg.mathematics;

public class AllDivisors {

	public static void main(String[] args) {
		AllDivisors allDivisors = new AllDivisors();
		allDivisors.printDivisors1(25);

	}
	
	void printDivisors(int n) { // efficient not sorted Time Complexity Sqroot n
		
		for(int i=1;i*i<=n;i++) {
			if(n%i ==0) {
				System.out.print(i+" ");
				if(i != n/i) {
					System.out.print(n/i + " ");
				}
			}
		}
		
	}
	
	void printDivisors1(int n) {  // efficient and sorted Time Complexity 2 times Sqroot n~ square root n
		int i=1;
		for(i=1;i*i<n;i++) {
			if(n%i == 0) {
				System.out.print(i + " " );
			}
		}
		for(;i >=1;i--) {
			if(n%i ==0) {
				System.out.print(n/i + " " );
			}
			
		}
	}

}
