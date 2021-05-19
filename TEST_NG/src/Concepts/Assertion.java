package Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public static void Asserts() {
	String actual ="Welcome";
	String expected="Welcome";
	Assert.assertEquals(actual, expected);
	Assert.assertNotEquals(actual, expected);
	Assert.assertSame(actual, expected);
	Assert.assertTrue(true, expected);
	Assert.assertNull(expected);
	Assert.assertNotNull(actual);
	}}



