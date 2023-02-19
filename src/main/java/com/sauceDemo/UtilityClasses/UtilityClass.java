package com.sauceDemo.UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{
	public static void screenshot(WebDriver driver, String name) throws IOException
	{
		Date d = new Date(); 
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy__HH-mm-ss"); 
		String date = d1.format(d);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File("D:\\Velocity\\Automation Screenshots\\Sauce Demo\\" + name + "__" + date + ".jpg");
		FileHandler.copy(source, desti);
	}
}
