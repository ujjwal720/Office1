package Actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rdiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		List<WebElement> t = driver.findElements(By.xpath("//input[@name='sex']"));
		System.out.println(t.size());

		for (int i = 0; i <= t.size() - 1; i++) {

		   t.get(i).click();
		   Thread.sleep(4000);

		}

	}

}
