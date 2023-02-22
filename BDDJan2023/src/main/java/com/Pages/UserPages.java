package com.Pages;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.factory.Driverfactory;

public class UserPages {

	// public static String title;
	// public UserPages userpages = new UserPages(Driverfactory.getDriver());

	private static WebDriver driver;
	// By Locators
	
	public By UserName=By.id("username");
	public By password=By.name("pwd");
	public By signInButton=By.id("loginButton");
	public By forgotpwdlink=By.id("keepLoggedInLabel");
	//public By logout=By.xpath("//button[text()='%s']");
	public By userTab = By.xpath("//a[@href='/administration/userlist.do\']");
	public By closePopUp = By.className("gettingStartedShortcutsLabel");

	public By Adduser = By.xpath("//div[@class='addUserButton beigeButton useNativeActive']");

	public By FirstName = By.id("userDataLightBox_firstNameField");
	public By Middlename = By.name("middleName");
	public By LastName = By.name("lastName");
	public By Email = By.name("email");
	public By Login = By.name("username");
	public By Password = By.name("password");
	public By Retypassword = By.name("passwordCopy");
	public By CreateUser = By.id("userDataLightBox_commitBtn");
	//public By SelectUser = By.xpath("//div/span[@class='userNameSpan' and text()='Siddu, tes Ms.']");
	
	public By SelectUser = By.xpath("//table[@class='userNameContainer']//.//div/span[2]");
	public By SelectUser12 = By.xpath("//div[@class='name']//span[@class='userNameSpan']");
	
	
	public By SelectUser1 = By.xpath("//div[@class='name']//span[@class='userNameSpan' and contains(text(),'')]");
	
	
	public By DeleteUser = By.xpath("//div/button[@id='userDataLightBox_deleteBtn']");
	// private By TimeZone=By.xpath(getHomePageTitle())
	public By pickcalendar = By.xpath("//div[@id='userDataLightBox_hireDatePlaceholder']");
	public By corporate = By.xpath("//*[contains(text(),'Use corporate settings')]");
	public By Perm_enterTimetrack = By.xpath("//td/input[@id='userDataLightBox_submitTimeTrackChBox']");
	public By Perm_ModifyTimetrack = By.xpath("//td/input[@id='userDataLightBox_submitOtherUserTimeTrackChBox']");
	public By Perm_MangeCust_Projects = By.xpath("//td/input[@id='userDataLightBox_manageCustomersProjectsChBox']");
	public By Perm_ManageTasks = By.xpath("//td/input[@id='userDataLightBox_manageTasksChBox']");
	public By Perm_GenrteReports = By.xpath("//td/input[@id='userDataLightBox_generateTimeReportsChBox']");
	public By Perm_GenrateBilling = By.xpath("//td/input[@id='userDataLightBox_generateMoneyReportsChBox']");
	public By Perm_ManagaeAcc_Perm = By.xpath("//td/input[@id='userDataLightBox_manageAccountsChBox']");
	public By Perm_ManageSystems = By.xpath("//td/input[@id='userDataLightBox_manageGeneralSettingsChBox']");
	public By startexploring = By.xpath("//div[@class='startExploringLink']//span");
	public By logout=By.xpath("//a[@class='logout']");

	
}
