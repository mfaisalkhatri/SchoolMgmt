package com.SchoolMgmt.schoolPages;

import static com.SchoolMgmt.utils.Sleeper.sleep;
import com.SchoolMgmt.utils.Selector;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TeacherPage {

	private WebDriver driver;

	public TeacherPage(WebDriver driver) {
		this.driver = driver;
	}

	public void teacherElements() {

		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);

		act.click(findEle.targetCss(".btn.btn-success.btn-sm")).perform();
		System.out.println("Add Button Clicked!!");

	}

	public void addTeacherFirstBlock(String code, String fName, String mName, String lName) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);

		act.click(findEle.targetId("txtCode")).sendKeys(code).perform();
		act.click(findEle.targetId("txtFname")).sendKeys(fName).perform();
		act.click(findEle.targetId("txtMname")).sendKeys(mName).perform();
		act.click(findEle.targetId("txtLname")).sendKeys(lName).perform();

	}

	public void addTeacherSecondBlock(String birthDate, boolean gender, boolean mStatus, String contactNo) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);

		act.click(findEle.targetId("dtBirthDate")).sendKeys(birthDate).perform();

		ArrayList<WebElement> gend = (ArrayList<WebElement>) driver.findElements(By.className("lbl"));

		WebElement target = null;
		if (gender == true) {
			target = gend.get(0);
		}

		else if (gender == false) {
			target = gend.get(1);
		} else {
			System.out.println("Gender element not found!!");
		}
		act.click(target).perform();

		ArrayList<WebElement> mStat = (ArrayList<WebElement>) driver.findElements(By.className("lbl"));
		WebElement targt = null;
		if (!mStatus) {
			targt = mStat.get(0);
		} else {
			targt = mStat.get(1);
		}

		act.click(targt).perform();

		act.click(findEle.targetId("txtContactno")).sendKeys(contactNo).perform();
	}

	public void addTeacherThirdBlock(String emailId, String qualfc, String acdm, String panNo) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);

		act.click(findEle.targetId("txtEmail")).sendKeys(emailId).perform();
		act.click(findEle.targetId("txtQualification")).sendKeys(qualfc).perform();
		act.click(findEle.targetId("txtAchedamics")).sendKeys(acdm).perform();
		act.click(findEle.targetId("txtPancard")).sendKeys(panNo).perform();
	}

	public void addTeacherFourthBlock(String aadhrNo, String pfNo, String enrolNo, String enrolId) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);

		act.click(findEle.targetId("txtAadharCard")).sendKeys(aadhrNo).perform();
		act.click(findEle.targetId("txtPfnumber")).sendKeys(pfNo).perform();
		act.click(findEle.targetId("txtEnrollNumber")).sendKeys(enrolNo).perform();
		act.click(findEle.targetId("txtEnrollmentid")).sendKeys(enrolId).perform();
	}

	public void addTeacherFifthBlock(String joinDt, String cnfrmDt, String[] branch, boolean leftchk,
			boolean partTime) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);

		act.click(findEle.targetId("dtJoinDate")).sendKeys(joinDt).perform();
		act.click(findEle.targetId("dtConfirmdate")).sendKeys(cnfrmDt).perform();
		actionOnHasLeftCheckbox(leftchk);
		actionOnPartTimeCheckbox(partTime);
		actiononBranchField(branch);
		saveRecord();
		
	}

	public void actionOnHasLeftCheckbox(boolean chkLeft) {

		Actions act = new Actions(driver);
		
		WebElement chkbLeft = driver.findElement(By.id("chkHasleft"));

		if (chkLeft == true) {
			act.click(chkbLeft).perform();
		}

		else if (chkLeft == false) {
		} else {
			System.out.println("Has Left element not found!!");
		}

	}

	public void actionOnPartTimeCheckbox(boolean hasIspartfullTime) {

		Actions act = new Actions(driver);	
		WebElement partTime = driver.findElement(By.id("chkIsparttimefulltime"));

		if (hasIspartfullTime == true) {
		
			act.click(partTime).perform();
		}

		else if (hasIspartfullTime == false) {
		} else {
			System.out.println("Is Part Time element not found!!");
		}

	}

	public void actiononBranchField(String[] branch) {

		WebElement bBtn = driver.findElement(By.cssSelector(".multiselect.dropdown-toggle.btn.btn-white.btn-primary"));
		bBtn.click();
		sleep();
		List<WebElement> list = driver.findElements(By.cssSelector(".btn-group.open>ul>li>a"));

		String[] opts = branch;
		for (String opt : opts) { // Excel.
			WebElement option = list.stream().filter(e -> e.getText().equals(opt)).findFirst().get();
			option.click();
			sleep();
		}
		bBtn.click();

	}
	
	public void saveRecord () {
		Actions act = new Actions(driver);
		WebElement saveBtn = driver.findElement(By.id(("btnSave")));
		act.click(saveBtn).perform();
		sleep();

	}
}
