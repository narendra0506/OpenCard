package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath ="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath ="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath ="//input[@id='login-button']")
	WebElement btnlogin;
	
	public void login()
	{
		username.sendKeys("");
	}
	
	
	

}
