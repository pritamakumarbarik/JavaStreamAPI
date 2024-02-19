package com.stream.api.intermidiate.operation;

import java.util.ArrayList;
import java.util.List;

public class Skip {
	/*
	 * What is skip() in stream API ?
	 *  i)It is intermediate Operation.
	 *  ii)Returns a stream after skipping first n elements..
	 */
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("pritam");
		names.add("sritam");
		names.add("sam");
		names.add("julia");
		names.add("david");
		names.add("bunny");
		// skip first 2 names
		names.stream().skip(2).map(name -> {
			if (name.contains("m")) {
				name += "z";
			}
			return name;
		}).forEach(System.out::println);
	}

}
