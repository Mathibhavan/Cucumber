package com.Automation.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber.Base_Class.Base_Class;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@ExtendedCucumberOptions(retryCount=4)
@CucumberOptions(features="C:\\Users\\721901\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\Automation\\Feature\\Automation.Feature",
glue="com\\Automation\\Stepdefinition", monochrome= true, dryRun=false,strict=true,plugin= {"com.cucumber.listener.ExtentCucumberFormatter:Report//CucumberExtendReport.html"})

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

//"html:HTMLReport"
//"pretty"
//"json:JSONReport//json_Report.txt"
//"com.cucumber.listener.ExtentCucumberFormatter:Report//CucumberExtendReport.html"
