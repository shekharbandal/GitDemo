package Pageobject.POOrangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OrangeHRMreporitorys {

	WebDriver driver;
	 By username = By.xpath("//input[@name = 'txtUsername']");
	By password = By.cssSelector("input[id = 'txtPassword']");
	By Login = By.name("Submit");
	
	public OrangeHRMreporitorys(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement username() {
		return driver.findElement(username);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement submit() {
		
		return driver.findElement(Login);
	}
}
