package com.stream.api.terminal.operation;

import java.util.Arrays;
import java.util.OptionalInt;

public class Reduce {
	/*What is reduce() ?
	i) It is a terminal operation.		
    ii)Produces a single value.
    ii)This method performs reduction operation on elements of a stream using initial value and binary operation.*/
	
	public static void main(String[] args) {
		// 1st approach-> Here we define 0 as default value.
		int sum = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).reduce(0, (a, b) -> a + b);
		System.err.println(sum);// Output :- 32

		// 2nd approach-> Here we handled the output with Optional class.
		OptionalInt sumApp2 = Arrays.stream(new int[] { 7, 5, 9, 2, 8, 1 }).reduce((a, b) -> a + b);
		System.err.println(sumApp2);// Output :- 32
	}

}
