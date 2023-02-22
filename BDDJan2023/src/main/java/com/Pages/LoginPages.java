package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {
	
	private WebDriver driver;
	// By Locators
	 private By UserName=By.id("username");
	 private By password=By.name("pwd");
	 private By signInButton=By.id("loginButton");
	 private By forgotpwdlink=By.id("keepLoggedInLabel");
	 private By logout=By.xpath("//button[text()='%s']"); // Replace %s with genric method.
	
	 //2. Constuctor of the page class
	 public LoginPages(WebDriver driver) {
		 this.driver=driver;
	 }
	 
	 //3. Page actions
	 public String getLoginPageTitle() {
		 return driver.getTitle();
	 }
	 
	 public boolean isforgotpasslink() {
		return driver.findElement(forgotpwdlink).isDisplayed();
	 }
	 
	 public void enterUsername(String Username) {
		 driver.findElement(UserName).sendKeys(Username);
	 }
	 
	 public void enterpassword(String Pwd) {
		 driver.findElement(password).sendKeys(Pwd);
	}
	 
	 public void clickLogin() {
		 driver.findElement(signInButton).click();
	 }
	 
		public String getHomePageTitle() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[@href='/administration/userlist.do\']")).click();
			System.out.println("Click on Users page");
			return driver.getTitle();
		}

}
