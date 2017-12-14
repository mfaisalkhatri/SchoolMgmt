package com.SchoolMgmt.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selector {

	private WebDriver driver;


	public Selector(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public WebElement targetId(String locator) {
		
		WebElement elementId = driver.findElement(By.id(locator));
		return elementId;
	}
	
	public WebElement targetName(String locator) {
		WebElement elementName = driver.findElement(By.name(locator));
		return elementName;
	}	
	
	public WebElement targetCss(String locator) {
		WebElement elementCss = driver.findElement(By.cssSelector(locator));
		return elementCss;	
	}
	
	public WebElement targetXPath(String locator) {
		WebElement elementXPath = driver.findElement(By.xpath(locator));
		return elementXPath;	
	}
	
	
	public WebElement targetLinkText(String locator) {
		WebElement elementLinkText = driver.findElement(By.linkText(locator));
		return elementLinkText;
		
	}
	
	public WebElement targetPartialLinkText(String locator) {
		WebElement elementPartialLinkText = driver.findElement(By.partialLinkText(locator));
		return elementPartialLinkText;	
	}

	public WebElement targetclassName(String locator) {
		WebElement elementClassName = driver.findElement(By.className(locator));
		return elementClassName;	
	}

	public WebElement targetTagName(String locator) {
		WebElement elementTagName = driver.findElement(By.tagName(locator));
		return elementTagName;	
	}

	
	
	
	
	
	
	
	
	
	
}
