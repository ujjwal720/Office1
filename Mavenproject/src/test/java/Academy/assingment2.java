package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assingment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> ui = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div"));
		for (int i = 0; i <= ui.size() - 1; i++) {

			if (ui.get(i).getText().equalsIgnoreCase("india")) {

				ui.get(i).click();
				
				break;

			}

		}

	}

}
