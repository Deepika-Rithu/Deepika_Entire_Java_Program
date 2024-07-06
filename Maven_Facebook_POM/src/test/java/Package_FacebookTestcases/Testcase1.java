package Package_FacebookTestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Package_FacebookLoginPage.Facebook_Login_Page;

public class Testcase1

{
@Test
	public void login_to_facebook_using_valid_credentials()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Facebook_Login_Page fb=new Facebook_Login_Page(driver);
		fb.un();
		fb.pwd();
		fb.login();
	}

}
