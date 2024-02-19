package com.stream.api.terminal.operation;

import java.util.ArrayList;
import java.util.List;

public class Count {

	// What It Does? : Returns the number of elements in a stream.

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("David");

		names.add("Johnson");

		names.add("Samontika");

		names.add("Brijesh");

		names.add("John");

		long count = names.stream().filter(x -> x.length() == 4).count();

		System.err.println(count);

	}

}
