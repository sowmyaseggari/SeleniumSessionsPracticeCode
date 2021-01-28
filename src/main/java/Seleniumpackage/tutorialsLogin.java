package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tutorialsLogin {

	public static void main(String[] args)
	{
		
     By firstname= By.id("input-firstname");
     By lasttname= By.id("input-lastname");
     By email= By.id("input-email");
     By telephone= By.id("input-telephone");
     By password= By.id("input-password");
     By confirm= By.id("input-confirm");
    By continuebutton= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
     DriverFactory df1=new DriverFactory ();
    WebDriver driver= df1.init_driver("chrome");
     df1.launchUrl("http://tutorialsninja.com/demo/index.php?route=account/register");
     String title1=df1.doGetPageTitle();
     System.out.println(title1);
     
     ElementUtil ele1=new ElementUtil(driver);
     ele1.doSendKeys(firstname, "sowmya");
     ele1.doSendKeys(lasttname, "seggari");
     ele1.doSendKeys(email, "sowmyaseggari@gmail.com");
     ele1.doSendKeys(telephone, "12346578");
     ele1.doSendKeys(password, "sowmya123");
     ele1.doSendKeys(confirm, "sowmya123");
     ele1.doClick(continuebutton);
     

     
     
     
	}

}
