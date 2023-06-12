package RahulShetty;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
	    Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
	  Set<String> h=driver.getWindowHandles();
	 for(int i=0;i<=h.size()-1;i++) {
		 
	 }

	}

}
