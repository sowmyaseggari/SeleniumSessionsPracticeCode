package Seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class jQueryMultiSelectionDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox1")).click();
		List<WebElement>multiselect=driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
		
		System.out.println(multiselect.size());
		for(int i=0;i<multiselect.size();i++) {
			String text=multiselect.get(i).getText();
			System.out.println(text);
			if(text.equals("choice 2")) {
				multiselect.get(i).click();
				break;
				
			}
		}
	}

}
