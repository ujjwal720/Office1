package pom2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class provi {
	
	
	
	@DataProvider
	public Object[][] test() {
		
      Object[][] arr=new Object[2][2];
      arr[0][0]="Hello";
      arr[0][1]="Password";
      arr[1][0]="Gmail";
      arr[1][1]="Password";
      
      return arr;
	}

	
	
	@Test(dataProvider="test")
	public void klm(String k,String l) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("email")).sendKeys(k);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(l);
		Thread.sleep(3000);
		
	}
}



