package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskPages {

	private static WebDriver driver;
	
	// By Locators
	
	// Create a customers
	public By Tasktab=By.xpath("//a[@href='/tasks/otasklist.do']");
	public By SubLinkProject_Customer=By.xpath("//a[@href='/project/customers_projects.do']");
	public By Createcustomer=By.xpath("//div[@class=\"i\"]//span[text()= 'Create Customer']");
	public By EnterCustname=By.xpath("//input[@id='customerLightBox_nameField']");
	public By EntCustDescript=By.xpath("//textarea[@id='customerLightBox_descriptionField']");
	public By ImportProjectfrmExtingCustomer=By.xpath("//span[@id='customerLightBox_customerSelectorPlaceholder']//em"); 
	public By Projectname=By.xpath("//div[contains(@class, 'customerSelectorMenu')][contains(@style, 'visible')]//li[2]/a");
	public By SaveCustomerbutton=By.xpath("//div[@id='customerLightBox_commitBtn']");
	public By CancelSaveCustomerbutton=By.xpath("//div[@id=\"customerLightBox_cancelBtn\"]"); 
	public By logout=By.xpath("//a[@id='logoutLink']");
	
	//Create a new Project to the 
	public By Createproject=By.xpath("//div[@class=\"i\"]//span[text()= 'Create Project']");
	public By Enterprojectname=By.xpath("//input[@id='projectPopup_projectNameField']");
	public By Customerseleforporject=By.xpath("//div[@id=\"projectPopup_customerSelectorPlaceholder\"]");
	public static By getCustomerlist=By.xpath("//div[contains(@class,'customerSelectorMenu projectPopup')][contains(@style,'visibility')]//li/a");
	public By Selecthecusomerinproject=By.xpath("//div[contains(@class,'customerSelectorMenu projectPopup')][contains(@style,'visibility')]//li[3]/a");
	//Under new Project pop add tasks
	 public By Addtaskproject=By.xpath("//div[@id='createTasksBlockButton']");
	 public By CreateTask=By.xpath("//div[@id='projectPopup_addRowsContainer']//..//input[1][@type=\"text\"]");
	 public By Saveproject=By.xpath("//div[@id='projectPopup_commitBtn']");
	 
	 //Active Customers and Projects page-- select the customer by checkbox and delete
	 public By SelectCustNproject=By.xpath("//td[@class=\"customer-cell cpNameCell\"][1]");
	 public By SelectChkbox=By.xpath("//td[@class=\"selectCustomer\"]/input");
	 public By DeleteSelected=By.xpath("//div[@class='listbuttonpane']//input[@value='Delete Selected']");
	//Delete customer
	 public By DeleteCustomer=By.xpath("//input[@onclick='operationConfirmDlg.confirmClick()']");
	 
	// Creating task from Task tab
	 public By SecTabOpenTask=By.xpath("//div[@class='secondLevelNavigationItem  ']/a[@href='/tasks/otasklist.do']");
	 public By CreateTaskbutton= By.xpath("//div[@id='createTasksDiv']//span[text()='Create Tasks']");
	 public By customerselebutton=By.xpath("//div[@id='createTasksPopup_customerSelector']//button[@type='button']");
	 public By SelectcustomerTask=By.xpath("//div[contains(@class,'createTasksCustomerProjectSelector')][1][contains(@style,'visibility')]//li[4]/a");
	 public By projectSelectorButton=By.xpath("//div[@id='createTasksPopup_projectSelector']//button[@type='button']");
	 public By SelectpeojectTask=By.xpath("//div[contains(@class,'createTasksCustomerProjectSelector')][2][contains(@style,'visibility')]//li[5]");
	// public By EnterTask=By.xpath("(//td[@class='nameCell first])");
	 public By EnterTask1=By.xpath("(//td[@class=\"nameCell first\"])[1]/input");
	 public By SaveTaskbutton=By.xpath("//div[@id='createTasksPopup_commitBtn']//span");
	 
	 //Under open task page select the tasks
	 
	//td[@class="listtblcell listTableTaskNameCell"]//a[contains(text(),"FCR1")]
	 //Delete the tasks
	 public By DeleteTasksfromTaskpage=By.xpath("//div[@class='listbuttonpane']//input[@value='Delete Selected Tasks']");
	 public By DeleteTasksfrompopup=By.xpath("//div[@id='deleteTaskPopup_deleteConfirm_submitBtn']/div/span");
	 
	 


}
