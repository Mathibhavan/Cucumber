package com.Automation.Stepdefinition;

import java.io.IOException;

import com.Cucumber.Base_Class.Base_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base_Class{

	@Before
	public static void BeforeHooks(Scenario scenario) {
		System.out.println(scenario.getName());
	}
	@After
	public static void AfterHooks(Scenario scenario) throws IOException {
		System.out.println(scenario.getStatus());
		if (scenario.isFailed()) {
			SnapShot();
		}
	}
}
