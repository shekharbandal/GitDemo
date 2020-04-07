package Pageobject.POOrangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHomeRepository {
	
	WebDriver driver;
	
	public OrangeHRMHomeRepository(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By Admin = By.id("menu_admin_viewAdminModule");
	By Addbutton = By.name("btnAdd");
	By DeleteBtn = By.cssSelector("input[name = 'btnDelete']");
	By SearchBtn = By.xpath("//input[@id = 'searchBtn']");*/
	
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement Admin;
	
	@FindBy(name = "btnAdd")
	WebElement Addbutton;
	
	@FindBy (css = "btnDelete")
	WebElement DeleteBtn;
	
	@FindBy (xpath = "//input[@id = 'searchBtn']")
	WebElement SearchBtn;
	
	public WebElement Admin_link(WebDriver driver) {
		
		return Admin;
		
	         }

public WebElement addBtn(WebDriver driver) {
	return  Addbutton;
	
}
public WebElement delete_Button(WebDriver driver) {
	return  DeleteBtn;
	
}
public WebElement Search_button(WebDriver driver) {
	 return SearchBtn ;
	
}


}
