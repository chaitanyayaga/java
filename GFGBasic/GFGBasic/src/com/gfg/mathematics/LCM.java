package com.gfg.mathematics;

public class LCM {
 public static void main(String args[]) {
	 int x = 7 , y = 14 ;
	 LCM lcm = new LCM();
	 int z = lcm.lcm(x, y);
	 System.out.println(" lcm of a and y is " + z);
	 
  }
 
 int gcd(int a , int b) {
	 if(b ==0)
		 return a;
	 return gcd(b, a%b);
 }
 
 int lcm(int a, int b) {
	 return (a*b)/gcd(a,b);
 }
}
