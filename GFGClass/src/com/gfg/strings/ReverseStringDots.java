package com.gfg.strings;

public class ReverseStringDots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "i.like.this.program.very.much";
		String[] arrayValues = s1.split("\\.");
		StringBuilder valueBuilder = new StringBuilder();
		for(int i= arrayValues.length-1;i>=0;i--) {
			valueBuilder.append(arrayValues[i]);
			if(i!=0) {
				valueBuilder.append(".");
			}
		}
		System.out.println(valueBuilder.toString());

	}

}
