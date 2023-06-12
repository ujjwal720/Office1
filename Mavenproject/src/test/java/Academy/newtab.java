package Academy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		Set<String> y = driver.getWindowHandles();
		Iterator<String> x = y.iterator();
		
	  //loop will run upto elements are visible in has next//////
		while (x.hasNext()) {
			String z = x.next();
			driver.switchTo().window(z);
			String s = driver.getTitle();
			System.out.println(s);

		}

	}

}
