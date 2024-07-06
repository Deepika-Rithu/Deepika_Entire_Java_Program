package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCase1_Amazon_Login_ImplicitWait
{
@Test
public static void login_to_amazon()
{
	//ChromeOptions c1=new ChromeOptions();
	//c1.addArguments("--headless");
	//ChromeDriver driver=new ChromeDriver(c1);
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fk%3D%25QUERY_KEYWORD%25%26tag%3Dadmpdesktopin-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
	WebElement username=driver.findElement(By.id("ap_email"));
	username.sendKeys("deepik27@gmail.com");
	WebElement un_continue=driver.findElement(By.id("continue"));
	un_continue.click();
	WebElement password=driver.findElement(By.name("password"));
	password.sendKeys("ygfe7*6jhjk");
	WebElement signin_button=driver.findElement(By.id("signInSubmit"));
	signin_button.click();
}
}
