package PageObjects;

/*
 * HomePage Written in Java Lang
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().window().maximize();
	}


	By FlyoutMenu_Home = By.className("topnav-cookware");
	By Shop_by_Category = By.linkText("Cookware Sets");
	By SEARCH = By.id("search-field");
	By SEARCH_BUTTON = By.id("btnSearch");
	
	public WebElement FlyoutMenu_Home()				//Method of FlyoutMenu
	{
		return driver.findElement(FlyoutMenu_Home);
	}
	public WebElement Shop_by_Category()			//Method of Shop_by_Category
	{
		return driver.findElement(Shop_by_Category);
	}
	public WebElement SEARCH()						//Method of SEARCH
	{
		return driver.findElement(SEARCH);
	}
	public WebElement SEARCH_BUTTON()				//Method of SEARCH_BUTTON
	{
		return driver.findElement(SEARCH_BUTTON);

	}
}