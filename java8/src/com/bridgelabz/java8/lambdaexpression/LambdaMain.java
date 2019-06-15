package com.bridgelabz.java8.lambdaexpression;

import java.util.Scanner;

public class LambdaMain {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		
       LambdaFunctionalInterface lambda=(c,d)->{
    	   System.out.println(c+d);
       return "sum is "+(c+d);
       };
       
       System.out.println(lambda.hello(a,b));
	}

}
