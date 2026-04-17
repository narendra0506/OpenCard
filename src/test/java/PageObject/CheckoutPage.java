package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement txtzipcode;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement btncontinue;
	
	public ProductPage fillalldeatiles(String FN,String LN,String Zip)
	{
		txtFirstName.sendKeys(FN);
		txtLastName.sendKeys(LN);
		txtzipcode.sendKeys(Zip);
		btncontinue.click();
		return new ProductPage(driver);
	}

	
	
}
