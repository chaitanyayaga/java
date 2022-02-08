package com.sample.deafultstatic;

public interface MyInterface {

	 static void add(int a, int b) {
		 int sum = a+b;
		 System.out.println(" Sum of a and b is "+  sum );
	 }
	 
	 default  String sayHello(String name) {
		 return " Hello  " + name ;
	 }
}
