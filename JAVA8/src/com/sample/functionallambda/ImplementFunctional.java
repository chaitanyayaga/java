package com.sample.functionallambda;

public class ImplementFunctional {

	// So lambda expressions are a means to create anonymous
	// classes of functional interfaces easily

	public static void main(String args[]) {
		
	FunctionalSample functionalSample = () ->System.out.println("Showing pages");
	functionalSample.showPages();
		

	/*	FunctionalSample functionalSample = new FunctionalSample() {
			@Override
			public void showPages() {
				System.out.println("Showing pages");
			}
		}; */
	}

}
