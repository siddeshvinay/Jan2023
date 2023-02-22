package AppHooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.Driverfactory;
import com.qa.utils.configReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicaionHooks {
	
	private Driverfactory driverfactory;
	private WebDriver driver;
	private configReader configReader; 
	Properties prop;
	
	
	@Before(order=0)
	public void getProperty() throws IOException {
		configReader= new configReader();
        prop=configReader.init_prop();

	}
	
	@Before(order=1)
	public void launchBrowser() {
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		driverfactory= new Driverfactory();
		driver=driverfactory.init_driver(browsername);
		
	}
	
	/*
	 * @After(order=0) public void quitBrowser() { driver.quit(); }
	 */
	
	@After(order=0)
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()) {
		//take screenshot:
		String screenshotName= scenario.getName().replaceAll("", "");
		byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
	}
	
	
	
	}

}
