package com.sample.forEach;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer>  {

	
	@Override
	public void accept(Integer t) {
		
		if(t > 10) {
			t= t-10;
			System.out.println("t is " + t);
		}
	}

}
