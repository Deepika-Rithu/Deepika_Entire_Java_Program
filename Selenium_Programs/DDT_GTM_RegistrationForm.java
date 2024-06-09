package Selenium_Basic_Programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDT_GTM_RegistrationForm
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grotechminds.com/registeration-form/");
		
		WebElement Fname=driver.findElement(By.id("firstName"));
		FileInputStream f1=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Basic\\TestData\\Deepika.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String Fname_value=wb.getSheet("GTM_Registration").getRow(1).getCell(0).getStringCellValue();
		Fname.sendKeys(Fname_value);
		
		WebElement Lname=driver.findElement(By.id("lastName"));
		String Lname_value=wb.getSheet("GTM_Registration").getRow(1).getCell(1).getStringCellValue();
		Lname.sendKeys(Lname_value);
		
		WebElement email=driver.findElement(By.id("email"));
		String email_value=wb.getSheet("GTM_Registration").getRow(1).getCell(2).getStringCellValue();
		email.sendKeys(email_value);
		
		WebElement phone=driver.findElement(By.id("phone"));
		String phone_value=NumberToTextConverter.toText(wb.getSheet("GTM_Registration").getRow(1).getCell(3).getNumericCellValue());
		phone.sendKeys(phone_value);
		
		WebElement gender=driver.findElement(By.id("gender"));
		Select s1=new Select(gender);
		s1.selectByValue("female");

		WebElement state=driver.findElement(By.id("state"));
		Select s2=new Select(state);
		s2.selectByValue("tamilNadu");
		
		WebElement aadhaar=driver.findElement(By.id("aadhaar"));
		String aadhaar_value=NumberToTextConverter.toText(wb.getSheet("GTM_Registration").getRow(1).getCell(4).getNumericCellValue());
		aadhaar.sendKeys(aadhaar_value);
		
		WebElement pan=driver.findElement(By.id("pan"));
		String pan_value=wb.getSheet("GTM_Registration").getRow(1).getCell(5).getStringCellValue();
		pan.sendKeys(pan_value);
		
		WebElement terms=driver.findElement(By.id("terms"));
		terms.click();
		
		WebElement submit=driver.findElement(By.name("Submit"));
		submit.click();
	}

}
