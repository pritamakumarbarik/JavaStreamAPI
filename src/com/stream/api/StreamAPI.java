package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.stream.api.pojos.Employee;

public class StreamAPI {

	public static void main(String[] args) {
		System.out.print("Count occurance of role List of user?");
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Pritam");
		e1.setRole("Admin");

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Pritam");
		e2.setRole("Admin");

		Employee e3 = new Employee();
		e3.setId(2);
		e3.setName("Pritam");
		e3.setRole("User");

		List<Employee> user = new ArrayList<>(Arrays.asList(e1, e2, e3));

		Map<String, Long> roleOccurence = user.stream()
				.collect(Collectors.groupingBy(x -> x.getRole(), Collectors.counting()));
		System.err.println(roleOccurence);
		System.out.print("Count occurance of role List of user?");

	}

}
