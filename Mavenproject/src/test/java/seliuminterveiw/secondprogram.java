package seliuminterveiw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class secondprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> ui = driver.findElements(By.xpath("//input[@name='webform' and @type='radio']"));
		for (int i = 0; i <= ui.size() - 1; i++) {
			
			ui.get(i).click();
			Thread.sleep(2000);

		}

	}

}
