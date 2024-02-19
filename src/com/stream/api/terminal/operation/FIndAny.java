package com.stream.api.terminal.operation;

import java.util.Optional;
import java.util.stream.Stream;

public class FIndAny {
	/*	
	 * What It Does? : Randomly returns any one element in a stream. The result of
	 * this operation is unpredictable. It may select any element in a stream.
	 * Multiple invocations on the same source may not return same result.
	 */

	public static void main(String[] args) {
		Optional<String> anyElement = Stream.of("First", "Second", "Third", "Fourth").findAny();
		if (anyElement.isPresent()) {
			System.err.println(anyElement.get());
		}

	}

}
