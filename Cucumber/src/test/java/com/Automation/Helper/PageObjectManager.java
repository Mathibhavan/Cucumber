package com.Automation.Helper;

import org.openqa.selenium.WebDriver;

import com.Automation.POM.LoginPage;

public class PageObjectManager {

	public static WebDriver driver;
	
	private LoginPage lp;
	 
	public PageObjectManager(WebDriver pdriver) {
		this.driver=pdriver;
	}
	public LoginPage getLP() {
		lp = new LoginPage(driver);
		return lp;
		
	}
}
