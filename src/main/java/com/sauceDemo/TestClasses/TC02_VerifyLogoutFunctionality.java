package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_VerifyLogoutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogoutFunctionality()
	{
		String expected = "Swag Labs";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
	}
}
