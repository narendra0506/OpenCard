package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
	
	public ProductPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement addtocard;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement addtocardlink;
	
	
	public void clickaddtocard()
	{
		addtocard.click();
		addtocardlink.click();
	}
//	public void k()
//	{
//		System.out.println("k   print 888 ***");
//		addtocardlink.click();
//	}
	

}
