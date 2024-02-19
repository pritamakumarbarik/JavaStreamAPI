package com.stream.api.terminal.operation;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirst {
	/*
	 * What It Does? : Returns first element of a stream wrapped in an Optional
	 * object.
	 */
	public static void main(String[] args) {
		Optional<String> firstElement = Stream.of("First", "Second", "Third", "Fourth").findFirst();

		if (firstElement.isPresent()) {// Here I used Java 8 Optional to handle null
			System.out.println(firstElement.get());// Output:- First
		}

	}

}
