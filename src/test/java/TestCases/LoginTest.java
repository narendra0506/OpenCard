package TestCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.ProductPage;
import TestBase.BaseClass;

public class LoginTest extends BaseClass{

	
	@Test(priority = 1)
	public void testlogin()
	{
		
		LoginPage lp=new LoginPage(driver);
		ProductPage add=lp.loginvalid("standard_user", "secret_sauce");
		
		//add.clicklogin();
	}
	
	
}
