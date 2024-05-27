package Selenium_Basic_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLogin_RelativeXPathSyntax 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D150668181581%26hvpone%3D%26hvptwo%3D%26hvadid%3D674842289449%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D10502065180465448621%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007812%26hvtargid%3Dkwd-10544572015%26hydadcr%3D5621_2359492%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("deepik27@gmail.com");
		WebElement continue_button=driver.findElement(By.xpath("//input[@id='continue']"));
		continue_button.click();
		WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("abc@12345");
		WebElement signin_button=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin_button.click();
	}

}
