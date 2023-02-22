package parallel;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.Pages.LoginPages;
import com.Pages.UserBase;
import com.Pages.UserPages;
import com.qa.factory.Driverfactory;
import com.qa.utils.Elementsutils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps {
	
	private static String title1;
	//UserPages userpages = new UserPages(Driverfactory.getDriver());
	UserBase UB= new UserBase(Driverfactory.getDriver());

	  @Then("Navigate to home page") 
	 public String navigate_to_home_page() {
		  title1=UB.getHomePageTitle();
		  Assert.assertEquals("actiTIME - User List", title1);
		  System.out.println(title1); 
		  return title1; }
	  
	  @When("login to the application with user {string} and {string}")
	  public String login_to_the_application_with_user_and(String string, String string2) throws InterruptedException {
		  Driverfactory.getDriver().get("http://localhost/login.do");
		  UB.logintoApp(string, string2);
		  Thread.sleep(1000);
		  title1=UB.getHomePageTitle();
		  Assert.assertEquals("actiTIME - User List", title1);
		  System.out.println(title1); 
		  Thread.sleep(1000);
		  
		  return title1;
	  }

	  @Given("Enter the user details {string} {string} {string} {string} {string} {string} {string}")
	  public void enter_the_user_details(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
		  UB.Adduser();
		  Thread.sleep(1000);
		  UB.FirstName(string);
		  UB.Middlename(string2);
		  UB.LastName(string3);
		  UB.Email(string4);
		  UB.Username(string5);
		  UB.Password(string6);
		  UB.Retypepassword(string7);
	  }
	
	 @Given("Close the popup")
	 public void close_the_popup() {
		 UB.ClosePopup();
	 }
	 
	 @Given("Click on Add User button")
	 public void click_on_add_user_button() {
		 UB.Adduser();
	 }
	
	@Given("Enter the Firtstname {string}")
	public void enter_the_firtstname(String string) {
		UB.FirstName(string);
	}

	@Given("Enter the Middlename {string}")
	public void enter_the_middlename(String string) {
		UB.Middlename(string);

	}

	@Given("Enter the LastName {string}")
	public void enter_the_last_name(String string) {
		UB.LastName(string);}

	@Given("Enter the Email {string}")
	public void enter_the_email(String string) {
		UB.Email(string);

	}

	@Given("Enter the Username {string}")
	public void enter_the_username(String string) {
		UB.Username(string);

	}

	@Given("Enter the Password {string}")
	public void enter_the_password(String string) {
		UB.Password(string);

	}

	@Given("Enter the Retypepassword {string}")
	public void enter_the_retypepassword(String string) {
		UB.Retypepassword(string);
	}
	
	@Then("Click on Create user button")
	public void click_on_create_user_button() {
		UB.CreateUser();
	}
	
	@Given("select the Hiredate {string}")
	public void select_the_hiredate(String string) {
		UB.hdate(string);
	}

	/*
	 * @Given("Enter the workdays {string}") public void enter_the_workdays(String
	 * tue) { userpages.workdays(monday,tuesday,wednesday,thursday,friday);; }
	 */
	
   @Given("Enter the workdaysweekly {string} {string} {string} {string} {string}") 
	 public void enter_the_workdaysweekly(String monday, String tuesday, String wednesday, String thursday, String friday) throws InterruptedException {
	   UB.workdays(monday,tuesday,wednesday,thursday,friday);
		  }

	@Given("Select the permissions")
	public void select_the_permissions() throws InterruptedException {
		UB.Addpermissions();
		Thread.sleep(1000);
	}
	


	@Then("Validate the selected user")
	public void validate_the_selected_user() {

	}


	@Then("Confirm the Deleted user should not display")
	public void confirm_the_deleted_user_should_not_display() {

	}
	
	@Then("Select the user {string}")
	public void select_the_user(String string) {
		UB.SelectUser(string);
	}

	@Then("Delete the User")
	public void delete_the_user() throws InterruptedException {
		UB.DeleteUser();
		Thread.sleep(1000);
	}
	
	@Then("Logout from Application")
	public void logout_from_application() throws InterruptedException {
        UB.logoutAPP();
        Thread.sleep(1000);
	}
	
}
