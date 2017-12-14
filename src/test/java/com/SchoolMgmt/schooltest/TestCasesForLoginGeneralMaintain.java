package com.SchoolMgmt.schooltest;

import java.io.IOException;

import static com.SchoolMgmt.utils.Messages.*;
import static com.SchoolMgmt.utils.ScrShot.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.SchoolMgmt.schoolPages.BranchPage;
import com.SchoolMgmt.schoolPages.LoginPage;
import com.SchoolMgmt.schoolPages.MainPage;
import com.SchoolMgmt.schoolPages.TeacherPage;
import com.SchoolMgmt.utils.ExcelDataConfig;

public class TestCasesForLoginGeneralMaintain extends Setup{

	final String usrName   = "MFK";
	final String pass      = "123456";
	final String accRights = "Admin";
	final String mainMenu  = "General Maintain";
	
	/*@Test
	public void GenMaintainTest1() throws IOException 
	{

		String subMenu  = "School Session";
		testStartMessage("General Maintain Test 1 for School Session");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();

		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("General Maintain Test 1 for School Session");
	}

	@Test
	public void Test2() throws InterruptedException, IOException 
	{
	
		String subMenu   = "Branch";
		testStartMessage("General Maintain Test 2 for Branch");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);
		captureScreen(driver);
		
		testEndMessage("General Maintain Test 2 for Branch");	
	
	}
	*/
	@Test (dataProvider = "personalData")
	/*public void Test3(String code, String fName, String mName, String lName, String birthDate, String gender, String mStatus, String contactNo,
					  String emailId, String qualfc, String acdm, String panNo, String aadhrNo, String pfNo, String enrolNo, String enrolId,
					  String joinDt, String cnfrmDt, String[] branch, String chkLeft, String hasIspartfulltime)*/
			
	//public void Test3(String [] branch)	throws IOException
	public void Test3(String[] branch) throws IOException  
	{	
		String subMenu   = "Teacher";
		testStartMessage("General Maintain Test 3 for Teacher");
		
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);
		
		TeacherPage tPage = new TeacherPage(driver);
		tPage.teacherElements();
		//tPage.addTeacherFirstBlock(code,fName,mName,lName);
		//tPage.addTeacherSecondBlock(birthDate,Boolean.parseBoolean(gender),Boolean.parseBoolean(mStatus),contactNo);
		//tPage.addTeacherThirdBlock(emailId, qualfc, acdm, panNo);
		//tPage.addTeacherFourthBlock(aadhrNo, pfNo, enrolNo, enrolId);
		//tPage.addTeacherFifthBlock(joinDt, cnfrmDt, branch, Boolean.parseBoolean(chkLeft), Boolean.parseBoolean(hasIspartfulltime));
		tPage.addTeacherFifthBlock(branch);
		
		captureScreen(driver);
		
		testEndMessage("General Maintain Test 3 for Teacher");
	}
	
/*	@Test
	public void Test4() throws IOException 
	{
		String subMenu   = "Student";
		testStartMessage("General Maintain Test 4 for Student");
	
		LoginPage login = new LoginPage(driver);
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
		
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu, subMenu);	
		captureScreen(driver);		
		
		testEndMessage("General Maintain Test 4 for Student");
	}
	
	@Test
	public void Test5() throws InterruptedException, IOException 
	{
		String subMenu   = "User";
		testStartMessage("General Maintain Test 5 for User");
		
		LoginPage login = new LoginPage(driver);	
		login.loginapp(usrName,pass,accRights);
		captureScreen(driver);

		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
	
		MainPage mpg = new MainPage(driver);
		mpg.mainPageAfterLogin(mainMenu,subMenu);
		captureScreen(driver);	
		
		testEndMessage("General Maintain Test 5 for User");
	}*/
	
	
	@DataProvider (name = "personalData") 
	public Object[][] passData (){
		String xlPath = "D:\\Eclipse_Oxygen\\schooltestLocal\\src\\test\\resources\\TeacherDetails.xlsx";
		ExcelDataConfig excl = new ExcelDataConfig(xlPath);
		int rows = excl.getRowCount(0);
	
		Object[][] data  = new Object [rows][1];
		for (int i = 0; i< rows ;i++) {
			
			data [i][0] = excl.getData(0, i + 1, 0);
			/*data [i][1] = excl.getData(0, i + 1, 1);
			data [i][2] = excl.getData(0, i + 1, 2);
			data [i][3] = excl.getData(0, i + 1, 3);
			data [i][4] = excl.getData(0, i + 1, 4);
			data [i][5] = excl.getData(0, i + 1, 5);
			data [i][6] = excl.getData(0, i + 1, 6);
			data [i][7] = excl.getData(0, i + 1, 7);
			data [i][8] = excl.getData(0, i + 1, 8);
			data [i][9] = excl.getData(0, i + 1, 9);
			data [i][10] = excl.getData(0, i + 1, 10);
			data [i][11] = excl.getData(0, i + 1, 11);
			data [i][12] = excl.getData(0, i + 1, 12);
			data [i][13] = excl.getData(0, i + 1, 13);
			data [i][14] = excl.getData(0, i + 1, 14);
			data [i][15] = excl.getData(0, i + 1, 15);
			data [i][16] = excl.getData(0, i + 1, 16);
			data [i][17] = excl.getData(0, i + 1, 17);
			data [i][18] = excl.getData(0, i + 1, 18);
			data [i][19] = excl.getData(0, i + 1, 19);
			data [i][20] = excl.getData(0, i + 1, 20);*/

		}
		return data;
	}
	
	
}
