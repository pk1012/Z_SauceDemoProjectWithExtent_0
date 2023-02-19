package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01_VerifyLoginFunctionality extends TestBaseClass
{	
	@Test
	public void verifyLoginFunctionality()
	{
		extent.createTest("verifyLoginFunctionality");
		
		String actual = driver.getTitle();
		String expected = "Swag Labs";
		
		Assert.assertEquals(actual, expected);
	}
}
