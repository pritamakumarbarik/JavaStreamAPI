package com.stream.api.terminal.operation;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {
	/*
	 * What It Does? : This method returns true if all the elements of a stream
	 * matches with given predicate. Otherwise returns false.
	 */

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		boolean allMatch = names.stream().allMatch((x) -> x.length() > 3);

		System.out.println(allMatch);// true

	}

}
