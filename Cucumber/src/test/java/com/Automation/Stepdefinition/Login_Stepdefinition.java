package com.Automation.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Automation.Runner.Runner;
import com.Cucumber.Base_Class.Base_Class;

import cucumber.api.java.en.*;

public class Login_Stepdefinition extends Base_Class{

public static WebDriver driver= Runner.driver;

		
		@Given("^Launch the URL for hotel booking$")
		public void launch_the_URL_for_hotel_booking() throws Throwable {
			getURL("http://adactinhotelapp.com/index.php");
		}

		@When("^User enter \"([^\"]*)\" as username$")
		public void user_enter_as_username(String arg1) throws Throwable {
		   Input_Element(driver.findElement(By.id("username")), arg1); 
		}
		
		@When("^User enter \"([^\"]*)\" as password$")
		public void user_enter_as_password(String arg1) throws Throwable {
		   Input_Element(driver.findElement(By.id("password")), arg1); 
		}
		
		@When("^User click on the login button$")
		public void user_click_on_the_login_button() throws Throwable {
		   Click_Element(driver.findElement(By.id("login"))); 
		}

		
	}