package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	WebDriver driver;
	By b1=By.xpath("//span[normalize-space()='Login']");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public WebElement signin() {
		
		return driver.findElement(b1);
	}

}
