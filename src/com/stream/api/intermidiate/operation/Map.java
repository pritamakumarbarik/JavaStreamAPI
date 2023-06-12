package com.stream.api.intermidiate.operation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {

	// map() returns a stream consisting of the results of applying the given
	// function to the elements of this stream.

	// Map() using for manupulation of collection objects.
	
	//https://javaconceptoftheday.com/java-8-streams-beginners-guide/

	public static void main(String[] args) {
		List<String> names = Stream.of("Pritama", "Sritam", "Micky", "Lucky").map(name -> {
			if (name.equals("Pritama")) {
				name += " Kumar Barik";
			}
			return name;
		}).collect(Collectors.toList());
		System.out.println(names);// Output:- [Pritama Kumar Barik, Sritam, Micky, Lucky]
	}
}
