package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom1 {
	
	WebDriver driver;
	
	By email=By.id("email");
	By password=By.id("pass");
	
	

	
	
	public WebElement a1() {
		
		return driver.findElement(email);
		
		
		//This driver do not know where it need to run so we are specifying it
	
	}
	

}
