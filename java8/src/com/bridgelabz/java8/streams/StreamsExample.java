package com.bridgelabz.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {

String[] arr = new String[]{"P", "A", "V"};
Stream<String> stream = Arrays.stream(arr);
stream.forEach(System.out::println);

stream = Stream.of("V", "A", "P");
stream.forEach(System.out::println);

List<String> list = Arrays.asList("Pavan", "Opencodez");
stream = list.stream();
list.forEach(System.out::println);

list.parallelStream().forEach(System.out::println);

	}

}
