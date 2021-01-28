package Seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kayakFlights {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.kayak.com/horizon/sem/flights/general?lang=en&skipapp=true&gclid=CjwKCAiAiML-BRAAEiwAuWVggmH55SBT4qleO5uWE4WKBLHGsCieEH3riOMsfmmBa9KlrTn9jYeWRhoCRxsQAvD_BwE&g_kw=kayak+flights&aid=103175290056");
		Thread.sleep(3000);
		List<WebElement>abc=driver.findElements(By.xpath("//div[contains(@id,'-origin-airport')]"));
		int s=abc.size();
		System.out.println(s);
	    abc.get(1).click();
	    
		
		
		
		//By xyz=By.xpath("//div[contains(text(),'Grand Rapids (GRR)')]");
		//driver.findElements(xyz).
		//driver.findElement(xyz).sendKeys("Grand Rapids (GRR)");
		
		 //driver.findElement(By.xpath("//*[contains(text(),'Grand Rapids (GRR)')]")).click();
		 //driver.findElement(By.xpath("//*[contains(text(),'To?')]")).click();
		
		
      
	}

}
