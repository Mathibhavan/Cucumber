package Concepts;

import org.testng.annotations.Test;

public class Ignore {

	@Test
	public static void Chrome() {
		System.out.println("Chrome browser");
	}
	@Test(enabled = false)
	public static void Firefox() {
		System.out.println("Firefox browser");
	}
	@Test
	public static void IE() {
		System.out.println("IE");
	}
}
