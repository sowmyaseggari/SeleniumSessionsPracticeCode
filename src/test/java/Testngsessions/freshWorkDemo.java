package Testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Seleniumpackage.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class freshWorkDemo extends ElementUtil{
	
	
	private freshWorkDemo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	static WebDriver driver;
	ElementUtil ele=new ElementUtil(driver);
	//ele=null;
	
	@BeforeClass
	public void launchURL() {
		driver.get("https://www.freshworks.com/");
	}
	//static WebDriver driver;
	@BeforeMethod
	public void setUp() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://www.freshworks.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		//ElementUtil ele=new ElementUtil(driver);
		
		}
	@Test(priority=1,dependsOnMethods="ElementUtil")
	private void freshWorkTitleTest() 
	{ 
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "A fresh approach to customer engagement");
	}
	@Test(priority=2,dependsOnMethods="ElementUtil")
	private void freshWorkLogoTest() {
		//ElementUtil ele=new ElementUtil(driver);
		By name=By.tagName("a");
		WebElement a=ele.getElement(name);
		Assert.assertEquals(true, a.isDisplayed());
				
	}

}
