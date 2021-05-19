package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {

	@Test
	private static void Amazon() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	private static void Flipkart() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	private static void Instagram() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\721901\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
}
