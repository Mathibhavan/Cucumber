package com.Automation.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Automation.Runner.Runner;
import com.Cucumber.Base_Class.Base_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search_Stepdefintion extends Base_Class{
	
	public static WebDriver driver=Runner.driver;

	@Given("^User selects the location\"([^\"]*)\"$")
	public void user_selects_the_location(String arg1) throws Throwable {
	    DropDown(driver.findElement(By.id("location")), "text", arg1);
	}

	@When("^User selects the hotel\"([^\"]*)\"$")
	public void user_selects_the_hotel(String arg1) throws Throwable {
	    DropDown(driver.findElement(By.id("hotels")), "text", arg1);
	}

	@When("^User selects the room type\"([^\"]*)\"$")
	public void user_selects_the_room_type(String arg1) throws Throwable {
	    DropDown(driver.findElement(By.id("room_type")), "text", arg1);
	}

	@When("^User selects the number of room \"([^\"]*)\"$")
	public void user_selects_the_number_of_room(String arg1) throws Throwable {
		DropDown(driver.findElement(By.id("room_nos")), "text", arg1);
	}

	
	@When("^User selects the adults per room\"([^\"]*)\"$")
	public void user_selects_the_adults_per_room(String arg1) throws Throwable {
	  DropDown(driver.findElement(By.id("adult_room")), "text", arg1);
	}

	@Then("^User user click on the search button$")
	public void user_user_click_on_the_search_button() throws Throwable {
	    Click_Element(driver.findElement(By.id("Submit")));
	    
	}


}
