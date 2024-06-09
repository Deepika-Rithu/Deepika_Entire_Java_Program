package Selenium_Basic_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_AmazonLogin 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?ie=UTF8&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fk%3D%25QUERY_KEYWORD%25%26tag%3Dadmpdesktopin-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&switch_account=signin&ignoreAuthState=1&disableLoginPrepopulate=1&ref_=ap_sw_aa");
		
		
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
		
		WebElement signin_button=driver.findElement(By.id("signInSubmit"));
		signin_button.click();

	}

}
