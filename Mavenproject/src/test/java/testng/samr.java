package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class samr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		driver.findElement(By.cssSelector("input#fullName")).sendKeys("Hello");

	}

}
