package Maven_Amazon.Maven_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page
{
	WebDriver driver;
	
	@FindBy(id="ap_email")
	WebElement username;
	@FindBy(id="continue")
	WebElement continue_button;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	public void un()
	{
		username.sendKeys("deepik27@gmail.com");
	}
	public void continue_click()
	{
		continue_button.click();
	}
	public void pwd()
	{
		                                                                                                  password.sendKeys("Deepika@27");
	}
	public void signin_click()
	{
		signin_button.click();
	}

	public Amazon_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
