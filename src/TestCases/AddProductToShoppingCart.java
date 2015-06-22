package TestCases;

/*
 * TestCases Realted to Feature "Add a product to cart" Written End to End.
 * Written in Java Executed Using testNG
 */

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/*Test Scenario
 * 1.Go to Homepage select Cookware Menu
 * 2.select Cookware Sets from SubCategory menu 
 * 3.go to newarrivals of ShopPage
 * 4.Select a Product on ShopPage
 * 5.go to Products page of the Selected Product
 * 6.Select the size of Product
 * 7.Add to Cart
 * 8.Checkout
 * 9.Diverted to ShoppingCart Page & Close.
 * 
 */
import PageObjects.ShoppingCartPage;

public class AddProductToShoppingCart {
	
	@Test
	public void homePage()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://secure.williams-sonoma.com/");	//URL of the WebSite
		
		ShoppingCartPage object = new ShoppingCartPage(driver);
		
		object.FlyoutMenu_Home().click();			// Clicks at FlyoutMenu on HomePage @Cookware
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		object.Shop_by_Category().click();			// Clicks at SubCategory of Cookware Menu @Cookware Sets on HomePage
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		object.Shop_Product().click();				//Clicks on NewArrivals @ShopPage for Products
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		object.Select_Product1().click();    		//Clicks on ShopPage on NewArrivals Page for Product "Finex Cast-Iron Fry Pan with Lid"
		
		object.SELECT_SIZE().click();				//Selects size of Product on ProductsPage
		
		object.ADD_TO_CART().isEnabled();			//Shows ADD TO CARD Button is Enabled->true
		
		object.ADD_TO_CART().click();				//Adds Selected Product to Cart on ProductsPage 
		
		object.ADD_TO_CART_OVERLAY().isDisplayed();	//When Clicked on "ADD TO CART" button add to cart Overlay Appears
		
		object.CHECKOUT().isEnabled();				//Shows CHECKOUT Button is Enabled on add to cart Overlay->true
		
		object.CHECKOUT().click();					//Clicks on Checkout button of add to cart overlay & diverted to ShoppingCart Page
		
		String Page=object.Text().getText();		//Store The Text of ShoppingCart Page
		
		Assert.assertEquals("Shopping Cart", Page);	//Assures Product added to shart is on Shopping Cart Page->True
		
		driver.close();								//Browser Closed.
	}

}
