package com.SchoolMgmt.schooltest;

import java.io.IOException;
import static com.SchoolMgmt.utils.Messages.*;
import org.testng.annotations.Test;

public class TestCasesForLoginGeneralMaintain extends Setup {

	@Test
	public void GenMaintainTest1() throws IOException {

		testStartMessage("General Maintain Test 1 for School Session");
		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuGeneralMaintain mainGen = new MainMenuGeneralMaintain(driver);
		mainGen.subMenuSchoolSession();

		testEndMessage("General Maintain Test 1 for School Session");
	}

	@Test
	public void Test2() throws InterruptedException, IOException {

		testStartMessage("General Maintain Test 2 for Branch");
		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuGeneralMaintain mainGen = new MainMenuGeneralMaintain(driver);
		mainGen.subMenuBranch();

		testEndMessage("General Maintain Test 2 for Branch");

	}

	@Test
	public void Test3() throws IOException {
		testStartMessage("General Maintain Test 3 for Teacher");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuGeneralMaintain mainGen = new MainMenuGeneralMaintain(driver);
		mainGen.subMenuTeacher();

		testEndMessage("General Maintain Test 3 for Teacher");
	}

	@Test
	public void Test4() throws IOException {
		testStartMessage("General Maintain Test 4 for Student");
		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuGeneralMaintain mainGen = new MainMenuGeneralMaintain(driver);
		mainGen.subMenuStudent();

		testEndMessage("General Maintain Test 4 for Student");
	}
	
	@Test
	public void Test5() throws IOException {
		testStartMessage("General Maintain Test 5 for Parent");
		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuGeneralMaintain mainGen = new MainMenuGeneralMaintain(driver);
		mainGen.subMenuStudent();

		testEndMessage("General Maintain Test 5 for Parent");
	}
	
	@Test
	public void Test6() throws InterruptedException, IOException {
		testStartMessage("General Maintain Test 5 for User");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuGeneralMaintain mainGen = new MainMenuGeneralMaintain(driver);
		mainGen.subMenuUser();

		testEndMessage("General Maintain Test 5 for User");
	}
}
