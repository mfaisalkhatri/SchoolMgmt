package com.SchoolMgmt.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScrShot {
	
	private static WebDriver driver;
	
	public ScrShot(WebDriver driver ) {
	 this.driver = driver;
	}

	
	public static void captureScreen (WebDriver driver) throws IOException {
		String path = System.getProperty("user.dir");
		String scrPath = path + "/src/test/ScreenShot/";
		String scrPrefix = "SCR";
		
		SimpleDateFormat date = new SimpleDateFormat ("yyyyMMdd-HHmmss");
		final String timeStamp = date.format (Calendar.getInstance ().getTime ());
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(scrPath+scrPrefix+timeStamp+".jpeg"));

	}
	
}
