package com.SchoolMgmt.schooltest;

import static com.SchoolMgmt.utils.ScrShot.captureScreen;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.SchoolMgmt.schoolPages.MainPage;

public class MainMenuGeneralMaintain {
 
	final String mainMenu = "General Maintain";
	public WebDriver driver;
	public MainMenuGeneralMaintain(WebDriver driver) {
		this.driver = driver;
	}
	
	public void subMenuSchoolSession() throws IOException{
		String subMenu = "School Session";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);	
	}
	
	public void subMenuBranch() throws IOException{
		String subMenu = "Branch";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}
	public void subMenuTeacher() throws IOException {
		String subMenu = "Teacher";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}
	public void subMenuStudent() throws IOException{
		String subMenu = "Student";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}
	public void subMenuParent() throws IOException{
		String subMenu = "Parent";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}
	public void subMenuUser() throws IOException{
		String subMenu = "User";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}
	
	
	
	
	
	
	
}
