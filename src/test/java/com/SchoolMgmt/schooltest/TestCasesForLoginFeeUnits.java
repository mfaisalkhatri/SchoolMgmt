package com.SchoolMgmt.schooltest;

import static com.SchoolMgmt.utils.Messages.*;
import java.io.IOException;
import org.testng.annotations.Test;

public class TestCasesForLoginFeeUnits extends Setup {

	@Test
	public void Test1() throws IOException {
		testStartMessage("Fee Units Test 1 for Fee Head");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuFeeUnits mainFee = new MainMenuFeeUnits(driver);
		mainFee.subMenuFeeHead();

		testEndMessage("Fee Units Test 1 for Fee Head");
	}

	@Test
	public void Test2() throws InterruptedException, IOException {

		testStartMessage("Fee Units Test 2 for Fee Template");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuFeeUnits mainFee = new MainMenuFeeUnits(driver);
		mainFee.subMenuFeeTemplate();

		testEndMessage("Fee Units Test 2 for Fee Template");

	}

	@Test
	public void Test3() throws InterruptedException, IOException {

		testStartMessage("Fee Units Test 3 for Fee Class Template");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuFeeUnits mainFee = new MainMenuFeeUnits(driver);
		mainFee.subMenuFeeClassTemplate();

		testEndMessage("Fee Units Test 3 for Fee Class Template");

	}

	@Test
	public void Test4() throws InterruptedException, IOException {

		testStartMessage("Fee Units Test 4 for Fee Collection");

		Login login = new Login(driver);
		login.loginSite();

		Branch brnch = new Branch(driver);
		brnch.branchPage();

		MainMenuFeeUnits mainFee = new MainMenuFeeUnits(driver);
		mainFee.subMenuFeeCollection();

		testEndMessage("Fee Units Test 4 for Fee Collection");

	}

}