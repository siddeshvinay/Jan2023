package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		System.out.println("browser vlaue is :" + browser);
		
		if(browser.equals("Chrome")) {
		  WebDriverManager.chromedriver().setup();
		  tlDriver.set(new ChromeDriver());	
		}
		
		else {
			System.out.println("Please pass the correct brower value:"+ browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
	}
	
	public static synchronized  WebDriver getDriver() {
		return tlDriver.get();
	}
	

}
