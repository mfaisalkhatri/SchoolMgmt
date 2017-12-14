package com.SchoolMgmt.schoolPages;


import com.SchoolMgmt.utils.Selector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TeacherPage {
	
	private WebDriver driver;
	
	public TeacherPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	public void teacherElements () {
		
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);
		
		act.click(findEle.targetCss(".btn.btn-success.btn-sm")).perform();
		System.out.println("Add Button Clicked!!");
	
	}
	
	/*public void addTeacherRecord (String code) {
		
		Selectors findEle = new Selectors(driver);
		Actions act = new Actions(driver);
	
		act.click(findEle.targetId("txtCode")).sendKeys(code).perform();
		
	}*/
	public void addTeacherFirstBlock(String code,String fName, String mName, String lName) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);
	
		act.click(findEle.targetId("txtCode")).sendKeys(code).perform();
		act.click(findEle.targetId("txtFname")).sendKeys(fName).perform();
		act.click(findEle.targetId("txtMname")).sendKeys(mName).perform();
		act.click(findEle.targetId("txtLname")).sendKeys(lName).perform();
		
	}
	
	public void addTeacherSecondBlock(String birthDate,boolean gender,boolean mStatus,String contactNo) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);
		
		act.click(findEle.targetId("dtBirthDate")).sendKeys(birthDate).perform();
		
		ArrayList<WebElement> gend = (ArrayList<WebElement>) driver.findElements(By.className("lbl")); 
		
		WebElement target = null;
		if (gender == true) 
		{
			target = gend.get(0);	
		}
		
		else if (gender == false) 
		{
			target = gend.get(1);
		}
		else 
		{
		 System.out.println("Gender element not found!!");
		}	
		act.click(target).perform();
		
		ArrayList<WebElement> mStat = (ArrayList<WebElement>) driver.findElements(By.className("lbl")); 
		WebElement targt = null;
		if (!mStatus) 
		{
			targt = mStat.get(0);
		}
		else
		{
			targt = mStat.get(1);
		}
			
		act.click(targt).perform(); 
		
		act.click(findEle.targetId("txtContactno")).sendKeys(contactNo).perform();	
	}
	
	public void addTeacherThirdBlock(String emailId, String qualfc, String acdm,String panNo) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);
		
		act.click(findEle.targetId("txtEmail")).sendKeys(emailId).perform();
		act.click(findEle.targetId("txtQualification")).sendKeys(qualfc).perform();
		act.click(findEle.targetId("txtAchedamics")).sendKeys(acdm).perform();
		act.click(findEle.targetId("txtPancard")).sendKeys(panNo).perform();	
	}
	
	public void addTeacherFourthBlock(String aadhrNo, String pfNo,String enrolNo, String enrolId) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);
	
		act.click(findEle.targetId("txtAadharCard")).sendKeys(aadhrNo).perform();
		act.click(findEle.targetId("txtPfnumber")).sendKeys(pfNo).perform();
		act.click(findEle.targetId("txtEnrollNumber")).sendKeys(enrolNo).perform();
		act.click(findEle.targetId("txtEnrollmentid")).sendKeys(enrolId).perform();	
	}
	
	/*public void addTeacherFifthBlock(String joinDt, String cnfrmDt,String[] branch, boolean leftchk, boolean partTime) {
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);
		
		act.click(findEle.targetId("dtJoinDate")).sendKeys(joinDt).perform();
		act.click(findEle.targetId("dtConfirmdate")).sendKeys(cnfrmDt).perform();
		actiononBranchField(branch);
		actionOnHasLeftCheckbox(leftchk);
		actionOnPartTimeCheckbox(partTime);
		
	}*/
	
	public void addTeacherFifthBlock(String[] branch) {
		
		actiononBranchField(branch);
		
	}
	
	public void actionOnHasLeftCheckbox(boolean chkLeft) {
	
		Actions act = new Actions(driver);
	
		WebElement chkbLeft = driver.findElement(By.id("chkHasleft"));
		 
		if (chkLeft == true) 
		{
			act.click(chkbLeft).perform();
		}
		
		else if (chkLeft == false) 
		{}
		else 
		{
		 System.out.println("Has Left element not found!!");
		}	
		
	}
	
	public void actionOnPartTimeCheckbox(boolean hasIspartfullTime) {
		
		Actions act = new Actions(driver);
		WebElement partTime = driver.findElement(By.id("chkIsparttimefulltime"));
		
		if (hasIspartfullTime == true) 
		{
			act.click(partTime).perform();
		}
		
		else if (hasIspartfullTime == false) 
		{}
		else 
		{
		 System.out.println("Is Part Time element not found!!");
		}	
		
	}
	
	public void actiononBranchField(String[] branch) {
		
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);
		WebElement brnch = findEle.targetCss(".multiselect.dropdown-toggle.btn.btn-white.btn-primary");
		
		act.click(brnch).perform();
	
		 		act.click(findEle.targetCss(".multiselect.dropdown-toggle.btn.btn-white.btn-primary"));
		 		List<WebElement> list = driver.findElements(By.cssSelector(".multiselect-container.dropdown-menu>ul > li> a"));
		  		
		 		List<String> opts = Arrays.asList(branch);
		 		for (WebElement opt : list) {
		 			if(opts.contains(opt.getText())) {
		 				String options = opt.getText();
		 				System.out.println(options);
		 				act.click(opt);
		 			}
		 			
		 			//WebElement option = list.stream().filter(e -> e.getText().equals(opt)).findFirst().get();
		 			//option.click ();
		 			
		 		}
		
		
	}
	
	
}
