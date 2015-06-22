package PageObjects;
/*
 * This is a ShopPage In which Methods are Defined Related to Shopping Page 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage extends HomePage{

	public ShopPage(WebDriver driver)
	{
		super(driver);
    }
	By Shop_Product=By.linkText("New Arrivals");
	By Select_Product1=By.linkText("Finex Cast-Iron Fry Pan with Lid");
	By Select_Product2=By.linkText("Calphalon Elite Nonstick Fry Pan Set");
	By Select_Product2_Price=By.xpath("//span[@class='price-state price-special']");
	By Quicklook=By.xpath("//span[@class='quicklook-link']");
	By Select_Product2overlay_text=By.xpath("//h1[@itemprop='name']");
	By Select_Product2overlay_price=By.xpath(".//*[@id='itemselection']/div/section/section/div/div/div/div[2]/span/span[2]");
	By Quicklook_Overlay=By.xpath(".//*[@id='quicklookOverlay']");
	public WebElement Shop_Product()
	{
		return driver.findElement(Shop_Product);		//Method of Shop_Product for NewArrivals
		
	}
	public WebElement Select_Product1()					//Method of Select_Product1 for Finding Product to add to cart
	{
		return driver.findElement(Select_Product1);
		
	}
	public WebElement Select_Product2()					//Method of Select_Product2 for getting Text of ProductName
	{
		return driver.findElement(Select_Product2);
		
	}
	public WebElement Select_Product2_Price()			//Method of Select_Product2_price for getting price of Product
	{
		return driver.findElement(Select_Product2_Price);
		
	}
	public WebElement Quicklook()						//Method of Quicklook
	{
		return driver.findElement(Quicklook);
		
	}
	public WebElement Select_Product2overlay_text()		//Method of Select_Product2overlay_text for getting Text of ProductName
	{
		return driver.findElement(Select_Product2overlay_text);
		
	}
	public WebElement Select_Product2overlay_price()		//Method of Select_Product2overlay_price for getting price of Product
	{
		return driver.findElement(Select_Product2overlay_price);
		
	}
	public WebElement Quicklook_Overlay()				//Method of Quicklook_Overlay
	{
		return driver.findElement(Quicklook_Overlay);
		
	}
	
}
