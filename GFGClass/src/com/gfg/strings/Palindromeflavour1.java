package com.gfg.strings;

public class Palindromeflavour1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan , a canal: Panama";
		Palindromeflavour1 palindromeflavour1 = new Palindromeflavour1();
		System.out.println(palindromeflavour1.checkPalindrome(s));
	}

	boolean checkPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (!isAlphaNumericValue(s.charAt(i))) {
				i++;
			} else if (!isAlphaNumericValue(s.charAt(j))) {
				j--;
			} else {
				if (!areEqual(s.charAt(i), s.charAt(j))) {
					return false;
				} else {
					i++;
					j--;
				}
			}
		}
		return true;
	}

	boolean isAlphaNumericValue(char c) {
		return ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
	}

	boolean areEqual(char c1, char c2) {
		return ((c1 == c2) || ((c1 - 'a' + 'A') == c2) || ((c1 - 'A' + 'a') == c2));
	}
}
