package com.sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1_Home
{
	private WebDriver driver;
	private Actions act;
	
	
	public POM_1_Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	@FindBy(xpath = ("//button [text() = 'Add to cart']")) 
	List <WebElement> allAddToCarts;
	
	@FindBy(xpath = ("//a [@class = 'shopping_cart_link']"))
	WebElement cartPreview;
	
	@FindBy (xpath = ("//select [@class = 'product_sort_container']"))
	WebElement  filter;
	
	@FindBy(xpath = ("//div [@class = 'inventory_item_name']"))
	List <WebElement> products;
	
	@FindBy (xpath = ("//button [@id = 'react-burger-menu-btn']"))
	private WebElement settingBtn;
	
	@FindBy (xpath = ("//a [@id = 'logout_sidebar_link']"))
	WebElement logoutBtn;
	
	
	public void allProductClick()
	{
		for(WebElement z : allAddToCarts)
		{
			act.click(z).perform();
		}
	}
	
	public void moveToCartPreview()
	{
		act.moveToElement(cartPreview).perform();;
	}
	
	public String getCartPreview()
	{
		String noOfProductsInCart = cartPreview.getText();
		return noOfProductsInCart;
	}
	
	public void addToCart()
	{
		allAddToCarts.get(0).click();
	}
	
	public void clickOnCart()
	{
		cartPreview.click();
	}
	
	public void clickOnFilter()
	{
		filter.click();
	}
	
	public void selectAt2(WebDriver driver)
	{
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	}
	
	public String getFilterText()
	{
		String s = filter.getText();
		return s;
	}
	
	public void clickOnProduct(int i)
	{
		products.get(i).click();
	}
	
	public String getTextOfProduct(int i)
	{
		String s = products.get(i).getText();
		return s;
	}
	
	public void clickSettingBtn()
	{
		settingBtn.click();
	}
	
	public void clickLogoutBtn()
	{
		logoutBtn.click();
	}
}
