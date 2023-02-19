package com.sauceDemo.TestClasses;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.POM_0_Login;
import com.sauceDemo.POMClasses.POM_1_Home;
import com.sauceDemo.UtilityClasses.ExtentReport;

public class TestBaseClass extends ExtentReport
{
	WebDriver driver;
	
	@Parameters("browserName")
	@BeforeClass
	public void beforeClass(String browserName)
	{
		
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");
		
			driver = new ChromeDriver();
			System.out.println("opened browser");
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"./DriverFolder/geckodriver.exe");
			
			driver = new FirefoxDriver();
			System.out.println("opened browser");
		}
		else
		{
			System.setProperty("webdriver.edge.driver", 
					"./DriverFolder/msedgedriver.exe");
			
			driver = new EdgeDriver();
			System.out.println("opened browser");
		}
		
		driver.manage().window().maximize();
		System.out.println("maximized browser");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("opened website");
	}
	
	@BeforeMethod
	public void setUp()
	{
		POM_0_Login lp = new POM_0_Login(driver);
		
		lp.sendUsername("standard_user");
		System.out.println("entered username");
		
		lp.sendPassword("secret_sauce");
		System.out.println("entered password");
		
		lp.clickLoginBtn();
		System.out.println("clicked on login button");
		
	}

	@AfterMethod
	public void tearDown()
	{
		POM_1_Home hp = new POM_1_Home(driver);
		
		hp.clickSettingBtn();
		System.out.println("Clicked on setting btn");
		
		hp.clickLogoutBtn();
		System.out.println("Clicked on logout btn");
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
		System.out.println("Closed browser");
	}
	
}
