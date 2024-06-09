package Selenium_Basic_Programs;
//search India in Google using tagname and class name
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Syntax4 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.cssSelector("textarea.gLFyf"));
		search.sendKeys("India");

	}

}
