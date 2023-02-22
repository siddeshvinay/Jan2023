package parallel;

import org.junit.Assert;

import com.Pages.LoginPages;
import com.Pages.UserPages;
import com.qa.factory.Driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private static String title;
	private LoginPages loginpage= new LoginPages(Driverfactory.getDriver());
	
	
	
	  @Given("user is on login page") public void user_is_on_login_page() throws
	  InterruptedException {
	  //Driverfactory.getDriver().get("http://localhost/login.do");
	  //Thread.sleep(1000); String title=loginpage.getLoginPageTitle();
		  }
	 
	
	@Given("Launch the browser")
	public void Launch_the_browser() throws InterruptedException {
		Driverfactory.getDriver().get("http://localhost/login.do");
		Thread.sleep(1000);
		String title=loginpage.getLoginPageTitle();
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		String title=loginpage.getLoginPageTitle();
		System.out.println("Login page title:"+ title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String ExpectedTitleName) {
		Assert.assertTrue(title.contains(ExpectedTitleName));

	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginpage.isforgotpasslink());
	    
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) throws InterruptedException {
		loginpage.enterUsername(username);
		Thread.sleep(1000);

	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginpage.enterpassword(password);

	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	loginpage.clickLogin();
	}

	
	/*
	 * @Then("Navigate to home page") public String navigate_to_home_page() {
	 * title=loginpage.getHomePageTitle();
	 * Assert.assertEquals("actiTIME - User List", title);
	 * System.out.println(title); return title; }
	 */
	 

}
