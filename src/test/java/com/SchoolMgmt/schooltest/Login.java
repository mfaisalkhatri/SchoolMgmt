package com.SchoolMgmt.schooltest;

import static com.SchoolMgmt.utils.ScrShot.captureScreen;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.SchoolMgmt.schoolPages.LoginPage;

public class Login {

	public WebDriver driver;
	final String usrName   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "General Maintain";

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void loginSite() throws IOException {
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName, pass, accRights);
		captureScreen(driver);
	}

	
	
}
