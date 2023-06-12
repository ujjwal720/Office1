package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub.

		/*
		 * Packages are nothing,but they are basically used,as they reside inside the
		 * class so basically if we want to import that any other class we wil us the
		 * package keyword
		 */

		/*
		 * Packages are basically used for the testing, in this basically we hve the
		 * class in another package and if we want to import it we will basically do
		 * this.
		 */

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Aman");

		Thread.sleep(3000);

		List<WebElement> u = driver.findElements(By.xpath("//div[@class='erkvQe']/div/ul/li/div/div[2]/div[1]/span"));

		System.out.println(u.size());

		for (int i = 0; i <= u.size() - 1; i++) {
			
		System.out.println(u.get(i).getText());

		}

	}

}
