package Concepts;

import org.testng.annotations.Test;

public class Dependency {

	@Test(dependsOnMethods = "Test4")
	public static void Test1() {
		System.out.println("Test1");
	}
	@Test(dependsOnMethods = "Test5")
	public static void Test2() {
		System.out.println("Test2");
	}
	@Test(dependsOnMethods = "Test6")
	public static void Test3() {
		System.out.println("Test3");
	}
	@Test
	public static void Test4() {
		System.out.println("Test4");
	}
	@Test
	public static void Test5() {
		System.out.println("Test5");
	}
	@Test
	public static void Test6() {
		System.out.println("Test6");
	}
	@Test
	public static void Test7() {
		System.out.println("Test7");
	}
	
}
