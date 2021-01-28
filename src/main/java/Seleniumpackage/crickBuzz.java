package Seleniumpackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crickBuzz {
	 static WebDriver driver;

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.espncricinfo.com/series/india-in-australia-2020-21-1223867/australia-a-vs-indians-tour-match-1237417/full-scorecard");
    //String crickrt=driver.findElement(By.xpath("//a[text()='Shubman Gill']//parent::td//following-sibling::td/span")).getText();
	//System.out.println(crickrt);
		
		//List<WebElement>scorecard=driver.findElements(By.xpath("//a[text()='Rishabh Pant']//parent::td//following-sibling::td"));
		//List<String>scorecardlist=new ArrayList<String>();
		//System.out.println(scorecard.size());
		//for(int i=1;i<scorecard.size();i++) {
		//String text=scorecard.get(i).getText();
			//System.out.println(text);
		//if(!text.isEmpty())
				//System.out.println(text);
			//scorecardlist.add(text);
			
	System.out.println(getScoreList("Rishabh Pant"));
			
		}
         
	
	public static WebElement getElement(By locator) 
	{
		return driver.findElement(locator);
	}
	public static String getWicketTakerName(String playername) 
	{
	return driver.findElement(By.xpath("//a[text()='"+playername+"']//parent::td//following-sibling::td/span")).getText();	
	}
	public static List<String> getScoreList(String playerName)
	{
		List<WebElement>scorecard=driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::td//following-sibling::td"));
		List<String>scorecardlist=new ArrayList<String>();
		System.out.println(scorecard.size());
		for(int i=1;i<scorecard.size();i++) {
		String text=scorecard.get(i).getText();
		if(!text.isEmpty())
		scorecardlist.add(text);
	}
		return scorecardlist;
		}
	}
	
	




