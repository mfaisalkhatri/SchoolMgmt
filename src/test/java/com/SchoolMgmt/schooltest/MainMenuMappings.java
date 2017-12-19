package com.SchoolMgmt.schooltest;

import static com.SchoolMgmt.utils.ScrShot.captureScreen;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.SchoolMgmt.schoolPages.MainPage;

public class MainMenuMappings {
	final String mainMenu = "Mappings";
	public WebDriver driver;

	public MainMenuMappings(WebDriver driver) {
		this.driver = driver;
	}

	public void subMenuStdClassMap() throws IOException {
		String subMenu = "Student Class Map";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuTchrSubMap() throws IOException {
		String subMenu = "Teacher Subject Map";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuClassSectionMap() throws IOException {
		String subMenu = "Class Section Map";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuTchrClassSecMap() throws IOException {
		String subMenu = "Teacher Class Section Map";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuTchrSubClassMap() throws IOException {
		String subMenu = "Teacher Subject Class Map";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuLecTimeMap() throws IOException {
		String subMenu = "Lecture Time Map";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuTimeTable() throws IOException {
		String subMenu = "Time Table";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuSubjectSyllabus() throws IOException {
		String subMenu = "Subject Syllabus";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

}
