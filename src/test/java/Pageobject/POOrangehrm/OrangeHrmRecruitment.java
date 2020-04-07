package Pageobject.POOrangehrm;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.collections.Lists;

public class OrangeHrmRecruitment {

	WebDriver driver;
	
	public OrangeHrmRecruitment(WebDriver driver) {
		 this.driver = driver;
		  PageFactory.initElements(driver, this);
	}
	
	@FindBy (name = "candidateSearch[jobTitle]")
	WebElement Job_title;
	
	@FindBy(id = "candidateSearch_jobVacancy")
	WebElement jobvacancy_dropdown;
	
	@FindBy (id  = "candidateSearch_hiringManager")
	WebElement hiring_Mgrdropdwn;
	
	@FindBy (id = "candidateSearch_status")
	WebElement Candidate_Search_status_drpdown;
	
	
	@FindBy(xpath = "//input[@name = 'candidateSearch[candidateName]']")
	WebElement Candidate_name;
	
	@FindBy(name = "btnAdd")
	WebElement Addbutton;
	
	@FindBy(xpath = "//select[@name = 'candidateSearch[status]']")
	WebElement candidate_status_dropdown;
	
	@FindBy(css = "#candidateSearch_candidateName")
	 WebElement Candidate_name_textbox;
	
	@FindBy(css = "#candidateSearch_keywords")
	WebElement keyword_textbox;
	
	@FindBy (xpath = "//input[@id='candidateSearch_fromDate']")
	WebElement fromdatepicker;
	
	@FindBy(xpath = "//input[@id = 'candidateSearch_toDate']")                   // //input[@id = 'candidateSearch_toDate']   ---------------//a[@class = 'ui-state-default ui-state-highlight ui-state-active']
	WebElement to_datepicker;
	
	@FindBy(css = "#candidateSearch_modeOfApplication")
	WebElement method_of_application;
	
	@FindBy(xpath = "//input[@name = 'btnAdd']")
	WebElement btnAdd;
	
	
	public WebElement Jobtitle_dropdwn() {
		Select jobtitle_dpdwn = new Select(driver.findElement(By.name("candidateSearch[jobTitle]")));             
		 
		jobtitle_dpdwn.selectByIndex(5);
		return Job_title;
	}
	
	public WebElement vacancydropdown() {
		
		
		return jobvacancy_dropdown;
	}
	public WebElement hiringmgr_dropdown() {
		return hiring_Mgrdropdwn;
	}
	public WebElement statudropdown() {
		return Candidate_Search_status_drpdown;
	}
	
	public WebElement cand_name() {
		return  Candidate_name;
	} 
	
	public WebElement Add_button() {
		return Addbutton;
	}
	
	public WebElement candidate_status_dropdown() {
		
		Select candidate_status = new Select(Candidate_Search_status_drpdown);
		candidate_status.selectByIndex(2);
		
		return Candidate_Search_status_drpdown;
	}
	
	public WebElement can_name_text(String name) {
		
		//Candidate_name_testbox.sendKeys(name);
		Candidate_name_textbox.sendKeys(name);
		return Candidate_name_textbox;
	}
	
	public  WebElement keyword_search_textbox(String name) {
		keyword_textbox.sendKeys(name);
		return keyword_textbox;
	}
	public WebElement from_date_picker() {
		fromdatepicker.click();
		java.util.List<WebElement> all_dates = driver.findElements(By.xpath("//a[@class = 'ui-state-default']"));
		for(WebElement ele:all_dates) {
			String date = ele.getText();
			
			if(date.equalsIgnoreCase("10")) {
				ele.click();
				break;
				
			                                }
		                             }
		
		return fromdatepicker;
		
	}
	public WebElement to_date_picker() {
		to_datepicker.click();
		WebElement current_date = driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active"));
		current_date.click();
		return to_datepicker;
	}
	
	/**
	 * @return 
	 * 
	 */
	public WebElement method_of_application() {
		
		Select  select = new Select(driver.findElement(By.cssSelector("#candidateSearch_modeOfApplication")));  
		
		 select.selectByIndex(1);;
		return method_of_application;
	}
	public WebElement add_btn() {
		 
		return Addbutton;
	}
}
