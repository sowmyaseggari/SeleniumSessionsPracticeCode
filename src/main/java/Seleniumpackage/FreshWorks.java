package Seleniumpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorks {
	static WebDriver driver;

	public static void main(String[] args) 
	{
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("https://www.freshworks.com/blogs/");
		  By freshworks=By.xpath("//div[@class='footer-main']//ul[@class='footer-nav']//li");
	      List<String>getLinktext=footerLinksText(freshworks);
		  System.out.println(getLinktext);
	}
	    public static List<String> footerLinksText(By locator) {
		List<String> textlink=new ArrayList<String>();
		List<WebElement>freshworks=driver.findElements(locator);
		System.out.println(freshworks.size());
		for(WebElement e:freshworks)
		{
			System.out.println(e.getText());
			textlink.add(e.getText()); 
		}
		return textlink;
	}
}
/**test1:url
test2:title
test3://img[@class='logo logo-fworks ']---logo
test4:product
test5: WOW! TELL ME MORE
test6: READ MORE
test7:Resources
test8:footerlinks
test9:Explore careers
**/