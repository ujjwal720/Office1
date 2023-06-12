package seliuminterveiw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hello8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * selenium interveiw questions 78
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/radio");
		List<WebElement> uio = driver.findElements(By.xpath("(//div[@class='control'])[5]/label/input"));
		for (int i = 0; i <= uio.size() - 1; i++) {

			String pl = uio.get(i).getText();

			System.out.println(pl);

		}

	}

}
