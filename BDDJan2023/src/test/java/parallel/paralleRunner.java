package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"src/test/resources/parallel/Task.feature"},
		glue = { "parrallel"}, 
		dryRun =false, monochrome = true,
		//tags= "@~ignore",
		plugin = { "pretty",
						"html:target/MyReports/cucumber-html-report.html",  "json:target/MyReports/report.json","junit:target/MyReports/report.xml",
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						 "timeline:test-output-thread/"}
)

public class paralleRunner extends AbstractTestNGCucumberTests {
	
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=false) public Object[][] scenarios(){ return
	 * super.scenarios();
	 * 
	 * }
	 */
	

}
