package com.sample.forEach;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;


/* forEach() method in Iterable interface  which takes Implementation  of Consumer 
     interface as an argument
    The number of lines might increase but forEach method helps in having the 
    logic for iteration and business logic at separate place resulting in 
    higher separation of concern and cleaner code. */
public class ForEachLoop {
	
	
	public static void main(String args[]) {
		
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(23);
		numberList.add(44);
		numberList.add(55);
		numberList.add(66);
		
		// Traversing through Iterator
		
		Iterator<Integer> numberIterator = numberList.iterator();
		
		while(numberIterator.hasNext()) {
			/*
			 * if((Integer) numberIterator.next() > 10) { numberIterator.remove(); }
			 */
			System.out.println("Iterator "+ numberIterator.next());
			
		}
		numberList.forEach(new MyConsumer());
		
		numberList.forEach( s -> System.out.println(s));
		
		
		
	}

}


