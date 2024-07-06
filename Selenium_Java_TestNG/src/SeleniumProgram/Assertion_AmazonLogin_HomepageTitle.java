package SeleniumProgram;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_AmazonLogin_HomepageTitle
{
	@Test
	public void Amazon() throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement Account_List=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Account_List).perform();
		//WebElement signin_button=driver.findElement(By.xpath("//span[@class='nav-action-inner'][1]"));
		WebElement signin_button=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));  //xpath using text message
		signin_button.click();
		
		FileInputStream f1=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Basic\\TestData\\Deepika.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String value1=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		
		WebElement username=driver.findElement(By.id("ap_email"));
		username.sendKeys(value1);
		
		WebElement un_continue=driver.findElement(By.id("continue"));
		un_continue.click();
		
		String value2=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(value2);
		
		WebElement signin_submit=driver.findElement(By.id("signInSubmit"));
		signin_submit.click();
		
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Login did not happen");
	}

}
