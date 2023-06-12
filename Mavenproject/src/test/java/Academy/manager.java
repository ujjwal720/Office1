package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> u = driver.findElements(By.xpath("//div[@class='dropdown open']/ul/li/a"));
		for (int i = 0; i <= u.size() - 1; i++) {
			
			System.out.println(u.get(i).getText());

		}
		
		/*
		 * Find element and find elemnts 
		 * basically the find element is used in 
		 * the finding of elemnts and the next thing is it
		 * used in the find elements to get the options as follows.
		 * 
		 */

	}

}
