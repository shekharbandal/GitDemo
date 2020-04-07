package Pageobject.POOrangehrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.collections.Lists;

public class Recruitment_Reistration {
	
	WebDriver driver;
	
	public Recruitment_Reistration(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath = "//div[@class='message error']")
	WebElement errormsg;
	
	@FindBy(xpath = "//input[@name = 'addCandidate[consentToKeepData]']")
	WebElement consent_checkbox;
	
	@FindBy(xpath = "//input[@id = 'addCandidate_firstName']")
	WebElement First_name;

	@FindBy(xpath = "//input[@id = 'addCandidate_middleName']")
	WebElement middle_name;
	
	@FindBy(xpath = "//input[@id = 'addCandidate_lastName']")
	WebElement last_name;
	
	@FindBy(css = "#addCandidate_email")
	WebElement Email;
	
	@FindBy(css = ".contactNo")
	WebElement Contact_number;
	
	@FindBy (css = "#addCandidate_resume")
	WebElement adding_resume;
	
	@FindBy(xpath = "//input[@name = 'addCandidate[keyWords]']")
	WebElement keywords;
	
	@FindBy(css = "#addCandidate_comment")
	WebElement  add_comment;
	
	@FindBy(css = ".formDateInput.calendar.hasDatepicker")
	WebElement date_of_application;
	
	@FindBy(css = "#addCandidate_consentToKeepData")
	WebElement consent_to_keep_data;
	
	@FindBy (xpath = "//input[@id= 'btnSave']")
	WebElement save_btn;
	
	@FindBy (xpath = "//input[@id='btnSave']")
	WebElement Buttonsave;
	
	public WebElement first_name(String fname) {
		First_name.sendKeys(fname);
		
		return First_name;
	}
	
	public WebElement middle_name(String mname) {
		middle_name.sendKeys(mname);
		
		return middle_name;
	}
	
	public WebElement last_name(String lname) {
		last_name.sendKeys(lname);
		
		return last_name;
	}
	
	public WebElement email(String email) {
		 Email.sendKeys(email);
		
		return Email;
	}
	
	public WebElement contact_number(String contact_number) {
		  
		Contact_number.sendKeys(contact_number);
		 return Contact_number;
	}

	public WebElement add_resume() {
		
		adding_resume.sendKeys("D:\\Don't touch\\Selenium Interview Questions\\solutions.txt");
		adding_resume.click();
		return adding_resume;
	}
	
	
	/*public WebElement upload_resume() {
		
	}*/
	public WebElement add_keywords(String one,String two) {
		keywords.sendKeys(one,two);
		return  keywords;
	}
	
	public WebElement add_comment(String comment ) {
		add_comment.sendKeys(comment);
		return add_comment;
	}
	public WebElement date_of_application() {
		date_of_application.click();
		
		List<WebElement> calendar = driver.findElements(By.cssSelector(".ui-state-default"));
		for(WebElement ele:calendar) {
			
			String date = ele.getText();
			if( date.equalsIgnoreCase("1")){
				ele.click();
				break;
			}
		}
		
		return date_of_application;
	}
	
	public WebElement consent_checkbox() {
		
		consent_checkbox.click();
		return consent_checkbox;
	}

	public WebElement SaveBtn() {
	//	SaveBtn.click();
        Buttonsave.click();
        
		return SaveBtn();
		
	}
	//String expected = errormsg.getText();
	
	
}

