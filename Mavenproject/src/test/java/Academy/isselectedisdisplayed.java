package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isselectedisdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		boolean x = driver.findElement(By.xpath("//input[@class='gLFyf']")).isDisplayed();
		if (x == true) {

			System.out.println("The following search is now displayed");

		} else {
			System.out.println("The following search is not displayed");
		}

	}

}
