package com.stream.api.grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.stream.api.pojos.Department;
import com.stream.api.pojos.Person;

import javafx.util.Pair;

public class Driver {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person(1, "Alex", 100d, new Department(1, "HR")),
				new Person(2, "Brian", 200d, new Department(1, "HR")),
				new Person(3, "Charles", 900d, new Department(2, "Finance")),
				new Person(4, "David", 200d, new Department(2, "Finance")),
				new Person(5, "Edward", 200d, new Department(2, "Finance")),
				new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
				new Person(7, "George", 900d, new Department(3, "ADMIN")));

		Map<Department, List<Person>> groupByDepartment1 = persons.stream()
				.collect(Collectors.groupingBy(Person::getDepartment));

		// Grouping by department
//		groupByDepartment.forEach((department, people) -> {
//			System.out.println("Department: " + department.getName());
//			System.out.println("People: ");
//			people.forEach(person -> System.out.println("  " + person.getName()));
//			System.out.println();
//		});
		System.out.println(groupByDepartment1);
		// Grouping by name
		Map<String, List<Person>> groupByDepartment2 = persons.stream().collect(Collectors.groupingBy(Person::getName));
		System.out.println(groupByDepartment2);

		Map<Department, List<Integer>> map = persons.stream().collect(
				Collectors.groupingBy(Person::getDepartment, Collectors.mapping(Person::getId, Collectors.toList())));
		System.out.println(map);

		// Grouping by salary and department pair
		Map<Object, List<Integer>> map2 = persons.stream()
				.collect(Collectors.groupingBy(person -> new Pair<>(person.getSalary(), person.getDepartment()),
						Collectors.mapping(Person::getId, Collectors.toList())));
		System.out.println(map2);

		// Grouping by salary and department pair
		Map<Object, Long> map3 = persons.stream()
				.collect(Collectors.groupingBy(Person::getSalary, Collectors.counting()));
		System.out.println(map3);
	}

}
