package com.bridgelabz.java8.defaultmethods;

public class MyImpl implements MyInterface{

	@Override
	public void method() {
		System.out.println("method");
		
	}
	public String hellow(){
		
		return "implementation in class";
		
	}
	
	public String hello() {
		System.out.println("in implementation");
		return MyInterface.super.hello();
	}

}
