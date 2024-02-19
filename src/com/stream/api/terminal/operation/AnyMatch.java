package com.stream.api.terminal.operation;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch {
	/*
	 * What It Does?:
	 * 
	 * collect() method is a special case of reduction operation called mutable
	 * reduction operation because it returns mutable result container such as List
	 * or Set.
	 */
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		boolean anyMatch = names.stream().anyMatch(x -> x.equals("David"));

		System.err.println(anyMatch);// true
	}

}
