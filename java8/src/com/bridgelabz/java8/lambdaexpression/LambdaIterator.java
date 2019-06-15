package com.bridgelabz.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaIterator {

	public static void main(String[] args) {
		  List<String> list=new ArrayList<String>();  
	       list.add("Shrishti");         
	       list.add("Divya");       
	       list.add("Nandan");         
	       list.add("Krishna");         
	       list.add("Pavan"); 
	       System.out.println("elements in List");
	       list.forEach(          
	           // lambda expression        
	           (names)->System.out.println(names)         
	       );
	       System.out.println("lambda***************");
	       list.forEach(System.out::println);

	}

}
