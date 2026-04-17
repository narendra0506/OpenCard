package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkoutoverview extends BasePage {

	public checkoutoverview(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//button[@id='finish']")
	WebElement btnfinish;
	
	public void clickfinish()
	{
		btnfinish.click();
	}
	
	

}
