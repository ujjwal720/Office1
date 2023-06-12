package testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		WebElement k=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		Actions s=new Actions(driver);
		s.click(k).sendKeys("fans").build().perform();
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		List<WebElement> x=driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		Thread.sleep(3000);
		for(int i=0;i<=4;i++) {
			String l=x.get(i).getText();
			Thread.sleep(2000);
			System.out.println(l);
		}
		
		
		

	}

}
