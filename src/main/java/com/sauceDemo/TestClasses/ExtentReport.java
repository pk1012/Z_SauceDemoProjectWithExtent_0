package com.sauceDemo.TestClasses;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport 
{
	ExtentSparkReporter spark;
	ExtentReports extent;

	@BeforeSuite
	public void beforeSuite() 
	{
		spark = new ExtentSparkReporter("Spark.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}

	@AfterSuite
	public void afterSuit() 
	{
		extent.flush();
	}
}
