package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

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

public class MyRunner {

}
