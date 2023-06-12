package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pom2 {
	
	WebDriver driver;
	
	
	@Test
	public void email() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		pom1 a=new pom1();
	     a.a1().sendKeys("Ujjwal");
		
		
		
	}

}
