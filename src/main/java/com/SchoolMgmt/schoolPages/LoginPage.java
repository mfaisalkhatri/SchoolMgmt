package com.SchoolMgmt.schoolPages;

import static com.SchoolMgmt.utils.Sleeper.sleep;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.SchoolMgmt.utils.Selector;


public class LoginPage {

		private static  WebDriver driver;
		
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;

	}
	
	public void loginapp(String usrname, String passw, String accrights) throws IOException {
		

		String [] accRights = {"Admin", "Teacher","Student", "Parent"};
		Selector findEle = new Selector(driver);
		Actions act = new Actions(driver);
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		act.click(findEle.targetId("txtUser")).sendKeys(usrname).build().perform();
		act.click(findEle.targetName("txtPassword")).sendKeys(passw).build().perform();
				
		ArrayList<WebElement> radio = (ArrayList<WebElement>) driver.findElements(By.className("lbl")); 
		
		WebElement target = null;
		if (accrights.equals(accRights[0])) 
		{
			target = radio.get(0);	
		}
		
		else if (accrights.equals(accRights[1])) 
		{
			target = radio.get(1);
		}
		
		else if (accrights.equals(accRights[2])) 
		{
			target = radio.get(2);
		}
		
		else if (accrights.equals(accRights[3]))
		{
			target = radio.get(3);
		}
		
		else
		{
			System.out.println("Access rights field not Found!");		
		}
		
		act.click(target).perform();
		act.click(findEle.targetId("btnLogin")).build().perform();
		
		sleep();
	}
	
}
