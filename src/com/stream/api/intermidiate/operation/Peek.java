package com.stream.api.intermidiate.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Peek {

	/*
	 * What is peek() in java ? i) peek is a Intermediate. ii)Performs an additional
	 * action on each element of a stream. This method is only to support debugging
	 * where you want to see the elements as you pass in a pipeline.
	 */

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().peek(System.out::println);

		/* _______________________________________________________ */

		List<String> names = new ArrayList<>();
		names.add("sam");
		names.add("ram");
		names.add("santosh");
		names.add("brijesh");
		names.add("john");
		names.add("david");
		names.stream().filter(name -> name.length() > 5).peek(e -> System.out.println("Filtered Name :" + e))
				.map(String::toUpperCase).peek(e -> System.out.println("Mapped Name :" + e)).toArray();

		/* _______________________________________________________ */
	}
}
