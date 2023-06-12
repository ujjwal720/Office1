package pom2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	
	@Test
	public void LoginPage() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
         pom1.LoginPage a=new pom1.LoginPage(driver);
         a.emailid().sendKeys("Hello");
         a.password().sendKeys("first");
       
        
	}

}
