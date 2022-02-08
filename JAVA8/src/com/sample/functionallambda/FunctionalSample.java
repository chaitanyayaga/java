package com.sample.functionallambda;

@FunctionalInterface
public interface FunctionalSample {
	
	//@FunctionalInterface annotation is a facility to avoid the accidental 
	//addition of abstract methods in the functional interfaces
	
	// One of the major benefits of the functional interface is the possibility 
	// to use lambda expressions to instantiate them
	
	void showPages();
	
	//void printPages(); second abstract method not  allowed in functional interfaces
	
	default String sayBye(String s) {
		return "Bye " + s;
	}
	
	

}
