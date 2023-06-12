package RevisonRahulShetty;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class geenkart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] o = { "Brocolli", "Cauliflower", "Cucumber" };
		List<WebElement> m = driver.findElements(By.xpath("//div[@class='product']/h4"));
		for (int i = 0; i <= o.length - 1; i++) {
			for (int j = 0; j <= m.size() - 1; j++) {

				String[] p = m.get(j).getText().split("-");
				String h = p[0].trim();
				if (h.contains(o[i])) {
					driver.findElements(By.xpath("//div[@class='product']/div[3]/button")).get(j).click();
				}

			}

		}

	}

}
