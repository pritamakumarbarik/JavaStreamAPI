package com.stream.api.intermidiate.operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	/*
	 * What is sortd() in Strem Api ? i)Sorted the collection in natural order. ii)
	 * Sorted is a intermediate operation. iii)It allows comparator for user defined
	 * sorting order.
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

		/* _______________________________________________________ */

		// Using comparator reverseOrder for sorting.
		List<String> comparatorUsingTrenary = names.stream()
				.sorted((word1, word2) -> (word1.length() < word2.length()) ? 1
						: (word1.length() > word2.length()) ? -1 : (word1.charAt(0) == word2.charAt(0)) ? 1 : -1)
				.collect(Collectors.toList());
		System.err.println(comparatorUsingTrenary);// Output:-[Sritam, Pritam, Uttam, Josh]

		/* _______________________________________________________ */

		// Comparator comparing using string natural sorting order .
		List<String> comparatorUsingComparing = names.stream().sorted(Comparator.comparing(String::valueOf))
				.collect(Collectors.toList());
		System.out.println(comparatorUsingComparing);// Output:-[Josh, Pritam, Sritam, Uttam]

		/* _______________________________________________________ */

		List<Integer> numbers = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		List<Integer> reversedNum = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversedNum);// Output:-[9, 8, 7, 6, 5, 4, 3, 2, 1]
		/* _______________________________________________________ */

	}
}
