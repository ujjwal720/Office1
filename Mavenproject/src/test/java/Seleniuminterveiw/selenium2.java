package Seleniuminterveiw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selenium2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
            
		/*
		 * To type text in selenium
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Hello Brother");
		System.out.println(driver.getPageSource());
		
		/*
		 * To clear the text in selenium
		 */
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).clear();
		
	}

}
