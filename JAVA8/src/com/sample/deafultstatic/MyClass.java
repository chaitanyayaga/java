package com.sample.deafultstatic;

public class MyClass implements MyInterface, MyInterface1{

	public static void main(String[] args) {
		
		//MyInterface.add(10, 20);

		MyClass myClass = new MyClass();
		
		String message = myClass.sayHello("Chaitanya");
		
		System.out.println(message);
	}

	@Override  // default method overridden to avoid diamond problem
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return MyInterface.super.sayHello(name);
	}

}
