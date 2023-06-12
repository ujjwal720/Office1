package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revision3 {

	@DataProvider(name = "abc")
	public Object[][] mk() {

		Object[][] c = new Object[2][2];
		c[0][0] = "name@gmail.com";
		c[0][1] = "ujjwal";
		c[1][0] = "mks";
		c[1][1] = "mks@gmail.com";

		return c;

	}
	
	@Test(dataProvider="abc")
	public void bkl(String a,String b) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(a);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(b);
		
		
		
		
	}

}
