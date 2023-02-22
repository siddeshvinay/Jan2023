package com.Pages;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserBase {
	UserPages UP= new UserPages();
	

	private static WebDriver driver;
	
	public UserBase(WebDriver driver) {
		this.driver = driver; 
	}

	public String getHomePageTitle() {

		try {
			boolean Contai = driver.findElement(By.xpath("//div[@class='welcomeScreenBoxHeaderContainer']"))
					.isDisplayed();
			System.out.println(Contai);
			if (Contai == true) {
				driver.findElement(UP.startexploring).click();
				driver.findElement(UP.userTab).click();
			}
		} catch (Exception e) {
			
			driver.findElement(UP.userTab).click();
			
		}

		return driver.getTitle();
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	/*
	 * Author: Siddesh Add User
	 *
	 */
	
	
	public void logintoApp(String username, String password) {
		try {
			driver.findElement(UP.UserName).sendKeys(username);
			driver.findElement(UP.password).sendKeys(password);
			driver.findElement(UP.signInButton).click();
			Thread.sleep(1000);
			driver.findElement(UP.closePopUp).click();
		} catch (Exception e) {
			
		}

	}
	public void Adduser() {
		try {
			driver.findElement(UP.closePopUp).click();
			driver.findElement(UP.Adduser).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {

		}

	}

	public void FirstName(String Firstname) {
		driver.findElement(UP.FirstName).sendKeys(Firstname);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void Middlename(String MiddleName) {
		driver.findElement(UP.Middlename).sendKeys(MiddleName);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void LastName(String Lastname) {
		driver.findElement(UP.LastName).sendKeys(Lastname);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void Email(String email) {
		driver.findElement(UP.Email).sendKeys(email);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void Username(String username) {
		driver.findElement(UP.Login).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void Password(String password) {
		driver.findElement(UP.Password).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void Retypepassword(String retypePassword) {
		driver.findElement(UP.Retypassword).sendKeys(retypePassword);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void CreateUser() {
		driver.findElement(UP.CreateUser).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.close();
	}

	public void ClosePopup() {
		driver.findElement(UP.closePopUp).click();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

/// To Select the Hire date of the Employee
	public void hdate(String hire) {
		String date = "25 Oct 2021";

		driver.findElement(UP.pickcalendar).click();
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
				// NextLink.click();
			}

		} else if (yeardiff < 0) {
			for (int i = 0; i < (yeardiff * (-1)); i++) {
				System.out.println("Year diff" + i);
				// Previouslink.click();
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
			if (month_year[1].equalsIgnoreCase(mont)) {
				System.out.println("given month and application month are matching");
				mth.click();
			}
		}
		for (int j = 0; j < month; j++) {
			WebElement yer = list_AllMonthToBook.get(j);
			String yr = yer.getText();
			// System.out.println(yr);
			if (month_year[2].equalsIgnoreCase(yr)) {
				System.out.println("given year and application year are matching");
				yer.click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			}
		}
		driver.findElement(By.xpath("//div[@class='x-date-mp']/table/tbody/tr/td/button[@class='x-date-mp-ok']"))
				.click();
		String jndate = month_year[0];
		String hdate = "//a[@class='x-date-date']/em/span[text()=" + jndate + "]";
		driver.findElement(By.xpath(hdate)).click();

	}

///***************

	public void workdays(String monday, String tuesday, String wednesday, String thursday, String friday)
			throws InterruptedException {
		
		String weekdays[]= {monday, tuesday, wednesday, thursday, friday};
		        
		driver.findElement(UP.corporate).click();
		for ( int i=1; i<weekdays.length+1; i++) {
		driver.findElement(By.xpath("(//table[@class='wdEditor']//input)["+i+"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table[@class='wdEditor']//input)["+i+"]")).sendKeys(weekdays[i-1]);
		}
	}

	//// ****
	
	public void startexploring() {
		driver.findElement(UP.startexploring).click();
	}

	public void Addpermissions() {
		driver.findElement(UP.Perm_enterTimetrack).click();
		driver.findElement(UP.Perm_ModifyTimetrack).click();
		driver.findElement(UP.Perm_MangeCust_Projects).click();
		driver.findElement(UP.Perm_ManageTasks).click();
		driver.findElement(UP.Perm_GenrteReports).click();
		driver.findElement(UP.Perm_GenrateBilling).click();
		driver.findElement(UP.Perm_ManagaeAcc_Perm).click();
		driver.findElement(UP.Perm_ManageSystems).click();
	}

	/*
	 * Author: Siddesh Delete User
	 */
	public void SelectUser(String Name) {
		
		driver.findElement(By.xpath("//div[@class='name']//span[@class='userNameSpan' and contains(text(),'"+Name+"')]")).click();
		/*
		 * List<WebElement> sleuser=driver.findElements((UP.SelectUser));
		 * 
		 * for( int i=0; i<=sleuser.size(); i++) { String
		 * selName=sleuser.get(i).getText(); System.out.println(selName); if(
		 * selName.equals(Name)) { driver.findElement((UP.SelectUser)).click();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); } }
		 */ 

		
	}

	public void DeleteUser() throws InterruptedException {
		driver.findElement(UP.DeleteUser).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		
	}
	
	public void logoutAPP() throws InterruptedException {
		driver.findElement(UP.logout);
		driver.close();
		Thread.sleep(1000);
		//driver.findElement((UP.SelectUser)).getText();
		//driver.close();
	}

}
