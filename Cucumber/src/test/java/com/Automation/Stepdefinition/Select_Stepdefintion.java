package com.Automation.Stepdefinition;

import org.openqa.selenium.By;
import com.Cucumber.Base_Class.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Select_Stepdefintion extends Base_Class{
	
	
	@Given("^User selects the button$")
	public void user_selects_the_button() throws Throwable {
	   Click_Element(driver.findElement(By.xpath("//input[@id=\"radiobutton_0\"]")));
	   }

	@Then("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
	    Click_Element(driver.findElement(By.id("continue")));
	    }

}
