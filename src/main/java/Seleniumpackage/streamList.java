package Seleniumpackage;


import java.util.List;

import java.util.stream.Collectors;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;
 
public class streamList {
     static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		

		driver.get("https://www.asos.com/us/bag?ctaref=mini%20bag");
		List<WebElement>list=driver.findElements(By.tagName("a"));
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//Alert a=wait.until(ExpectedConditions.alertIsPresent());
		
		List<String>shopingList=list.stream()
		.filter(ele->!ele.getText().isEmpty())
		.filter(ele->ele.getText().contains("ASOS"))
		.map(ele->ele.getText().trim())
		.collect(Collectors.toList());
		shopingList.stream().forEach(ele->System.out.println(ele));		
	}
	/*
	 * public static void StreamList(String value,WebElement list,String list2) {
	 * 
	 * List<String>list21=list.stream() .filter(ele->!ele.getText().isEmpty())
	 * .filter(ele->ele.getText().contains(value)) .map(ele->ele.getText().trim())
	 * .collect(Collectors.toList());
	 * list21.stream().forEach(ele->System.out.println(ele)); }
	 */
}











