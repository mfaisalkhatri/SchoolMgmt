package com.SchoolMgmt.schooltest;

import java.io.IOException;

import static com.SchoolMgmt.utils.Messages.*;
import static com.SchoolMgmt.utils.ScrShot.*;
import org.testng.annotations.Test;

import com.SchoolMgmt.schoolPages.BranchPage;
import com.SchoolMgmt.schoolPages.LoginPage;
import com.SchoolMgmt.schoolPages.MainPage;

public class TestCasesForLoginMappings extends Setup{

	final String usrName   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "Mappings";
	
	@Test
	public void Test1() throws InterruptedException, IOException 
	{	
		String subMenu  = "Student Class Map";
		testStartMessage("Mappings Test 1 for Student Class Map");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);
		
		testEndMessage("Mappings Test 1 for Student Class Map");
	}
	
	@Test
	public void Test2() throws InterruptedException, IOException 
	{
		String subMenu = "Teacher Subject Map";
		testStartMessage("Mappings Test 2 for Teacher subject Map");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
			
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Mappings Test 2 for Teacher Subject Map");
	}
	
	@Test
	public void Test3() throws InterruptedException, IOException 
	{	
		String subMenu =  "Class Section Map";
		testStartMessage("Mappings Test 3 for Class Section Map");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName, pass, accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);
		
		testEndMessage("Mappings Test 3 for Class Section Map");
	}
		
	@Test
	public void Test4() throws InterruptedException, IOException 
	{
		
		String subMenu = "Teacher Class Section Map";
		testStartMessage("Mappings Test 4 for Teacher Class Section Map");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Mappings Test 4 for Teacher Class Section Map");
	}
		
	@Test
	public void Test5() throws InterruptedException, IOException 
	{
		
		String subMenu = "Teacher Subject Class Map";
		testStartMessage("Mappings Test 5 for Teacher Subject Class Map");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);
		
		testEndMessage("Mappings Test 5 for Teacher Subject Class Map");
	}
		
	@Test
	public void Test6() throws InterruptedException, IOException 
	{
		String subMenu = "Lecture Time Map";
		testStartMessage("Mappings Test 6 for Teacher Lecture Time Map");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName, pass, accRights);
		
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Mappings Test 6 for Teacher Lecture Time Map");
	}
		
	@Test
	public void Test7() throws InterruptedException, IOException 
	{
		String subMenu = "Time Table";
		testStartMessage("Mappings Test 7 for Teacher Time Table");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Mappings Test 7 for Teacher Time Table");
	}
		
	
	@Test
	public void Test8() throws InterruptedException, IOException 
	{	
		String subMenu = "Subject Syllabus";
		testStartMessage("Mappings Test 8 for Teacher Subject Syllabus");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
	
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("Mappings Test 8 for Teacher Subject Syllabus");
	}

}
