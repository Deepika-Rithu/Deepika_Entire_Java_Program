package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_AmazonLogin_5setofdata 
{
	@DataProvider(name="Login_Details")
	public Object[][] method1()
	{
		Object d1[][]=new Object[5][2];
		d1[0][0]="deepik27@gmail.com";
		d1[0][1]="Deepik@2778";
		d1[1][0]="rithanyaa27@gmail.com";
		d1[1][1]="Rithanyaa@27";
		d1[2][0]="9994828885";
		d1[2][1]="Vignesh@27";
		d1[3][0]="Lakshmi27@gmail.com";
		d1[3][1]="Lakshmi@27";
		d1[4][0]="jeena27@gmail.com";
		d1[4][1]="Jeena@27";
		return d1;
	}

@Test(dataProvider="Login_Details")
public void Launch(String un, String pwd)
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fk%3D%25QUERY_KEYWORD%25%26tag%3Dadmpdesktopin-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
	WebElement username=driver.findElement(By.id("ap_email"));
	username.sendKeys(un);
	WebElement un_continue=driver.findElement(By.id("continue"));
	un_continue.click();
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys(pwd);
	WebElement signin_button=driver.findElement(By.id("signInSubmit"));
	signin_button.click();
}

}