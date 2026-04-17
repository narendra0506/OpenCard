package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath ="//input[@id='user-name']")
	WebElement username;
	
	@FindBy(xpath ="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath ="//input[@id='login-button']")
	WebElement btnlogin;
	
	public ProductPage loginvalid(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		btnlogin.click();
		return new ProductPage(driver);
	}
	
	
	
//	public void clicklogin()
//	{
//		btnlogin.click();;
//	}
	
	
}
