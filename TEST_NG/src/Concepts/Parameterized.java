package Concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized {

	@Test
	@Parameters({"Username","Password"})
	public static void login(@Optional("Mathi")String username,@Optional("Mathi@1234")String password) {
		System.out.println("Username : " +username);
		System.out.println("Password : " +password);
	}
}
