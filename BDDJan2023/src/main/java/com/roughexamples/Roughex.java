package com.roughexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Roughex {
	private static WebDriver driver;
	
	public void test() {
		System.out.println("Testing is simple, but not easy");
	}
	private static void exa() {
		System.out.println("privatetest");
	}
	
	public static void sattestx() {
		System.out.println("Static test");
	}
	
	
	public class rogh2 extends Roughex{
		
		public void secondmen() {
			Roughex.exa();
		}
		
		public void test() {
			System.out.println("calling from second class");
		}
		
		public void hiredate() {
			//driver.findElement(pickcalendar).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			String date = "12";
			String year = "2022";
			String month = "Feb";
			// String Yearwindow="//button[@id='ext-gen333']";
			String Yearwindow = "//table/tbody/tr/td[@class='x-date-middle']/table/tbody/tr/td/em/button";
			driver.findElement(By.xpath(Yearwindow)).click();
			// String selectYear="//div[@class='x-date-mp']/table/tbody/tr/td/a[text()="
			// +year+ "]";
			String clas = "x-date-mp-monthx-date-mp-sel";
			String selectYear = "//div[@class='x-date-mp']/table/tbody/tr/td[@class=" + clas + "]/a[text()='2022']";

			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.xpath(selectYear)).click();
			String selectmont = "//div[@class='x-date-mp']/table/tbody/tr/td[@class='x-date-mp-month x-date-mp-sel']/a[text()='Feb']";
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.xpath(selectmont)).click();
			driver.findElement(By.xpath("//div[@class='x-date-mp']/table/tbody/tr/td/button[@class='x-date-mp-ok']"))
					.click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			String hdate = "//a[@class='x-date-date']/em/span[text()=" + date + "]";
			driver.findElement(By.xpath(hdate)).click();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		
		
		
		public void workdays1(String Tuesday) {
	        //Monday="1";
			Tuesday = "2";
			//Wednesday = "3";
			//Thursday = "4";
			//Friday = "5";
			String Saturday = "6";
			String Sunday = "7";
			
			//int mon = Integer.parseInt(Monday);
			int tue = Integer.parseInt(Tuesday);
			//int wed = Integer.parseInt(Wednesday);
			//int thur = Integer.parseInt(Thursday);
			//int fri = Integer.parseInt(Friday);
			//int sat = Integer.parseInt(Saturday);
			//int sun = Integer.parseInt(Sunday);

			//driver.findElement(corporate).click();

			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[@class='first']/input")).sendKeys(".5");
			//driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[" + mon + "]/input")).sendKeys(".5");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[" + tue + "]/input")).sendKeys(".75");
			
			  //driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[" + wed + "]/input")).sendKeys(".125");
			 // driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[" + thur + "]/input")).sendKeys(".275");
			 // driver.findElement(By.xpath("//table[@class='wdEditor']/tbody/tr/td[" + fri + "]/input")).sendKeys(".355");
			 

		}
		
		
	}

	public static void main(String[] args) {
		Roughex.exa();
		Roughex rgx= new Roughex();
		rgx.sattestx();
		rgx.test();	

		
	}

}
