package com.stream.api.intermidiate.operation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

//	flatMap() method is used to convert or flatten Stream of collections into Stream of collection values by removing the collection.
//
//	Removing collection such as List or Set from Stream is called flattening.
//
//	FlatMap() is part of Stream Intermediate Operations in Java 8.

	/*
	 * What is Flattening?
	 * 
	 * Flattening means converting multiple lists of lists and merge all values from
	 * several lists into a single list. In the end, we'll have only one List
	 * consisting of all values.
	 */

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("One", "Two", "Three");
		List<String> list2 = Arrays.asList("Four", "Five", "Six", "Seven");
		List<String> list3 = Arrays.asList("Eight", "Nine");
		List<List<String>> numberListObj = Arrays.asList(list1, list2, list3);
		System.out.println(numberListObj);// Output:-[[One, Two, Three], [Four, Five, Six, Seven], [Eight, Nine]]
		List<String> numberList = numberListObj.stream().flatMap(numbers -> numbers.stream())
				.collect(Collectors.toList());
		System.err.println(numberList);// Output:-[One, Two, Three, Four, Five, Six, Seven, Eight, Nine]

		// --------------------------------------------------------------------------

		List<List<String>> namesNested = Arrays.asList(Arrays.asList("Jeff", "Bezos"), Arrays.asList("Bill", "Gates"),
				Arrays.asList("Mark", "Zuckerberg"));
		List<String> namesFlatStream = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.err.println(namesFlatStream);// Output:- [Jeff, Bezos, Bill, Gates, Mark, Zuckerberg]
	}
}
