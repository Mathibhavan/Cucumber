package com.Shopping.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in {

	public static WebDriver driver;
		
	@FindBy(xpath = "//a[@class=\"login\"]")
	private WebElement Login;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="passwd")
	private WebElement Password;
	
	public Sign_in(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	public WebElement Login() {
		return Login;
		
	}
	public WebElement getEmail() {
		return Email;
		
	}
	public WebElement getPassword() {
		return Password;
		
	}

	}

