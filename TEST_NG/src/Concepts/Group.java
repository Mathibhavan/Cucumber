package Concepts;

import org.testng.annotations.Test;

public class Group {

	@Test (groups = "Test")
	public static void Testing() {
		System.out.println("API testing");
	}
	@Test (groups = "Test")
	public static void Testing1() {
		System.out.println("Software testing");
	}
	@Test(groups="Devlopment")
	public static void Devlopment() {
		System.out.println("Andriod devlopement");
	}
	@Test(groups="Devlopment")
	public static void Devlopment1() {
		System.out.println("Software testing");
	}
	@Test
	public static void Devops() {
		System.out.println("Pipeline Creation");
	}
	@Test
	public static void Devops1() {
		System.out.println("Automating build");
	}
}
