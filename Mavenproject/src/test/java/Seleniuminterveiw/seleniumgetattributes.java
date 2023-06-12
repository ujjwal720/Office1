package Seleniuminterveiw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumgetattributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> l = driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label/input"));
		System.out.println(l.size());
		for (int i = 0; i <= l.size() - 1; i++) {

			System.out.println(l.get(i));

		}
	}

}
