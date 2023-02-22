package com.roughexamples;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	// WebDriver driver = new ChromeDriver();
	public WebDriver driver;

	public void lunchbrowser() {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\NEW_Test\\JUNEWORKSPACE\\Jan2023\\Drivers\\chromedriver.exe");
           driver = new ChromeDriver();}
	
	public void login() {
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("gettingStartedShortcutsLabel")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void login2() {
		/*
		 * driver.get("http://localhost/login.do");
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 */
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.className("gettingStartedShortcutsLabel")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	public void hiredate() {
    String date = "25 Oct 2021";
           By pickcalendar=By.xpath("//div[@id='userDataLightBox_hireDatePlaceholder']");
    	driver.findElement(pickcalendar).click();
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	
    	String month_year[] = (date.split(" "));
		for (String my : month_year) {
			System.out.println(my);
		}
		WebElement MiddleDate = driver
				.findElement(By.xpath("//table/tbody/tr/td[@class='x-date-middle']/table/tbody/tr/td/em/button"));
		MiddleDate.click();

		WebElement Previouslink = driver.findElement(By.xpath("//*[contains(@class,'x-date-mp-prev')]"));
		WebElement NextLink = driver.findElement(By.xpath("//*[contains(@class,'x-date-mp-next')]"));
		// MiddleDate.click();

		// get the difference year of current and want to set year
		int yeardiff = Integer.parseInt(month_year[2]) - Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(yeardiff);

		if (yeardiff > 0) {
			for (int i = 0; i < yeardiff; i++) {
				System.out.println("Year Diff" + i);
				//NextLink.click();
			}

		} else if (yeardiff < 0) {
			for (int i = 0; i < (yeardiff * (-1)); i++) {
				System.out.println("Year diff" + i);
				//Previouslink.click();
			}
			// MiddleDate.click();
		}

		// Select the month
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		List<WebElement> list_AllMonthToBook = driver
				.findElements(By.xpath("//div[@class='x-date-mp']/table/tbody/tr/td/a"));
		int month = list_AllMonthToBook.size();
		for (int i = 0; i < month; i++) {
			WebElement mth = list_AllMonthToBook.get(i);
			String mont = mth.getText();
			// System.out.println(month_year[0]);
			if (month_year[1].equalsIgnoreCase(mont)) {
				System.out.println("given month and application month are matching");
				mth.click();
			}
		}
		for (int j = 0; j < month; j++) {
			WebElement yer = list_AllMonthToBook.get(j);
			String yr = yer.getText();
			//System.out.println(yr);
			if (month_year[2].equalsIgnoreCase(yr)) {
				System.out.println("given year and application year are matching");
				yer.click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			}
		}
		driver.findElement(By.xpath("//div[@class='x-date-mp']/table/tbody/tr/td/button[@class='x-date-mp-ok']"))
		.click();
		String jndate=month_year[0];
		String hdate="//a[@class='x-date-date']/em/span[text()=" +jndate+ "]";
    	driver.findElement(By.xpath(hdate)).click();

	}
	
	public void adduser() {
		By Usertab=By.xpath("//*[contains(@href,'administration/userlist.do')]");
		 By Adduser=By.xpath("//div[@class='addUserButton beigeButton useNativeActive']");
		 By FirstName=By.id("userDataLightBox_firstNameField");
		 By Middlename=By.name("middleName");
		 By LastName=By.name("lastName");
		 By Email=By.name("email");
		 By Login=By.name("username");
		 By Password=By.name("password");
		 By Retypassword=By.name("passwordCopy");
		 By CreateUser=By.id("userDataLightBox_commitBtn");
		 By pickcalendar=By.xpath("//div[@id='userDataLightBox_hireDatePlaceholder']");
		 By corporate=By.xpath("//*[contains(text(),'Use corporate settings')]");
		 By Perm_enterTimetrack=By.xpath("//td/input[@id='userDataLightBox_submitTimeTrackChBox']");
		 By Perm_ModifyTimetrack=By.xpath("//td/input[@id='userDataLightBox_submitOtherUserTimeTrackChBox']");
		 By Perm_MangeCust_Projects=By.xpath("//td/input[@id='userDataLightBox_manageCustomersProjectsChBox']");
		 By Perm_ManageTasks=By.xpath("//td/input[@id='userDataLightBox_manageTasksChBox']");
		 By Perm_GenrteReports=By.xpath("//td/input[@id='userDataLightBox_generateTimeReportsChBox']");
		 By Perm_GenrateBilling=By.xpath("//td/input[@id='userDataLightBox_generateMoneyReportsChBox']");
		 By Perm_ManagaeAcc_Perm=By.xpath("//td/input[@id='userDataLightBox_manageAccountsChBox']");
		 By Perm_ManageSystems=By.xpath("//td/input[@id='userDataLightBox_manageGeneralSettingsChBox']");
		 
		 
	
		 driver.findElement(Usertab).click();
		driver.findElement(Adduser).click();
		driver.findElement(FirstName).sendKeys("TestD123");
		driver.findElement(Middlename).sendKeys("Ms");
		driver.findElement(LastName).sendKeys("TestD123");
		driver.findElement(Email).sendKeys("TestD@23.com");
		driver.findElement(Login).sendKeys("Test453");
		driver.findElement(Password).sendKeys("Testin");
		driver.findElement(Retypassword).sendKeys("Testin");
		hiredate();
		driver.findElement(corporate).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[@class='first']/input")).isEnabled();
		boolean days=driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[@class='first']/input")).isEnabled();
		//String dau=corporatesetting();
		System.out.println(days);
		//driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[@class='first']/input")).clear();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[@class='first']/input")).sendKeys(".5");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[2]/input")).sendKeys(".75");
		driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[3]/input")).sendKeys(".125");
		driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[4]/input")).sendKeys(".275");
		driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[5]/input")).sendKeys(".355");
		
		
		 driver.findElement(Perm_enterTimetrack).click();
		 driver.findElement(Perm_ModifyTimetrack).click();
		 driver.findElement(Perm_MangeCust_Projects).click();
		 driver.findElement(Perm_ManageTasks).click();
		 driver.findElement(Perm_GenrteReports).click();
		 driver.findElement(Perm_GenrateBilling).click();
		 driver.findElement(Perm_ManagaeAcc_Perm).click();
		 driver.findElement(Perm_ManageSystems).click();
		 
		
		
		driver.findElement(CreateUser).click();
		
		
		
	}
	
	public String corporatesetting() {
		
		WebElement days=driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[contains(@class,'first')]"));
		String appdays=days.getText();
		System.out.println(appdays);
		/*
		 * for (int i=0; i<=7; i++) {
		 * driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td"+i+"")).
		 * click();
		 * driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td"+i+"")).
		 * sendKeys(mon);
		 * 
		 * }
		 */
		return appdays;
		
	}

	
	public void Createtask() {
		
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();// Task 
		driver.findElement(By.xpath("//a[@href='/project/customers_projects.do']")).click(); //SubprojectCust
		driver.findElement(By.xpath("//div[@class=\"i\"]//span[text()= 'Create Customer']")).click(); //Createcustomer
		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Jan276"); //EnterCustname
		driver.findElement(By.xpath("//textarea[@id='customerLightBox_descriptionField']")).sendKeys("Unpossible");// EntCustDescript
		driver.findElement(By.xpath("//span[@id='customerLightBox_customerSelectorPlaceholder']//em")).click(); // ImportProjectfrmExtingCustomer
		driver.findElement(By.xpath("//div[contains(@class, 'customerSelectorMenu')][contains(@style, 'visible')]//li[2]/a")).click();//Project name seleciton
		driver.findElement(By.xpath("//div[@id=\"customerLightBox_commitBtn\"]")).click(); //SaveCustomerbutton
		driver.findElement(By.xpath("//div[@id=\"customerLightBox_cancelBtn\"]")); //CancelSaveCustomerbutton
		
	}
	
	
	public void Createproject() throws InterruptedException {
		
		  driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();// Task 
		  driver.findElement(By.xpath("//a[@href='/project/customers_projects.do']")).click(); //SubprojectCust
		  driver.findElement(By.xpath("//div[@class=\"i\"]//span[text()= 'Create Project']")).click();
		  driver.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys("week1_23"); //Enterprojectname
		  driver.findElement(By.xpath("//div[@id=\"projectPopup_customerSelectorPlaceholder\"]")).click(); //Customerseleforporject
		  driver.findElement(By.xpath("//div[contains(@class,'customerSelectorMenu projectPopup')][contains(@style,'visibility')]//li[3]/a")).click(); //Selecthecusomer
		  
		  //Add task to project
		  Thread.sleep(500);
		  driver.findElement(By.xpath("//div[@id='createTasksBlockButton']")).click();/// Add to task to project
		  driver.findElement(By.xpath("//div[@id='projectPopup_addRowsContainer']//..//input[1][@type=\"text\"]")).sendKeys("Task1"); // Create a task
		  driver.findElement(By.xpath("//div[@id='projectPopup_commitBtn']")).click();// Saveproject
		
		  
		  
		//tbody/td/input[@placeholder='Enter task name']
		 
		
		  
		  
	}
	
	public void deleteproject() {
		
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();// Task 
		driver.findElement(By.xpath("//a[@href='/project/customers_projects.do']")).click(); //SubprojectCust
		String sta=driver.findElement(By.xpath("//td[@class=\"customer-cell cpNameCell\"][1]")).getText(); // selectcustomer in projects and customer page
		System.out.println("sta");
		driver.findElement(By.xpath("//td[@class=\"selectCustomer\"]/input")).click();
		driver.findElement(By.xpath("//div[@class='listbuttonpane']//input[@value='Delete Selected']")).click();
		driver.findElement(By.xpath("//input[@onclick='operationConfirmDlg.confirmClick()']")).click();
		
	}
	
	
	public void createnewtasks() throws InterruptedException // Creating task from Task tab
	
	{
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();// Opentask link 
		driver.findElement(By.xpath("//div[@id='createTasksDiv']//span[text()='Create Tasks']")).click(); //createTask button
		driver.findElement(By.xpath("//div[@id='createTasksPopup_customerSelector']//button[@type='button']")).click(); //Selectcustomer
		//Selectcustomer after clicking select customer button 
		String cust=driver.findElement(By.xpath("//div[contains(@class,'createTasksCustomerProjectSelector')][1][contains(@style,'visibility')]//li[4]/a")).getText();
		System.out.println(cust);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'createTasksCustomerProjectSelector')][1][contains(@style,'visibility')]//li[4]/a/img")).click();
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='createTasksPopup_projectSelector']//button[@type='button']")).click(); 
		Thread.sleep(1000);
		String projet=driver.findElement(By.xpath("//div[contains(@class,'createTasksCustomerProjectSelector')][2][contains(@style,'visibility')]//li[5]")).getText();
		System.out.println(projet);
		
		driver.findElement(By.xpath("//div[contains(@class,'createTasksCustomerProjectSelector')][2][contains(@style,'visibility')]//li[5]")).click();
		
		int rows=driver.findElements(By.xpath("(//td[@class=\"nameCell first\"])")).size();
		for( int i=1; i<rows-1; i++) {
			driver.findElement(By.xpath("(//td[@class=\"nameCell first\"])["+i+"]/input")).sendKeys("FCR"+i);
		}
		driver.findElement(By.xpath("//div[@id='createTasksPopup_commitBtn']//span")).click();

	}
	
	
	public void xpatha() {
		String x=driver.findElement(By.xpath("//table[@id=\"tt-table\"]//td[contains(@class,\"headerDateCell \")]//tr[1]/td[2]")).getText();
		System.out.println(x);
	}
	
	public void logoutAPP() throws InterruptedException {
	
	driver.findElement(By.xpath("//a[@class='logout']")).click();
	Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws InterruptedException {

		Datepicker dp = new Datepicker();
		dp.lunchbrowser();
		dp.login();
		dp.logoutAPP();
		dp.login2();
		
		//dp.createnewtasks();dp.deleteproject();dp.Createproject();dp.Createtask();dp.deleteproject(); dp.Createproject(); dp.adduser(); dp.createnewtasks();
		//dp.xpatha();

	}

}
