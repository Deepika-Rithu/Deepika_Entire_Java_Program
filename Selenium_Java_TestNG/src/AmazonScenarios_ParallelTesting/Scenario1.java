package AmazonScenarios_ParallelTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scenario1 extends Launch_Quit
{
	@Test
	public void Testcase1()
	{
		//Search shoe and click on first shoe
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		WebElement firstshoe_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstshoe_select.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*	@Test
	public void Testcase2()
	{
		//Search mobile and click on first mobile
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		search.sendKeys(Keys.ENTER);
		WebElement firstmobile_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		firstmobile_select.click();
	}
	@Test
	public void Testcase3()
	{
		//Search mouse, sort get it in 2 days and click on first product
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mouse");
		search.sendKeys(Keys.ENTER);
		WebElement getin2days=driver.findElement(By.xpath("//li[@id='p_90/20912642031']"));
		getin2days.click();
		WebElement firstmouse_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
		firstmouse_select.click();
	}
	@Test
	public void Testcase4()
	{
		//Search mobile cover, Include Out of Stock checkbox
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile cover");
		search.sendKeys(Keys.ENTER);
		WebElement IncludeOutOfStock_checkbox=driver.findElement(By.linkText("Include Out of Stock"));
		IncludeOutOfStock_checkbox.click();
	}
	@Test
	public void Testcase5()
	{
		//Search camera, Click on 35th camera
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("camera");
		search.sendKeys(Keys.ENTER);
		WebElement camera_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[33]"));
		camera_select.click();
	}
	@Test
	public void Testcase6()
	{
		//click on Electronics major tab, select brand as Redmi
		WebElement Electronics=driver.findElement(By.linkText("Electronics"));
		Electronics.click();
		WebElement Redmi_checkbox=driver.findElement(By.linkText("Redmi"));
		Redmi_checkbox.click();
	}
	@Test
	public void Testcase7()
	{
		//dropdown->amazon fresh->search for mango, click on first product
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dropdown);
		s1.selectByValue("search-alias=nowstore"); 
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(Keys.ENTER);
		WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("mango");
		search1.sendKeys(Keys.ENTER);
		WebElement mango_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		mango_select.click();
	}
	@Test
	public void Testcase8()
	{
		//dropdown->books->search for power of mind, click on first product
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dropdown);
		s1.selectByValue("search-alias=stripbooks"); 
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(Keys.ENTER);
		WebElement search1=driver.findElement(By.id("twotabsearchtextbox"));
		search1.sendKeys("power of mind");
		search1.sendKeys(Keys.ENTER);
		WebElement book_select=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		book_select.click();
	}
	@Test
	public void Testcase9()
	{
		//click on todays deals->deals of the day->click on the 1st product
		WebElement TodaysDeals=driver.findElement(By.linkText("Today's Deals"));
		TodaysDeals.click();
		WebElement Dealoftheday=driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[1]"));
		Dealoftheday.click();
		WebElement firstproduct=driver.findElement(By.xpath("(//div[@class='ProductCard-module__card_uyr_Jh7WpSkPx4iEpn4w'])[1]"));
		firstproduct.click();
	}
	@Test
	public void Testcase10()
	{
		//search shoe->go back go home page
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		driver.navigate().back();
	} */
}
