package com.SchoolMgmt.schooltest;

import static com.SchoolMgmt.utils.Messages.testEndMessage;
import static com.SchoolMgmt.utils.Messages.testStartMessage;
import static com.SchoolMgmt.utils.ScrShot.captureScreen;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.SchoolMgmt.schoolPages.BranchPage;
import com.SchoolMgmt.schoolPages.LoginPage;
import com.SchoolMgmt.schoolPages.MainPage;
import com.SchoolMgmt.schoolPages.TeacherPage;
import com.SchoolMgmt.utils.ExcelDataConfig;

public class TestCaseforAddingTeacher extends Setup{

	final String usrName = "MFK";
	final String pass = "123456";
	final String accRights = "Admin";
	final String mainMenu = "General Maintain";

	@Test(dataProvider = "personalData")
	public void Test1forAddingTeacher(String code, String fName, String mName, String lName, String birthDate,
			String gender, String mStatus, String contactNo, String emailId, String qualfc, String acdm, String panNo,
			String aadhrNo, String pfNo, String enrolNo, String enrolId, String joinDt, String cnfrmDt, String branch,
			String chkLeft, String hasIspartfulltime) throws IOException {

		testStartMessage("Test for Adding teacher record ");
		Login login = new Login(driver);
		login.loginSite();
		
		Branch brnch = new Branch(driver);
		brnch.branchPage();
		
		MainMenuGeneralMaintain mainGen = new MainMenuGeneralMaintain(driver);
		mainGen.subMenuTeacher();
		
		addTeacher(code, fName, mName, lName, birthDate, gender, mStatus, contactNo, emailId, qualfc, acdm, panNo,
				aadhrNo, pfNo, enrolNo, enrolId, joinDt, cnfrmDt, branch, chkLeft, hasIspartfulltime);
		testEndMessage("Teacher Record added Succesfully!!");
	}

	@DataProvider(name = "personalData")
	public Iterator<Object[]> passData() {
		String xlPath = "F:\\Github\\SchoolMgmt\\src\\test\\resources\\TeacherDetails.xlsx";
		ExcelDataConfig excl = new ExcelDataConfig(xlPath);
		int rows = excl.getRowCount(0);
		int col = excl.getColCount(0);

		List<Object[]> data = new ArrayList<>();
		for (int i = 0; i < rows; i++) {
			Object[] set = new Object[col];
			for (int j = 0; j < 21; j++) {
				set[j] = excl.getData(0, i + 1, j);
			}
			data.add(set);
		}
		return data.iterator();
	}

	public void addTeacher(String code, String fName, String mName, String lName, String birthDate, String gender,
			String mStatus, String contactNo, String emailId, String qualfc, String acdm, String panNo, String aadhrNo,
			String pfNo, String enrolNo, String enrolId, String joinDt, String cnfrmDt, String branch, String chkLeft,
			String hasIspartfulltime) throws IOException {

		TeacherPage tPage = new TeacherPage(driver);
		tPage.teacherElements();
		tPage.addTeacherFirstBlock(code, fName, mName, lName);
		tPage.addTeacherSecondBlock(birthDate, Boolean.parseBoolean(gender), Boolean.parseBoolean(mStatus), contactNo);
		tPage.addTeacherThirdBlock(emailId, qualfc, acdm, panNo);
		tPage.addTeacherFourthBlock(aadhrNo, pfNo, enrolNo, enrolId);
		tPage.addTeacherFifthBlock(joinDt, cnfrmDt, branch.split(","), Boolean.parseBoolean(chkLeft),
				Boolean.parseBoolean(hasIspartfulltime));

		captureScreen(driver);
	}

}
