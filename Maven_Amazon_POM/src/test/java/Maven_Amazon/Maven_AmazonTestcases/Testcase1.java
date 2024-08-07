package Maven_Amazon.Maven_AmazonTestcases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Listeners_ForScreenshot.Listeners_Screenshot;
import Maven_Amazon.Maven_Amazon.Amazon_Home_Page;
import Maven_Amazon.Maven_Amazon.Amazon_Login_Page;
@Listeners(Listeners_Screenshot.class) 
public class Testcase1 extends Listeners_Screenshot
{
	@Test
	public static void Login_to_Search()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Amazon_Login_Page a1=new Amazon_Login_Page(driver);
		a1.un();
		a1.continue_click();
		a1.pwd();
		a1.signin_click();
		//Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Login did not happen");
		Amazon_Home_Page a2=new Amazon_Home_Page(driver);
		a2.search();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : shoe","Search did not happen");
	}

}
