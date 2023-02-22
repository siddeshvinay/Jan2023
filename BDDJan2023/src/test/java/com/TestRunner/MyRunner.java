package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"src/test/resources/Junt/"},
		glue = { "parallel","AppHooks"}, 
		dryRun =false, monochrome = true,
		//tags= "@~ignore",
		plugin = { "pretty",
						"html:target/MyReports/cucumber-html-report.html",  "json:target/MyReports/report.json","junit:target/MyReports/report.xml",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						 "timeline:test-output-thread/"}
)

public class MyRunner {

}
