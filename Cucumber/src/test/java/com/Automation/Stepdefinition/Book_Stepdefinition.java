package com.Automation.Stepdefinition;

import org.openqa.selenium.By;
import com.Cucumber.Base_Class.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Book_Stepdefinition extends Base_Class{
	
	@Given("^User enters the firstname \"([^\"]*)\"$")
	public void user_enters_the_firstname(String arg1) throws Throwable {
	   Input_Element(driver.findElement(By.id("first_name")), "Mathi");
	 }

	@When("^User enters the secondname \"([^\"]*)\"$")
	public void user_enters_the_secondname(String arg1) throws Throwable {
	 Input_Element(driver.findElement(By.id("last_name")), "Lalitha");  
	 }

	@When("^User enters the address \"([^\"]*)\"$")
	public void user_enters_the_address(String arg1) throws Throwable {
	   Input_Element(driver.findElement(By.id("address")), "No 2/3 Logaiya Naidu street");
	 }

	@When("^User enters the credit card number \"([^\"]*)\"$")
	public void user_enters_the_credit_card_number(String arg1) throws Throwable {
	  Input_Element(driver.findElement(By.id("cc_num")), "1234567809123698"); 
	 }

	@When("^User enters the credit card type \"([^\"]*)\"$")
	public void user_enters_the_credit_card_type(String arg1) throws Throwable {
	   Input_Element(driver.findElement(By.id("cc_type")), "Master Card");
	 }

	@When("^User enters the expiry month \"([^\"]*)\"$")
	public void user_enters_the_expiry_month(String arg1) throws Throwable {
	   Input_Element(driver.findElement(By.id("cc_exp_month")), "August");
	 }

	@When("^User enters the expiry year \"([^\"]*)\"$")
	public void user_enters_the_expiry_year(String arg1) throws Throwable {
	   Input_Element(driver.findElement(By.id("cc_exp_year")), "2023");
	 }

	@When("^User enters the CCV number \"([^\"]*)\"$")
	public void user_enters_the_CCV_number(String arg1) throws Throwable {
	 Input_Element(driver.findElement(By.id("cc_cvv")), "999");  
	 }

	@Then("^User clicks on booknow button$")
	public void user_clicks_on_booknow_button() throws Throwable {
	   Click_Element(driver.findElement(By.id("book_now")));
	 }
}
