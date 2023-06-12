package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardeventsinselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://green-pond-09163ee00.2.azurestaticapps.net");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='signInNamePhoneEmail']")).sendKeys("admincc@yopmail.com");
		driver.findElement(By.xpath("//button[@id='next']")).click();

	}

}
