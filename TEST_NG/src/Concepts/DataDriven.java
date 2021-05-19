package Concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@Test(dataProvider = "Testdata")
	public static void username(String Username) {
		System.out.println("Username= : "+Username);
	}
	@DataProvider
	public Object[][] Testdata() {
		return new Object[][] {
			{"Mathi"},
			{"Bhavan"},
			{"lalitha"}
			
		};
}}
