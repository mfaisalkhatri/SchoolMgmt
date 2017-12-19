package com.SchoolMgmt.schooltest;

import org.openqa.selenium.WebDriver;

import com.SchoolMgmt.schoolPages.BranchPage;

public class Branch {

	public WebDriver driver;
	
	public Branch(WebDriver driver) {
	this.driver = driver;
}
	
	public void branchPage() {
		BranchPage bpage = new BranchPage(driver);
		bpage.Branch();
	}

}
