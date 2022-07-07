package com.gfg.mathematics;

public class PallindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int x = 676;
		int x= 882;
		
		int temp =x ,rev =0;
		
		while(x > 0) {
		  rev = rev*10 + x%10;
		  x = x/10;
		}
        
		if(temp==rev) {
			System.out.println(temp + " is Palindrome ");
		}else {
			System.out.println(temp +" is not Palindrome ");
		}
	}

}
