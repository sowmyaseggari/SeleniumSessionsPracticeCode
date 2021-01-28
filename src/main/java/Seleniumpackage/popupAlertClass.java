package Seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class popupAlertClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(1000);
		Alert art=driver.switchTo().alert();
		System.out.println(art.getText());
		art.accept();
		WebElement result=driver.findElement(By.id("result"));
		String res=result.getText();
		System.out.println("Result:" +  res);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(1000);
		Alert art1=driver.switchTo().alert();
		System.out.println(art1.getText());
		art1.dismiss();
		WebElement result1=driver.findElement(By.id("result"));
		String res1=result1.getText();
		System.out.println(res1);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Thread.sleep(1000);
		Alert art2=driver.switchTo().alert();
		System.out.println(art2.getText());
		art2.sendKeys("sowmyaseggari");
		art2.accept();
		WebElement result2=driver.findElement(By.id("result"));
		String res2=result2.getText();
		System.out.println(res2);
		
		

	}

}
//driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

