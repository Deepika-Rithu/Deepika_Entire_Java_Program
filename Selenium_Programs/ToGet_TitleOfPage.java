package Selenium_Basic_Programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGet_TitleOfPage
{
	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	String title=driver.getTitle();
	System.out.println("Title of page: "+title);
	
	}

}
