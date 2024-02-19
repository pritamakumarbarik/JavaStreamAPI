package com.stream.api.terminal.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect {
	/*
	 * What is collect()?
	 * i)It ia terminal operation.
	 *  ii)Returns mutable container  such as List or Set.
	 */

	public static void main(String[] args) {

		List<String> names = Arrays.asList("pritama", "sritam", "mickey", "priyam", "poonam");
		List<String> result = names.stream().filter(name -> name.contains("p")).collect(Collectors.toList());
		System.err.println(result);// Output :- [pritama, priyam, poonam]

		// Collect with grouping by which can give a map object.
		Map<Integer, Long> groupByLength = names.stream()
				.collect(Collectors.groupingBy(x -> x.length(), Collectors.counting()));
		System.err.println(groupByLength);// Output :-{6=4, 7=1}
	}

}
