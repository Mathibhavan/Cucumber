package com.Shopping.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Cucumber.Base_Class.Base_Class;
import com.Shopping.Runner.Shopping_Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Selection_Stepdefinition extends Base_Class{
	
	public static WebDriver driver=Shopping_Runner.driver;

	@Given("^User clicks on Tshirt$")
	public void user_clicks_on_Tshirt() throws Throwable {
	    Click_Element(driver.findElement(By.xpath("(//a[@title=\"T-shirts\"])[2]")));
	}
	@When("^User selects the size$")
	public void user_selects_the_size() throws Throwable {
	    Click_Element(driver.findElement(By.id("layered_id_attribute_group_2")));
	}
	@When("^User selects the colour$")
	public void user_selects_the_colour() throws Throwable {
	   Click_Element(driver.findElement(By.id("layered_id_attribute_group_13"))); 
	}
	@When("^User selects the price range$")
	public void user_selects_the_price_range() throws Throwable {
	    DropDown(driver.findElement(By.id("selectProductSort")), "text", "Price: Lowest first");
	}
	@When("^User selects the desired shirt$")
	public void user_selects_the_desired_shirt() throws Throwable {
	   Move_ToElement(driver.findElement(By.xpath("(//a[@title=\"Faded Short Sleeve T-shirts\"])[2]")));
	}
	@Then("^User clicks on add-to-cart button$")
	public void user_clicks_on_add_to_cart_button() throws Throwable {
	   Click_Element(driver.findElement(By.xpath("//a[@title=\"Add to cart\"]")));                       
	}
	

}
