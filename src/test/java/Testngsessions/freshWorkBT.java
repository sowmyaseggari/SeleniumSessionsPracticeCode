package Testngsessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class freshWorkBT    
{
	static WebDriver driver;
@BeforeTest
public void setUp() 
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.freshworks.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().fullscreen();	
	}
@Test(priority=1)
public void freshWorkTitle() 
{ 
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "A fresh approach to customer engagement");
}
@Test(priority=2)
public void freshWorkLogo() {
	Assert.assertTrue(driver.findElement(By.tagName("a")).isDisplayed());			
} 
@Test(priority=3)
public void freshWorkProduct() {
	WebElement product=driver.findElement(By.xpath("//span[text()='Products']"));
	product.click();
	Assert.assertEquals(false, product.isSelected());
}

@Test(priority=8,expectedExceptions=StaleElementReferenceException.class)
public void freshWorkButton() {
	WebElement button=driver.findElement(By.xpath("//a[text()=' WOW! TELL ME MORE']"));
	button.click();
	Assert.assertEquals(false, button.isSelected());
}
@Test(priority=4)
public void freshworkText() {
	WebElement text=driver.findElement(By.xpath("//h2[text()='Refreshing business software that your teams will love']"));
	String linktext = text.getText();
	String expected = "Refreshing";
	Assert.assertNotEquals(linktext, expected);
}
@Test(priority=5)
public void freshWorkResources() {
	WebElement resource=driver.findElement(By.xpath("//span[text()='Resources']"));
	resource.click();
	Assert.assertEquals(false, resource.isSelected());
}
@Test(priority=6)
public void freshWorkFooterlinks() {
	List<WebElement> footerlinks=driver.findElements(By.xpath("//div[@class='footer-main']//ul[@class='footer-nav']//li"));
	int linksize=footerlinks.size();
	Assert.assertEquals(linksize, 26);
	}
@Test(priority=7)
public void freshWorkFooterTakeDownlinks() {
	List<WebElement> footerdownlinks=driver.findElements(By.xpath("//div[@class='footer-copyrights']//div//a"));
	int downlinks=footerdownlinks.size();
	Assert.assertEquals(downlinks, 8);
	
}
@Test(priority=9,expectedExceptions=StaleElementReferenceException.class)
public void freshWorkcareerslink() {
	WebElement link=driver.findElement(By.cssSelector("span.forward--link.link.mt-xs"));
	link.click();
	Assert.assertEquals(true, link.isSelected());
}
@AfterTest
public void teardown() {
	driver.quit();
	
}
}
