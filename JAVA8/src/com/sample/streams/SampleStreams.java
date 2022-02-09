package com.sample.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SampleStreams  {
	
	// A new java.util.stream has been added in Java 8 to perform 
	// filter/map/reduce like operations with the collection. 
	// Stream API will allow sequential as well as parallel execution

	public static void main(String args[]) {

		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		
		ProductInfo productInfo = new ProductInfo("apples", "123", 1.00, 5 );
		ProductInfo productInfo2 = new ProductInfo("cherries", "456", 2.00, 40 );
		ProductInfo productInfo3 = new ProductInfo("oranges", "789", 15.00, 30 );
		ProductInfo productInfo4 = new ProductInfo("banana", "452", 12.00, 12 );

		// demonstration of map method
		List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
		//System.out.println(square);

		// create a list of String
		List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

		// demonstration of filter method
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		//System.out.println(result);

		// demonstration of sorted method
		List<String> show = names.stream().sorted().collect(Collectors.toList());
		//System.out.println(show);

		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

		// collect method returns a set
		Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
		//System.out.println(squareSet);

		// demonstration of forEach method
		//number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

		// demonstration of reduce method
		int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
		
		List<ProductInfo> products = new ArrayList<>(Arrays.asList(new ProductInfo[] {
				productInfo , productInfo2 , productInfo3, productInfo4
		}));
		int sum = products.stream().map(ProductInfo::getQuantity).reduce(0, (a,b) -> { 
			return a+b;
					});

		System.out.println(even);
		
		System.out.println(sum);
		
	}

}
