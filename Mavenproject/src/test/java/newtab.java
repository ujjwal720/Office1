import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions d = new Actions(driver);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> x = driver.findElements(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul/li/a"));
		for (int i = 0; i <= x.size() - 1; i++) {
			String l = Keys.chord(Keys.CONTROL, Keys.ENTER);
			x.get(i).sendKeys(l);

		}

	}

}
