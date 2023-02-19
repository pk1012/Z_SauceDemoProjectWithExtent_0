package com.sauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.POM_1_Home;

public class TC04_VerifyTheFliterFunctionality extends TestBaseClass
{
	@Test
	public void verifyTheFliterFunctionality() throws IOException
	{
		POM_1_Home hp = new POM_1_Home(driver);
		
		hp.clickOnFilter();
		System.out.println("Clicked on filter dropDown");

		hp.selectAt2(driver);
		System.out.println("Selected element at index 2");
		
		String actual = hp.getFilterText();
		String expected = "";
		
		Assert.assertEquals(actual, expected);
		
	}
}
