package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ass {
     
	
	
	
	@Test
	public void kl() {
    
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String s=driver.getTitle();
		System.out.println(s);
		String f="Google";
		Assert.assertFalse(driver.getTitle().contains("Facebook"), "The following is false");
	}

}
