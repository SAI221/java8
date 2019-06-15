package com.bridgelabz.java8.defaultmethods;

public class MainTest {

	public static void main(String[] args) {
		MyInterface obj = new MyImpl();
		System.out.println(obj.hello());
		obj.method();
	}

}
