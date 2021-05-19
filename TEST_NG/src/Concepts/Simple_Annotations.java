package Concepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public static void setup() {
		System.out.println("Setting up");
	}
	@BeforeTest
public static void browserlaunch() {
		System.out.println("open browser");
	}
	@BeforeClass
	public static void URL() {
		System.out.println("Enter the URL");
	}
	@BeforeMethod
	public static void login() {
		System.out.println("Logging in");
	}
	@Test
	public static void mobile() {
		System.out.println("Mobile search");
	}
	@Test
	public static void laptop() {
		System.out.println("Laptop search");
	}
	@AfterMethod
	public static void logout() {
		System.out.println("Logging out");
	}
	@AfterClass
	public static void verification() {
		System.out.println("Verify homepage");
	}
	@AfterTest
	public static void browserclose() {
		System.out.println("Close the browser");
	}
	@AfterSuite
	public static void deletecookies() {
		System.out.println("Delete cookies");
	}
	}

