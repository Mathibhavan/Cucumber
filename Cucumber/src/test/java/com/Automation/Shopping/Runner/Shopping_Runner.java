package com.Shopping.Runner;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Cucumber.Base_Class.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\721901\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\Automation\\Feature\\Shopping.Feature", 
glue="com\\Shopping\\Stepdefinition", monochrome= true, dryRun=false,strict=true,plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Report//CucumberExtendReport_Shopping.html"})

public class Shopping_Runner {

	public static WebDriver driver;

@BeforeClass
	public static void Setup() throws IOException {
		driver=Base_Class.BrowserLaunch("Chrome");
	}
@AfterClass
	public static void Teardown() {
		driver.quit();
	}
}

