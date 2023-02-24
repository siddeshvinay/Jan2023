package parallel;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




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
