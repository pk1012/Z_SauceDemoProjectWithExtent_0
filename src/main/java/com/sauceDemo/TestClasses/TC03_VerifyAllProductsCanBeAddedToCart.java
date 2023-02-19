package com.sauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sauceDemo.POMClasses.POM_1_Home;

public class TC03_VerifyAllProductsCanBeAddedToCart extends TestBaseClass
{
	@Test
	public void verifyAllProductsCanBeAddedToCart() throws InterruptedException 
	{
		POM_1_Home hp = new POM_1_Home(driver);

		hp.allProductClick();
		System.out.println("clicked on all add to cart btn");

		Thread.sleep(5000);

		hp.moveToCartPreview();
		System.out.println("moved to cart_Preview");

		String actualItemsInCart = hp.getCartPreview();
		String expectedItemsInCart = "6";
		System.out.println("Applied validation");

		Assert.assertEquals(actualItemsInCart, expectedItemsInCart);
	}
}
