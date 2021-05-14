package com.Automation.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.Cucumber.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\721901\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\Automatiom\\Feature\\Cucumber.Feature",
glue="com\\Automation\\Stepdefinition", monochrome= true, dryRun=false,strict=true)

public class Runner {

	public static WebDriver driver;
	
@BeforeClass
public static void Setup() {
	driver=Base_Class.BrowserLaunch("Chrome");
}
@AfterClass
public static void Teardown() {
	driver.quit();
}
}
