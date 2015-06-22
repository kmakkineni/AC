package PageObjects;
/*
 * This is a ShoppingCartPage In which Methods are Defined Related to ShoppingCart Page 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends ProductsPage{

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		
	}
	By Text=By.xpath(".//*[@id='cartForm']/div[1]/h1");
	public WebElement Text()			//Method for getting Text of Page
	{
		return driver.findElement(Text);
	}
	

}
