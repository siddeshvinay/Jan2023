package parallel;

import com.BaseClasses.TaskBase;
import com.qa.factory.Driverfactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TaskSteps {
	TaskBase TB=new TaskBase(Driverfactory.getDriver());
	
	@Then("Open the Task and create Customer {string} {string}")
	public void open_the_task_and_create_customer(String Customer,String Desc) throws InterruptedException 
	{
		TB.Taskpage(Customer,Desc);

	}

	@Then("Create a project to the respective customer {string} {string}")
	public void create_a_project_to_the_respective_customer(String Projectname, String Customername) throws InterruptedException {
		TB.CreateProject(Projectname, Customername);
	}

	@Then("Create a task to the Customer {string}")
	public void create_a_task_to_the_customer(String Taskname) throws InterruptedException {
		TB.addTaskToProject(Taskname);
		//TB.AddnewTask();
	}

	

	@Then("validate the tasks")
	public void validate_the_tasks() {

	}
	
	@Then("logout from the application")
	public void logout_from_the_application() throws InterruptedException {
		Thread.sleep(1000);
           TB.logout();
	}
    
	
	@Then("Open the Task page and create new tasks")
	public void open_the_task_page_and_create_new_tasks() {

	}

	@Then("Add new tasks to the existing project {string}")
	public void add_new_tasks_to_the_existing_project(String Tasks) throws InterruptedException {
       TB.AddnewTask(Tasks);
	}

	@Then("Open the Tasks page and select the task and delete")
	public void open_the_tasks_page_and_select_the_task_and_delete() throws InterruptedException {
		TB.DeleteProject_custorme();

	}

	@Then("validate the deleted Taks")
	public void validate_the_deleted_taks() {
	
	}

	@When("Navigate to Project and customer page, select the Project and customer and Delete them")
	public void navigate_to_project_and_customer_page_select_the_project_and_customer_and_delete_them() {

	}

	@When("validate the deleted Project and customer")
	public void validate_the_deleted_project_and_customer() {

	}
	
	@Given("Select the task in Completed tasks and delete them {string}")
	public void select_the_task_in_completed_tasks_and_delete_them(String string) throws InterruptedException {
		TB.selectTask(string);
	}

}
