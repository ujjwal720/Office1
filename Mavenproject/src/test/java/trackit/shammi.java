package trackit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shammi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * The following is done using css selector
		 * css selector is fast then the xpath 
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement s_ele=driver.findElement(By.cssSelector("textarea[id='APjFqb']"));
		s_ele.sendKeys("Hello");
		
		/*
		 * css selectors basically works and it is fast then the xpath 
		 */
		
		
		

	}

}
