package com.sample.deafultstatic;

public interface MyInterface1 {
	
	static void add(int a, int b) {
		 int sum = a+b; 
		 System.out.println(" Sum of a and b in interface1 is  "+  sum );
	 }
	 
	 default  String sayHello(String name) {
		 return " Hello in interface 1 " + name ;
	 }
	 
	 default String diamond() {
		 return "Is the diamond issue present";
	 }

}
