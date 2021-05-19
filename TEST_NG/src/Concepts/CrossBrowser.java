package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	public WebDriver driver;
	@Test
	@Parameters("browser")
	public void browser(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			System.out.println("Chrome Browser");
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
			System.out.println("Firefox Browser");
		}
		else if (browser.equalsIgnoreCase("IE")) {
			driver=new InternetExplorerDriver();
			System.out.println("IE Browser");
		}}
	}

