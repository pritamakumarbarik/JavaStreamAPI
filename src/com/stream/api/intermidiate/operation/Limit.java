package com.stream.api.intermidiate.operation;

import java.util.ArrayList;
import java.util.List;

public class Limit {

	/*
	 * What is limit()? i)Returns a stream containing first n elements. ii)It is a
	 * Intermediate Operation.
	 */

	public static void main(String[] args) {

		/*
		 * What is limit() in stream API ? i)It is intermediate Operation. ii) Returns a
		 * stream containing first n elements.
		 */
		List<String> names = new ArrayList<>();
		names.add("pritam");
		names.add("sritam");
		names.add("sam");
		names.add("julia");
		names.add("david");
		names.add("bunny");
		// Selecting first 2 names
		names.stream().limit(2).map(name -> {
			if (name.contains("m")) {
				name += "z";
			}
			return name;
		}).forEach(System.out::println);
	}
}
