package com.SchoolMgmt.schooltest;

import static com.SchoolMgmt.utils.ScrShot.captureScreen;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.SchoolMgmt.schoolPages.MainPage;

public class MainMenuFeeUnits {

	final String mainMenu = "Fee Units";
	public WebDriver driver;

	public MainMenuFeeUnits(WebDriver driver) {
		this.driver = driver;
	}

	public void subMenuFeeHead() throws IOException {
		String subMenu = "Fee Head";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuFeeTemplate() throws IOException {
		String subMenu = "Fee Template";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuFeeClassTemplate() throws IOException {
		String subMenu = "Fee Class Template";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

	public void subMenuFeeCollection() throws IOException {
		String subMenu = "Fee Collection";
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
	}

}