package com.stream.api.terminal.operation;

import java.util.Arrays;
import java.util.OptionalInt;

public class Min {

	/*
	 * What is min() in stream? i)Find the minimum element from the stream wrapped
	 * optional object. ii)This is terminal operation.
	 */
	public static void main(String[] args) {
		OptionalInt min = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).min();
		System.out.println(min.getAsInt());//Output=1
	}
}
