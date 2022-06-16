package com.gfg.strings;

import java.util.Arrays;

public class LexographicRank {
	// int[] factorials;

	public static void main(String[] args) {
		String str = "string";
        System.out.println(findRank(str));

	}

	// A utility function to find factorial of n
	static int fact(int n) {
		return (n <= 1) ? 1 : n * fact(n - 1);
	}

	static int findSmallerInRight(String str, int low, int high) {
		int countRight = 0, i;
		for (i = low + 1; i <= high; ++i)
			if (str.charAt(i) < str.charAt(low))
				++countRight;
		return countRight;
	}
	
	static int findRank(String str)
    {
        int len = str.length();
        int mul = fact(len);
        int rank = 1;
        int countRight;
 
        for (int i = 0; i < len; ++i) {
            mul /= len - i;
 
            // count number of chars smaller
            // than str[i] from str[i+1] to
            // str[len-1]
            countRight = findSmallerInRight(str, i, len - 1);
            rank += countRight * mul;
        }
 
        return rank;
    }

	/*
	 * public int[] computeFactorials(int x) { factorials = new int[x];
	 * factorials[0] = 1; factorials[1] = 1; for (int i = 2; i < x; i++) {
	 * factorials[i] = i * factorials[i - 1]; } return factorials; }
	 * 
	 * public int lexographic_rank(String s) { int n = s.length();
	 * 
	 * int result = 0; String sortedString = sortString(s); for(int i=0;i<n;i++) {
	 * int smaller_count = 0; for(int j=0;j<n;j++) { if(s.charAt(i) ==
	 * sortedString.charAt(j)) { sortedString.charAt(j) = '#'; }
	 * 
	 * } } }
	 * 
	 * String sortString(String s) { char[] arrayvalues = s.toCharArray();
	 * Arrays.sort(arrayvalues); return arrayvalues.toString(); }
	 */

}
