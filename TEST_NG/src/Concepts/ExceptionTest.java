package Concepts;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(expectedExceptions = ArithmeticException.class)
	public static void Divide() {
		int a=26;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	@Test
	public static void Add() {
		int a=26;
		int b=12;
		int c=a+b; 
		System.out.println(c);
		
	}
	
}
