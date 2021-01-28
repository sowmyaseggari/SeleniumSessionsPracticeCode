package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args)
	
	{	
		By domain=By.id("Form_submitForm_subdomain");
		By firstname=By.id("Form_submitForm_FirstName");
		By lastname=By.id("Form_submitForm_LastName");
		By email=By.id("Form_submitForm_Email");
		By job=By.id("Form_submitForm_JobTitle");
		By noofemp=By.id("Form_submitForm_NoOfEmployees");
		By compname=By.id("Form_submitForm_CompanyName");
		By industry=By.id("Form_submitForm_Industry");
		By phonenumb=By.id("Form_submitForm_Contact");
		By country=By.id("Form_submitForm_Country");
        By sudmitbutton=By.id("Form_submitForm_action_request");
        
		DriverFactory df=new DriverFactory();
		WebDriver driver=df.init_driver("chrome");
		df.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String title=df.doGetPageTitle();
		System.out.println(title);
		ElementUtil ele_util=new ElementUtil(driver);
		ele_util.doSendKeys(domain, "sowmyaseggari.com");
		ele_util.doSendKeys(firstname, "sowmya");
		ele_util.doSendKeys(lastname, "seggari");
		ele_util.doSendKeys(email, "sowmyaseggari@gmail.com");
		ele_util.doSendKeys(job, "QA");
		ele_util.doSendKeys(noofemp, "2");
		ele_util.doSendKeys(compname, "google");
		ele_util.doSendKeys(phonenumb, "1234567891");
		ele_util.doSelectDropDownByValue(country, "Algeria");
		ele_util.doSelectDropDownByValue(industry, "Automotive");
		ele_util.doClick(sudmitbutton);
		
		
	}

}


