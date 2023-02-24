package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features= {"src/test/resources/Junt/Smoke.feature"},
		glue = { "parallel","AppHooks"}, 
		dryRun =false, monochrome = true,
		//tags= "@Regression or @sanity",
		//plugin = {"pretty","html:target/cucumber-reports"}
		plugin = { "pretty","json:target/cucumber.json", "html:target/cucumber-reports",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
		


public class MyRunner extends AbstractTestNGCucumberTests{

}
