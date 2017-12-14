package com.SchoolMgmt.schooltest;

import static com.SchoolMgmt.utils.Messages.*;
import static com.SchoolMgmt.utils.ScrShot.*;
import java.io.IOException;
import org.testng.annotations.Test;
import com.SchoolMgmt.schoolPages.BranchPage;
import com.SchoolMgmt.schoolPages.LoginPage;
import com.SchoolMgmt.schoolPages.MainPage;

public class TestCasesForLoginFeeUnits extends Setup{

	
	final String usrname   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "Fee Units"; 

	@Test
	public void Test1() throws IOException 
	{

		String subMenu  = "Fee Head";
		testStartMessage("Fee Units Test 1 for Fee Head");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrname,pass,accRights);
		
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Fee Units Test 1 for Fee Head");
	}
	

	@Test
	public void Test2() throws InterruptedException, IOException 
	{
		String subMenu  = "Fee Template";
		testStartMessage("Fee Units Test 2 for Fee Template");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrname,pass,accRights);
		
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Fee Units Test 2 for Fee Template");
		
	}
	
	@Test
	public void Test3() throws InterruptedException, IOException 
	{
	
		String subMenu  = "Fee Class Template";
		
		testStartMessage("Fee Units Test 3 for Fee Class Template");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrname,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Fee Units Test 3 for Fee Class Template");
		
	}

	@Test
	public void Test4() throws InterruptedException, IOException 
	{
	
		String subMenu   = "Fee Collection";
		
		testStartMessage("Fee Units Test 4 for Fee Collection");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrname,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
	
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
	
		captureScreen(driver);
		
		testEndMessage("Fee Units Test 4 for Fee Collection");
		
	}	
	
	
}