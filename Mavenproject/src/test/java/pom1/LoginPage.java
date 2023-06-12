package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	
	
	public WebElement emailid() {
		
		return username;
	}
	
public WebElement password() {
		
		return password;
	}
	
	
	
}
