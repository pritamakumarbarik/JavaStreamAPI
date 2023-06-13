package com.stream.api.intermidiate.operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
	/*
	 * What is distinct in Stream Api ?
	 * 
	 * i) Distinct is a intermediate operation. ii)Returns Stream of unique element.
	 */

	public static void main(String[] args) {

		// Natural default sorting order.
		List<String> names = Arrays.asList("Pritam", "Sritam", "Uttam", "Josh");
		System.out.println(names);// Output:- [Pritam, Sritam, Uttam, Josh]
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);// Output:- [Josh, Pritam, Sritam, Uttam]

		/* _______________________________________________________ */

		// Using comparator reverseOrder for sorting.
		List<String> comparatorReverseSort = names.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(comparatorReverseSort);// Output:- [Uttam, Sritam, Pritam, Josh]

		// Using comparator reverseOrder for sorting.
		List<String> comparatorUsingTrenary = names.stream()
				.sorted((word1, word2) -> (word1.length() < word2.length()) ? 1
						: (word1.length() > word2.length()) ? -1 : (word1.charAt(0) == word2.charAt(0)) ? 1 : -1)
				.collect(Collectors.toList());
		System.err.println(comparatorUsingTrenary);// Output:-[Sritam, Pritam, Uttam, Josh]

		// Comparator comparing using string natural sorting order .
		List<String> comparatorUsingComparing = names.stream().sorted(Comparator.comparing(String::valueOf))
				.collect(Collectors.toList());
		System.out.println(comparatorUsingComparing);

	}

}
