package com.stream.api.terminal.operation;

import java.util.ArrayList;
import java.util.List;

public class NonMatch {
	/*
	 * What It Does? : Returns true only if all the elements of a stream doesn’t
	 * match with given predicate.
	 */

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		boolean noneMatch = names.stream().filter(x -> x.length() > 4).noneMatch((n) -> n.contains("z"));

		System.out.println(noneMatch);
	}

}
