package com.bridgelabz.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFeatures {
	
	
	

	public static void main(String[] args) {
		
		 List<String> list=new ArrayList<String>();
		 list.add("sai");
		 list.add("pavan");
		 list.add("anu");
		 list.add("krishna");
		 Stream<String> stream = list.stream();
		stream.forEach(System.out::println);
		
		list.stream().filter(element -> element.contains("P"));
		
		boolean isValid = list.stream().anyMatch(element -> element.contains("p"));
		
		System.out.println(isValid);
		
		List<String> results 
		  = list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(results);
		
		List<String> results1 
		  = list.stream().map(element -> element.toLowerCase()).collect(Collectors.toList());

		System.out.println(results1);
	}

}
