package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pageobject.POOrangehrm.OrangeHRMDirectory;
import Pageobject.POOrangehrm.OrangeHRMreporitorys;
import Pageobject.POOrangehrm.OrangeHrmRecruitment;
import Pageobject.POOrangehrm.Recruitment_Reistration;

public class LoginOrangeHRM {

	  @Test(enabled = false)
	  public void login_orngehrm() {
		  //			System.setProperty("webdriver.chrome.driver","C:\\Users\\Shekhar Bandal\\Downloads\\chromedriver_win32\\chromedriver.exe");

		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shekhar Bandal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  OrangeHRMreporitorys or = new OrangeHRMreporitorys(driver);
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  or.username().sendKeys("Admin");
		  or.password().sendKeys("admin123");
		  or.submit().click();
		  OrangeHRMDirectory dir = new OrangeHRMDirectory(driver);
		  dir.Directory().click();
		  dir.name().sendKeys("Linda Anderson");
		  dir.searchBtn().click();
		  driver.close();
	  }
	
	  @Test(enabled = false)
	  public void HRM_Recruitment() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shekhar Bandal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver  = new ChromeDriver();
		  OrangeHRMreporitorys or = new OrangeHRMreporitorys(driver);
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  or.username().sendKeys("Admin");
		  or.password().sendKeys("admin123");
		  or.submit().click();
		WebElement Recruitment =   driver.findElement(By.linkText("Recruitment"));
		Recruitment.click();
		OrangeHrmRecruitment rec = new OrangeHrmRecruitment(driver);
		rec.Jobtitle_dropdwn();
		rec.candidate_status_dropdown();
		String name = "shekhar";
		OrangeHrmRecruitment rec1 = new OrangeHrmRecruitment(driver);
		rec1.can_name_text("shekhar B");
		driver.manage().window().maximize();
		rec1.keyword_search_textbox("Manual Testing");
		rec1.from_date_picker();
		rec1.to_date_picker();
		rec1.method_of_application();
		rec1.add_btn().click();
		//driver.quit();
	  }
	  
	  @Test 
	  public void HRM_add_recruitment() throws InterruptedException {
		  
		 // System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Shekhar Bandal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shekhar Bandal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  OrangeHRMreporitorys or = new OrangeHRMreporitorys(driver);
		  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  or.username().sendKeys("Admin");
		  or.password().sendKeys("admin123");
		  or.submit().click();
		  WebElement recruit = driver.findElement(By.linkText("Recruitment"));
		  recruit.click();
		  OrangeHrmRecruitment recruitment = new OrangeHrmRecruitment(driver);
		  recruitment.add_btn().click();
		  Thread.sleep(5000);
		  Recruitment_Reistration reg = new Recruitment_Reistration(driver);
		  String fname = "shekhar";
	      reg.first_name(fname);
	      reg.middle_name("popat");
		  reg.last_name("Bandal");
		 reg.email("Shekhar.bandal19@gmail.com");
		  reg.contact_number("8805065349");
		  //  reg.add_resume();
		  driver.manage().window().maximize();
		  reg.consent_checkbox().click();
		 
		  
		  
		  //1----------------- -----------------------
		  String one = "Manual";
		  String two = "Automation_testing";
		  reg.add_keywords(one,two);
		  reg.add_comment("This is very important comment");
		  Thread.sleep(4000);
		  reg.date_of_application();
		  reg.SaveBtn().click();
		WebElement error_msg =   driver.findElement(By.xpath("//div[@class='message error']"));
		String expected = error_msg.getText();
		String actual = "An internal error occurred. Please contact your system administrator.";
		Assert.assertEquals(actual, expected);
		
		
	  }
	//This is very important comment.Which will describe about how comment is important.Unless this comment is fulfilled that will not make any sense "
		//+ "to go further with any other comments  
}
