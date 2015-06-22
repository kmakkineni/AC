package TestCases;
/*
 * TestCases Realted to Feature "See a Product on Quick Look Overlay" Written End to End.
 * Written in Java Executed Using testNG
 */
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ShopPage;

/*
 * Test Scenario
 * 1.Go to HomePage
 * 2.Enter "Fry Pan" on Search Box
 * 3.Click on Search Button for Products to Display
 * 4.Store the Text of Product Selected
 * 5.Store the Price of Product Selected
 * 6.Compare the Text of Product to Expected Product, Matches click on Quicklook of the Product
 * 7.Store the text of Product on Overlay
 * 8.Store the Price of Product on Overlay
 * 9.Comparing the Values of Text's & Prices of the ShopPage & Product Overlay Page Using Assertions.
 */

public class QuickLookOverlay {

	@Test
	public void homePage()
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://secure.williams-sonoma.com/");
		
		ShopPage object=new ShopPage(driver);
		
		object.SEARCH().sendKeys("fry pan");	//Enter "Fry Pan" on Search Box
		
		object.SEARCH_BUTTON().click();			//Click on Search Button
		
		String quicklook_text=object.Select_Product2().getText();	//Store Text of Product Selected
		
		String quicklook_price=object.Select_Product2_Price().getText(); 	//Store Price of Product
		
		if(quicklook_text.equals("Calphalon Elite Nonstick Fry Pan Set"))	//if Text equals Expected Text Enter Loop(Bcoz all products has same Quicklook id)
		{
			object.Quicklook().isEnabled(); //Quick Look Button is Enabled on ShopPage
		
			object.Quicklook().click(); //Click on Quickloop for Product Overlay to PopUp
			
		}	
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		
		object.Quicklook_Overlay().isDisplayed();   // Product Overlay is Displayed 
		
		String quickoverlay_text = object.Select_Product2overlay_text().getText();	//Store the text of Product on Overlay
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		String quickoverlay_price = object.Select_Product2overlay_price().getText();	//Store the Price of Product on Overlay
		
		driver.close();
		
		Assert.assertEquals(quickoverlay_text,quicklook_text);		// Returns true When ShopPage Text of Product matches with Product Overlay Page Text
		
		Assert.assertEquals(quickoverlay_price,quicklook_price);	// Returns true When ShopPage Price of Product matches with Product Overlay Page Price
		
		
	}
}