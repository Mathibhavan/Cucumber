package Concepts;

import org.testng.annotations.Test;

public class Timeout {
	@Test (timeOut=1000)
	public static void Time () throws InterruptedException {
		System.out.println(" time handling");
		Thread.sleep(2000);
	}
	@Test (timeOut=1000)
	public static void Time1 () throws InterruptedException {
		System.out.println(" time handling");
		Thread.sleep(500);
	}
}
