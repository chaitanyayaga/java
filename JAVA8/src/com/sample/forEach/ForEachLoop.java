package com.sample.forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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


