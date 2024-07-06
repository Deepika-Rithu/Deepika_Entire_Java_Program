package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch_ExplicitWait
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleIs("google"));
		//w1.until(ExpectedConditions.alertIsPresent());
		//w1.until(ExpectedConditions.titleContains("Goo"));
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
