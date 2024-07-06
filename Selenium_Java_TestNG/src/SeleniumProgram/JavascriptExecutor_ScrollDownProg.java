package SeleniumProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutor_ScrollDownProg
{
	@Test
	public void scrolldown() 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement aboutus_link=driver.findElement(By.linkText("About Us"));
		Point p1=aboutus_link.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor e1=driver;
		e1.executeScript("window.scrollBy(0,"+y+")");
	}
}
