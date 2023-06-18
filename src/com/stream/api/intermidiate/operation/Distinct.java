package com.stream.api.intermidiate.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
	/*
	 * What is distinct in Stream Api ?
	 * 
	 * i) Distinct is a intermediate operation. 
	 * ii)Returns Stream of unique element.
	 */
	public static void main(String[] args) {

		// Here the list having duplicate element.
		List<String> names = Arrays.asList("Pritam", "Sritam", "Uttam", "Josh", "pritam");
		List<String> distinctNames = names.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNames);// Output - [Pritam, Sritam, Uttam, Josh, pritam]

	}

}
