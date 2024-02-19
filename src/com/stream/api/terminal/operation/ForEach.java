package com.stream.api.terminal.operation;

import java.util.stream.Stream;

public class ForEach {

	public static void main(String[] args) {
		/*
		 * What is ForEach() ? 
		 * i) It is a terminal Operation. 
		 * ii)Produces a non stream results such as primitive a collection or no value at all.
		 */
		Stream.of("Pritam", "Sritam", "Mickey").forEach(name -> {
			System.out.println(name);//Output:-Pritam Sritam Mickey
		});

	}

}
