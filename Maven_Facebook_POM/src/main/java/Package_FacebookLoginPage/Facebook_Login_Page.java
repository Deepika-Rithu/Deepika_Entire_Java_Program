package Package_FacebookLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page 
{
	WebDriver driver;
	//Step1: locating each element using FindBy Annotation
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement login_button;
	
	//Step2: Create a separate method for each component to perform its action
	public void un()
	{
		username.sendKeys("Deepika");
	}
	public void pwd()
	{
		password.sendKeys("Deepika@123");
	}
	public void login()
	{
		login_button.click();
	}
	
	//Step3: Initializing each element using PageFactory class inside the constructor
	public Facebook_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
