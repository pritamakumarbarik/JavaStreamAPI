package com.stream.api.terminal.operation;

import java.util.Arrays;
import java.util.List;

public class ToArray {

	/*
	 * What is toArray() ?
	 * i)It is a terminal operation.
	 * ii) Returns an array containing elements of a stream.
	 */

	public static void main(String[] args) {
		List<String> names = Arrays.asList("pritama", "sritam", "mickey");
		Object[] nameArr = names.stream().toArray();
		System.err.println(Arrays.toString(nameArr));// Output:- [pritama, sritam, mickey]
	}

}
