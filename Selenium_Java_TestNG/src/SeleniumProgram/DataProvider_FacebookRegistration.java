package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_FacebookRegistration 
{
	@DataProvider(name="FB Registration")
	public Object[][] method1()
	{
		Object d1[][]=new Object[5][4];
		d1[0][0]="Deepika";
		d1[0][1]="S";
		d1[0][2]="7673447345";
		d1[0][3]="ghf6@hjg*(";
		d1[1][0]="Deepika";
		d1[1][1]="S";
		d1[1][2]="7673447390";
		d1[1][3]="ghf6@hjg*(";
		d1[2][0]="Deepika";
		d1[2][1]="S";
		d1[2][2]="7673447300";
		d1[2][3]="ghf6@hjg*(";
		d1[3][0]="Deepika";
		d1[3][1]="S";
		d1[3][2]="7673447334";
		d1[3][3]="ghf6@hjg*(";
		d1[4][0]="Deepika";
		d1[4][1]="S";
		d1[4][2]="7673447378";
		d1[4][3]="ghf6@hjg*(";
		return d1;
		
	}
	
	
@Test(dataProvider="FB Registration")
public void facebook_registration(String firstname, String surname, String mobno, String pwd)
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement new_account=driver.findElement(By.linkText("Create new account"));
	new_account.click();
	driver.findElement(By.name("firstname")).sendKeys(firstname);
	driver.findElement(By.name("lastname")).sendKeys(surname);
	driver.findElement(By.name("reg_email__")).sendKeys(mobno);
	driver.findElement(By.id("password_step_input")).sendKeys(pwd);
	WebElement day=driver.findElement(By.id("day"));
	Select s1=new Select(day);
	s1.selectByValue("22");
	WebElement month=driver.findElement(By.id("month"));
	Select s2=new Select(month);
	s2.selectByVisibleText("Aug");
	WebElement year=driver.findElement(By.id("year"));
	Select s3=new Select(year);
	s3.selectByIndex(24);
	WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
	gender.click();
	driver.findElement(By.name("websubmit")).click();
}
}
