package com.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features= {"src/test/resources/Junt/Smoke.feature"},
		glue = { "parallel","AppHooks"}, 
		dryRun =false, monochrome = true,
		tags= "@Regression or @sanity",
		plugin = { "pretty",
						"html:target/MyReports/cucumber-html-report.html",  "json:target/MyReports/report.json","junit:target/MyReports/report.xml",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						 "timeline:test-output-thread/"}
)

public class MyRunner extends AbstractTestNGCucumberTests{

}
