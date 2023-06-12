package Academy;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.byemail;

public class Homepage extends Base {
	
	
	@Test
	public void Test1() throws IOException, InterruptedException {
		driver=super.intial();
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		LandingPage c=new LandingPage(driver);
		c.signin().click();
		Thread.sleep(3000);
		byemail b=new byemail(driver);
		b.email().sendKeys("abc@q.com");
		b.password().sendKeys("12345");
		b.button().click();
		
		
		
		
	}

}
