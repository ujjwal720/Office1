package Seleniuminterveiw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("The assert is succesful");
		
		/*
		 * The diffrence between the driver.get and navigate is the driver.get do not maintain
		 * any browser history wheares driver.navigate maintain the browser history and we can do the 
		 * to and forth from the driver.navigate.
		 */

	}

}
