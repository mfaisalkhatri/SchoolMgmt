package com.SchoolMgmt.schooltest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Setup {

	public WebDriver driver;
	final String dir = System.getProperty ("user.dir");
	final String path = dir + "/src/test/resources/win_chromedriver.exe";
	String baseurl = "http://devtest.eskulpro.com/Login.aspx";
	

	@BeforeMethod
	public void Siteup () 
	{
		System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown () 
	{
		driver.quit();
	}
	

}
