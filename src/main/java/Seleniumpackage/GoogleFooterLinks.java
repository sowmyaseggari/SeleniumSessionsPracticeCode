package Seleniumpackage;

//import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFooterLinks {
    static WebDriver driver;
	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/webhp");
	By footerlinks=By.xpath("//div[@id='fbar']//span/a[@class='Fx4vi']");
	List<WebElement>links=VisibiblityOfAllElements(footerlinks,10);
	System.out.println(links.size());
	links.stream().forEach(ele->System.out.println(ele.getText()));
	
	//List<String>getLinktext=footerLinksText(footerlinks);
	//System.out.println(getLinktext);
	}
//	public static List<String> footerLinksText(By locator) {
//		List<String> textlink=new ArrayList<String>();
//		List<WebElement>footerlinks=driver.findElements(locator);
//		System.out.println(footerlinks.size());
//		for(WebElement e:footerlinks)
//		{
//			System.out.println(e.getText());
//			textlink.add(e.getText());
//		}
//		return textlink;
//	}
	public static List<WebElement> VisibiblityOfAllElements(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	public int getPageElemntCount(By locator,int timeout) {
		return VisibiblityOfAllElements(locator,timeout).size();
	}
}













