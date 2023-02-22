package com.BaseClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pages.TaskPages;

public class TaskBase {
	TaskPages TP= new TaskPages();
	private static WebDriver driver;
	
	
	//Costructor for the TaskBase
	public TaskBase(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void Taskpage(String Customer,String Desc) throws InterruptedException {
		
		driver.findElement(TP.Tasktab).click();
		driver.findElement(TP.SubLinkProject_Customer).click();
		//Assert.assertTrue(appInd.verifyElementPresent(oBrowser, By.xpath(PayCRM_Modules_ManagedPaymentsUIPage.obj_PaymentVoidRequests_Grid +"//tr[1][contains(@class, 'row-lines dx-column-lines')]/td[1]")));
		
		// make separate methods
		driver.findElement(TP.Createcustomer).click();
		driver.findElement(TP.EnterCustname).sendKeys(Customer);
		driver.findElement(TP.EntCustDescript).sendKeys(Desc);
		driver.findElement(TP.SaveCustomerbutton).click();
		///Add validation 
		Thread.sleep(1000);
	}
	
	public static String getCustomerlist(String Customername) {
		String custname=null;
		int getcust=driver.findElements(TaskPages.getCustomerlist).size();
		System.out.println(getcust);
		for( int i=1; i<getcust; i++) {	
	 custname=driver.findElement(By.xpath("//div[contains(@class,'customerSelectorMenu projectPopup')][contains(@style,'visibility')]//li["+i+"]/a")).getText();
	        if(Customername.equals(custname))	{
	        	driver.findElement(By.xpath("//div[contains(@class,'customerSelectorMenu projectPopup')][contains(@style,'visibility')]//li["+i+"]/a")).click();
	        	break;
	        }
	 
		}
		return custname;
	}
	
	public void CreateProject(String ProjectName, String CustomerName) throws InterruptedException {
		driver.findElement(TP.Createproject).click();
		Thread.sleep(1000);
		driver.findElement(TP.Enterprojectname).sendKeys(ProjectName);
		driver.findElement(TP.Customerseleforporject).click();
		getCustomerlist(CustomerName);
		driver.findElement(TP.Selecthecusomerinproject).click();
		
		//Add vlaidation
		//getCustomerlist();
		//driver.findElement(TP.Saveproject).click();
	}
	
	public void addTaskToProject(String Taskdetails) {
		driver.findElement(TP.Addtaskproject).click();
		driver.findElement(TP.CreateTask).sendKeys(Taskdetails);
		driver.findElement(TP.Saveproject).click();
	}
	
	public void AddnewTask(String Tasks) throws InterruptedException { 
		 Thread.sleep(1000);
		 driver.findElement(TP.Tasktab).click();
		// driver.findElement(TP.SecTabOpenTask).click();
		 driver.findElement(TP.CreateTaskbutton).click();
		 Thread.sleep(1000);
		 driver.findElement(TP.customerselebutton).click();
		 driver.findElement(TP.SelectcustomerTask).click();
		 Thread.sleep(1000);
		 driver.findElement(TP.projectSelectorButton).click();
		 driver.findElement(TP.SelectpeojectTask).click();
		 Thread.sleep(1000);
			/*
			 * driver.findElement(TP.EnterTask1).sendKeys("External Task is created");
			 * driver.findElement(TP.SaveTaskbutton).click();
			 */
			int rows=driver.findElements(By.xpath("(//td[@class=\"nameCell first\"])")).size();
			for( int i=1; i<rows-2; i++) {
				driver.findElement(By.xpath("(//td[@class=\"nameCell first\"])["+i+"]/input")).sendKeys(Tasks+i);
			}
			driver.findElement(TP.SaveTaskbutton).click();
	
	}
	
	public void logout() {
		driver.findElement(TP.logout).click();
		driver.close();
	}
	
	
	public void DeleteProject_custorme() throws InterruptedException
	{
		driver.findElement(TP.Tasktab).click();
		driver.findElement(TP.SubLinkProject_Customer).click();
		Thread.sleep(1000);
		//String sta=driver.findElement(By.xpath("//td[@class=\"customer-cell cpNameCell\"][1]")).getText(); // selectcustomer in projects and customer page
	//	System.out.println("sta");
		driver.findElement(By.xpath("//td[@class=\"selectCustomer\"]/input")).click();
		driver.findElement(By.xpath("//div[@class='listbuttonpane']//input[@value='Delete Selected']")).click();
		driver.findElement(By.xpath("//input[@onclick='operationConfirmDlg.confirmClick()']")).click();
	}
	
	public void selectTask(String TaskName) throws InterruptedException {
		//driver.findElement(TP.Tasktab).click();
		
	
		  List<WebElement> as=driver.findElements(By.xpath("//table[@class='listTable withRoundCorners']//tr//td[@class='listtblcell listTableTaskNameCell']/table//tbody//tr//td/a"));
		 
		  for ( int i=0; i<as.size(); i++) {
			  Thread.sleep(1000);
			 // System.out.println(as.get(i).getText());
			  String app=as.get(i).getText();
			  if(TaskName.equals(app)) {
				 int x=i+1;
				 System.out.println(x);
				 Thread.sleep(1000);
			  driver.findElement(By.xpath("(//table[@class='listTable withRoundCorners']//tr//td[@class='listtblcell selectCell'])["+x+"]")).click();
			  driver.findElement(TP.DeleteTasksfromTaskpage).click();
			  Thread.sleep(1000);
			  driver.findElement(TP.DeleteTasksfrompopup).click();
			    break;
			  }
			  
		  }

	}

	
	
	
	
	

}
