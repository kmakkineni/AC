package PageObjects;
/*
 * This is a ProductsPage In which Methods are Defined Related to Products Page 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends ShopPage {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}
	By SELECT_SIZE=By.partialLinkText("10");
	By ADD_TO_CART=By.xpath("//button[@class='btn btn_addtobasket btn_addtobasket_add']");
	By CHECKOUT=By.xpath("//a[@id='anchor-btn-checkout']");
	By ADD_TO_CART_OVERLAY=By.xpath("//div[@id='racOverlay']");
	public WebElement SELECT_SIZE() 				//Method for Selecting Size of Product
	{
		return driver.findElement(SELECT_SIZE);
		
	}
	public WebElement ADD_TO_CART()					//Method for Adding Product to Cart
	{
		return driver.findElement(ADD_TO_CART);
		
	}
	public WebElement CHECKOUT()					//Method for Checking Out of Product
	{
		return driver.findElement(CHECKOUT);
		
	}
	public WebElement ADD_TO_CART_OVERLAY()			//Method for ADD_TO_CART_OVERLAY
	{
		return driver.findElement(ADD_TO_CART_OVERLAY);
		
	}
	

}
