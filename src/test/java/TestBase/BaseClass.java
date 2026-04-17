package TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(8000);
		driver.quit();
	}


}
