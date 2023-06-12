package LetsKodeit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		WebElement t = driver.findElement(By.xpath("//select[@id='course']"));
		t.click();
		Select r = new Select(t);
		r.selectByVisibleText("Java");
		Thread.sleep(1000);
		r.selectByVisibleText("Python");
		List<WebElement> x = r.getOptions();
		System.out.println(x.size());
		for (int i = 0; i <= x.size() - 1; i++) {
			System.out.println(x.get(i));
			x.get(i).click();

		}

	}

}
