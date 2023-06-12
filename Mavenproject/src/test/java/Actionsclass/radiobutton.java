package Actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		List<WebElement> k = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (int i = 0; i <= k.size() - 1; i++) {
			k.get(i).click();
			boolean uy = k.get(i).isSelected();
			System.out.println(uy);
		}

	}

}
