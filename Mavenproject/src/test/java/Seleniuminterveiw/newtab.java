package Seleniuminterveiw;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtab {

	/*
	 * open links in new tab we cannot put send keys as it will not be a webelemnt
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> i_o = driver.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul[1]/li/a"));
		String k = Keys.chord(Keys.CONTROL, Keys.ENTER);
		for (int i = 0; i <= i_o.size() - 1; i++) {

			i_o.get(i).sendKeys(k);

		}

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		for (String stock : windows) {
			driver.switchTo().window(stock);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());

		}

	}

}
