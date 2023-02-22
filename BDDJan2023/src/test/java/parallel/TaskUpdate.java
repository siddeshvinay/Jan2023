package parallel;

import org.testng.Assert;

import com.BaseClasses.TaskBase;
import com.Pages.LoginPages;
import com.Pages.UserBase;
import com.qa.factory.Driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TaskUpdate {
	
	private static String title;
	private LoginPages loginpage= new LoginPages(Driverfactory.getDriver());
	UserBase UB= new UserBase(Driverfactory.getDriver());
	TaskBase TB=new TaskBase(Driverfactory.getDriver());
	
	@Given("Launch application and Create Customer and Project {string} {string} {string} {string} {string}")
	public void launch_application_and_create_customer_and_project_and(String Customer, String CustomerDescription, String Projectname,String Task1,String string5) throws InterruptedException {
		//UB.logintoApp(string, string2);
		  Thread.sleep(1000);
		  TB.Taskpage(Customer,CustomerDescription);
		  TB.CreateProject(Projectname, Customer);
		  TB.addTaskToProject(Task1);
		  
	}

	@Then("Assgin the Task to the Projects {string}")
	public void assgin_the_task_to_the_projects(String Tasks) throws InterruptedException {
		TB.AddnewTask(Tasks);
		

	}

	@Then("Task and Delete the Tasks {string}")
	public void task_and_delete_the_tasks(String task) throws InterruptedException {
		TB.selectTask(task);
	}

	@Then("Delete the Customer and Project")
	public void delete_the_customer_and_project() throws InterruptedException {
		TB.DeleteProject_custorme();

	}

	@Then("Logout Form the Application")
	public void logout_form_the_application() {

	}

	@Then("Assign the Task to the Projects")
	public void assign_the_task_to_the_projects() {

	}

	@Then("Create new customer {string} and assign the existing project {string}")
	public void create_new_customer_and_assign_the_existing_project(String string, String string2) {

	}

	@Then("Complete the Tasks and Delete Tasks")
	public void complete_the_tasks_and_delete_tasks() {

	}

	@Then("Logout from the application")
	public void logout_from_the_application() {

	}


}
