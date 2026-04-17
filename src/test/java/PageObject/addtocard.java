package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import TestBase.BaseClass;

public class addtocard extends BasePage {

	public addtocard(WebDriver driver) 
	{
		super(driver);
		
	}
	
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement btncheckout;
	
	public void checkout()
	{
		btncheckout.click();
	}
	
	
	

}
