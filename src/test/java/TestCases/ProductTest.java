package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.CheckoutPage;
import PageObject.LoginPage;
import PageObject.ProductPage;
import PageObject.addtocard;
import PageObject.checkoutoverview;
import TestBase.BaseClass;

public class ProductTest extends BaseClass {
	
	
	
	
	@Test(priority = 2)
	public void testlogin() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		ProductPage add=lp.loginvalid("standard_user", "secret_sauce");
		add.clickaddtocard();
		Thread.sleep(3000);
		ProductPage data=new ProductPage(driver);
		Thread.sleep(3000);
		addtocard card=new addtocard(driver);
		Thread.sleep(2000);
		System.out.println("card data");
		card.checkout();
		CheckoutPage alldetaile=new CheckoutPage(driver);
		ProductPage alldetales=alldetaile.fillalldeatiles("narendra", "nayak", "394221");
		Thread.sleep(2000);
		checkoutoverview finishall=new checkoutoverview(driver);
		finishall.clickfinish();
		
		
		
		
	}
	
	

}
