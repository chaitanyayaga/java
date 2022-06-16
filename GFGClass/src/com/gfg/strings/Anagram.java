package com.gfg.strings;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "aba", s2= "abd";
		Anagram anagram = new Anagram();
		System.out.println(anagram.isAnagram(s1, s2));
	}
	
	boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int [] charFreq = new int[26];
		for(int i=0;i<s1.length();i++) {
			charFreq[s1.charAt(i) -'a']++;
			charFreq[s2.charAt(i) -'a']--;
		}
		
		for(int i=0;i<charFreq.length;i++) {
			if(charFreq[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
