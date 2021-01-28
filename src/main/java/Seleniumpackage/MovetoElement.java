package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		WebElement loginsigup=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		moveToElement(loginsigup);
		Thread.sleep(4000);
		WebElement members=driver.findElement(By.linkText("SpiceClub Members"));
		moveToElement(members);
		Thread.sleep(3000);
		WebElement signup=driver.findElement(By.linkText("Sign up"));
		moveToElement(signup);
		contextClick(signup);
		//ElementUtil ele_util1=new ElementUtil(driver);
		//ele_util1.doClick(signup);
		//driver.findElement(By.linkText("SpiceClub Members")).click();
		//Actions act=new Actions(driver);
		//act.moveToElement(loginsigup).perform();
		//Thread.sleep(4000);
		//WebElement members=driver.findElement(By.linkText("SpiceClub Members"));
		//act.moveToElement(members).perform();
		//Thread.sleep(3000);
		//WebElement signup=driver.findElement(By.linkText("Sign up"));
		//act.moveToElementclick(signup).click().build().perform();
	}
	public static void moveToElement(WebElement value1){
		Actions act=new Actions(driver);
		act.moveToElement(value1).perform();
	}
	public static void contextClick(WebElement value) {
		Actions act=new Actions(driver);
		act.click(value).perform();
	}
	
	
	
}

