package Pageobject.POOrangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMDirectory {

	 WebDriver driver;
	public OrangeHRMDirectory(WebDriver driver) {
		this.driver = driver;
	}
	
	By Directory = By.id("menu_directory_viewDirectory");
	
	By name =  By.id("searchDirectory_emp_name_empName");
	By Job_title_drpdwn = By.xpath("//select[@name = 'searchDirectory[job_title]']");
	By location = By.xpath("//select[@name = 'searchDirectory[location]']");
	By searchbtn = By.id("searchBtn");
	By resetBtn = By.name("_reset");
	
	
	public WebElement name() {
		return driver.findElement(name);
	}
	
	public WebElement jobtitle() {
		return driver.findElement(Job_title_drpdwn);
	}
	
	public WebElement location() {
		return driver.findElement(location);
	}
	
	public WebElement searchBtn() {
		return driver.findElement(searchbtn);
	}
	
	public WebElement ResetBtn() {
		return driver.findElement(resetBtn);
	}
	public WebElement Directory() {
		return driver.findElement(Directory);
	}
	
}
