package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions s = new Actions(driver);
		driver.get("https://automationexercise.com/");
		List<WebElement> u = driver.findElements(By.xpath("//div[@class='product-image-wrapper' ]/div[1]/div/a"));
		for (int i = 0; i <= 33; i++) {

			WebElement io = u.get(i);

			s.moveToElement(io).perform();

			Thread.sleep(1000);

		}

	}

}
