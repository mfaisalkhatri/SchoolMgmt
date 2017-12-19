package com.SchoolMgmt.schooltest;

import java.io.IOException;
import static com.SchoolMgmt.utils.Messages.*;
import org.testng.annotations.Test;

public class TestCasesForLoginMappings extends Setup {

	@Test
	public void Test1() throws InterruptedException, IOException {
		testStartMessage("Mappings Test 1 for Student Class Map");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuMappings mainMap = new MainMenuMappings(driver);
		mainMap.subMenuStdClassMap();

		testEndMessage("Mappings Test 1 for Student Class Map");
	}

	@Test
	public void Test2() throws InterruptedException, IOException {
		testStartMessage("Mappings Test 2 for Teacher subject Map");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuMappings mainMap = new MainMenuMappings(driver);
		mainMap.subMenuTchrSubMap();

		testEndMessage("Mappings Test 2 for Teacher Subject Map");
	}

	@Test
	public void Test3() throws InterruptedException, IOException {

		testStartMessage("Mappings Test 3 for Class Section Map");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuMappings mainMap = new MainMenuMappings(driver);
		mainMap.subMenuClassSectionMap();

		testEndMessage("Mappings Test 3 for Class Section Map");
	}

	@Test
	public void Test4() throws InterruptedException, IOException {

		testStartMessage("Mappings Test 4 for Teacher Class Section Map");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuMappings mainMap = new MainMenuMappings(driver);
		mainMap.subMenuTchrClassSecMap();

		testEndMessage("Mappings Test 4 for Teacher Class Section Map");
	}

	@Test
	public void Test5() throws InterruptedException, IOException {

		testStartMessage("Mappings Test 5 for Teacher Subject Class Map");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuMappings mainMap = new MainMenuMappings(driver);
		mainMap.subMenuTchrSubClassMap();

		testEndMessage("Mappings Test 5 for Teacher Subject Class Map");
	}

	@Test
	public void Test6() throws InterruptedException, IOException {
		testStartMessage("Mappings Test 6 for Teacher Lecture Time Map");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuMappings mainMap = new MainMenuMappings(driver);
		mainMap.subMenuLecTimeMap();

		testEndMessage("Mappings Test 6 for Teacher Lecture Time Map");
	}

	@Test
	public void Test7() throws InterruptedException, IOException {
		String subMenu = "Time Table";
		testStartMessage("Mappings Test 7 for Teacher Time Table");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuMappings mainMap = new MainMenuMappings(driver);
		mainMap.subMenuTimeTable();

		testEndMessage("Mappings Test 7 for Teacher Time Table");
	}

	@Test
	public void Test8() throws InterruptedException, IOException {
		testStartMessage("Mappings Test 8 for Teacher Subject Syllabus");
		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuMappings mainMap = new MainMenuMappings(driver);
		mainMap.subMenuSubjectSyllabus();

		testEndMessage("Mappings Test 8 for Teacher Subject Syllabus");
	}

}
