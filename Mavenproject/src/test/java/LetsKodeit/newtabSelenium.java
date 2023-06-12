package LetsKodeit;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtabSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/login");
		List<WebElement> c = driver
				.findElements(By.xpath("//ul[@class='nav navbar-nav pull-center dynamic_menu_texts']/li/a"));

		for (int i = 0; i <= c.size() - 1; i++) {
			String s = Keys.chord(Keys.CONTROL, Keys.ENTER);
			c.get(i).sendKeys(s);
		}
		Set<String> d = driver.getWindowHandles();
		Iterator<String> u = d.iterator();

		while (u.hasNext()) {

			String s = u.next();
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);

		}

	}

	

}

