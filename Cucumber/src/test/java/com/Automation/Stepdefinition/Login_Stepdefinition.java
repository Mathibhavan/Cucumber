package com.Automation.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Automation.Helper.PageObjectManager;
import com.Automation.Runner.Runner;
import com.cucumber.Cucumber.Base_Class;

import cucumber.api.java.en.*;

public class Login_Stepdefinition extends Base_Class{

public static WebDriver driver= Runner.driver;
PageObjectManager POM = new PageObjectManager(driver);
		
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
		
		@When("^User enter Mathi as username$")
		public void user_enter_Mathi_as_username() throws Throwable {
		  
		}

		@When("^User enter lalu(\\d+) as password$")
		public void user_enter_lalu_as_password(int arg1) throws Throwable {
		   
		}

		@When("^User enter Bhavan as username$")
		public void user_enter_Bhavan_as_username() throws Throwable {
		    
		}

		@When("^User enter BB@(\\d+) as password$")
		public void user_enter_BB_as_password(int arg1) throws Throwable {
		    
		}

		@When("^User enter Mathu as username$")
		public void user_enter_Mathu_as_username() throws Throwable {
		   
		}

		@When("^User enter njhj(\\d+) as password$")
		public void user_enter_njhj_as_password(int arg1) throws Throwable {
		    
		}
		
		@Then("^User validate the entred username and password$")
		public void user_validate_the_entred_username_and_password() throws Throwable {
		    
		}
	}
