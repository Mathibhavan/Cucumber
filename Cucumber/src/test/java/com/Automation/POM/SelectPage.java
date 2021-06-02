package com.Automation.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {

	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement Checkbox;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	public SelectPage(WebDriver sldriver) {
		this.driver=sldriver;
		PageFactory.initElements(sldriver, this);
	}
	public WebElement getUsername() {
		return Checkbox;
		
	}
	public WebElement getPassword() {
		return Continue;
		
	}
}
