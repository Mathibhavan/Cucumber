package com.Shopping.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Cucumber.Base_Class.Base_Class;
import com.Shopping.Runner.Shopping_Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sign_inStepdefintion extends Base_Class {
	
	public static WebDriver driver= Shopping_Runner.driver;
	
		@Given("^Launch the URL for shopping site$")
			public void launch_the_URL_for_shopping_site() throws Throwable {
		    	getURL("http://automationpractice.com/index.php");
		   }
		@When("^User sign in to their account$")
		public void user_sign_in_to_their_account() throws Throwable {
			Click_Element(driver.findElement(By.xpath("//a[@class=\"login\"]")));
		}
		@When("^User enters the email address \"([^\"]*)\"$")
		public void user_enters_the_email_address(String arg1) throws Throwable {
		    Input_Element(driver.findElement(By.id("email")), arg1);
		}
		@When("^User enters the password \"([^\"]*)\"$")
		public void user_enters_the_password(String arg1) throws Throwable {
		    Input_Element(driver.findElement(By.id("passwd")), arg1);
		}
		@Then("^User clicks on sign in button$")
		public void user_clicks_on_sign_in_button() throws Throwable {
		    Click_Element(driver.findElement(By.id("SubmitLogin")));
		}
		
}

