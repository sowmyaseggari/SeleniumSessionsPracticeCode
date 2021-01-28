package Testngsessions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

//import Elementutiltest.Elementtest;
import Seleniumpackage.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class freshWorkElementUtil 
{
private WebDriver driver;
private ElementUtil ele;
	
public freshWorkElementUtil(WebDriver driver) {
		this.driver=driver;
		ele=new ElementUtil(this.driver);
	}
  private By textfield=By.xpath("//h2[text()='Refreshing business software that your teams will love']");
  private By resources=By.xpath("//span[text()='Resources']");
  private By footer=By.xpath("//div[@class='footer-main']//ul[@class='footer-nav']//li");
  private By product=By.xpath("//span[text()='Products']");
  private By button=By.xpath("//a[text()=' WOW! TELL ME MORE']");
  private By name=By.tagName("a");
  private By footerlinks=By.xpath("//div[@class='footer-copyrights']//div//a");
  private By link=By.cssSelector("span.forward--link.link.mt-xs");
  
   @BeforeMethod
//@BeforeMethod
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
	String title=ele.waitForPageTitle("A fresh approach to customer engagement", 5);
	AssertJUnit.assertEquals(title, "A fresh approach to customer engagement");
   }
   @Test(priority=2)
   public void freshWorkLogo() {
	WebElement a=ele.getElement(name);
	AssertJUnit.assertEquals(true, a.isDisplayed());	
   } 
   @Test(priority=3)
    public void freshWorkProduct() {
	WebElement b=ele.getElement(product);
	AssertJUnit.assertEquals(false, b.isSelected());
   }
   @Test(priority=8)
    public void freshWorkButton() {
	ele.doClick(button);
	AssertJUnit.assertTrue(true);
   }
    @Test(priority=4)
    public void freshworkText() {
	WebElement text=ele.getElement(textfield);
	String linktext = text.getText();
	String expected = "Refreshing";
	Assert.assertNotEquals(linktext, expected);
    }
    @Test(priority=5)
    public void freshWorkResources() {
	WebElement resourceclick=ele.getElement(resources);
	resourceclick.click();
	AssertJUnit.assertEquals(false, resourceclick.isSelected());
    }
    @Test(priority=6)
    public void freshWorkFooterlinks() {
	List<WebElement> footerlinks=ele.getElements(footer);
	int linksize=footerlinks.size();
	AssertJUnit.assertEquals(linksize, 26);
	}
   @Test(priority=7)
    public void freshWorkFooterTakeDownlinks() {
	List<WebElement> footerdownlinks=ele.getElements(footerlinks);
	int downlinks=footerdownlinks.size();
	AssertJUnit.assertEquals(downlinks, 8);
   }
    @Test(priority=9,expectedExceptions=StaleElementReferenceException.class)
    public void freshWorkcareerslink() {
	WebElement linkclickabe=ele.getElement(link);
	linkclickabe.click();
	AssertJUnit.assertEquals(true, linkclickabe.isSelected());
    }
   @AfterMethod
   public void teardown() {
	driver.quit();
    }

}
