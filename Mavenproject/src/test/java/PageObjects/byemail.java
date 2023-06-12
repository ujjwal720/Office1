package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class byemail {
       WebDriver driver;
	
	By email=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By Button=By.xpath("//input[@value='Log In']");
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement button() {
		return driver.findElement(Button);
	}
	
	
	
	public byemail(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
}
