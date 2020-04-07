package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestProperties {
    public WebDriver driver;
	@Test	
	public void login() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\NewWorkspace\\POOrangehrm\\src\\testngfile\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","D:\\Setups of applications\\geckodriver.exe");
			  driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
	     }
		else if (prop.getProperty("browser").equals("chrome")) {
			  driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}
		else if (prop.getProperty("browser").equals("InternetExplorer")) 
		  {
			System.setProperty("webdriver.ie.driver","D:\\Setups of applications\\IEDriverServer.exe");
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability("ignoreZoomSetting", true);
			driver = new InternetExplorerDriver();
			//driver.get(prop.getProperty("url"));
			
		  }
		driver.get("www.google.com");
	}
}
