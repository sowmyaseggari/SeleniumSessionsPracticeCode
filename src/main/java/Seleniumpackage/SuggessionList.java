package Seleniumpackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggessionList {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("http://automationpractice.com/");
		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,10);
		
		By search=By.id("search_query_top");
		By suggession=By.xpath("//div[@class='ac_results']/ul//li");
		driver.findElement(search).sendKeys("dresses");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(search)).click();
		List<WebElement>list=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(suggession));
		System.out.println(list.size());
		list.stream().forEach(ele->System.out.println(ele.getText()));
		
		
		//Thread.sleep(3000);
		//List<WebElement> resultlist=driver.findElements(suggession);
		//System.out.println(resultlist.size());
		//for(WebElement e:resultlist) {
		//String s=e.getText();
		//System.out.println(s);
			
		}
	
		}
	/**public static void SelectFromSuggessionList(By suggession,String value) 
	{
		List<WebElement> resultlist=driver.findElements(suggession);
		System.out.println(resultlist.size());
		for(WebElement e:resultlist) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(value)) 
			{
				e.click();
				break;
			}
			
		}
		
	}**/
		

	//}





