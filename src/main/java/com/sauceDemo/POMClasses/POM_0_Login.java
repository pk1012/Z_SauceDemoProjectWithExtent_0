package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_0_Login 
{
	// 4 steps
	// WebDriver driver
	// Constructor
	// Find element
	// method action on element
	
	private WebDriver driver;
	
	public POM_0_Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath=("//input [@id = 'user-name']")) private WebElement username;
	
	@FindBy (xpath=("//input [@id = 'password']")) private WebElement password;
	
	@FindBy (xpath=("//input [@id = 'login-button']")) private WebElement loginBtn;
	
	public void sendUsername(String un)
	{
		username.sendKeys(un);
	}
	
	public void sendPassword(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	
	
	public String getTitle()
	{
		String s = driver.getTitle();
		return s;
	}
	
	
}
