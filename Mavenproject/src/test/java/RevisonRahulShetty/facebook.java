package RevisonRahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		WebElement x = driver.findElement(By.xpath("//select[@id='day']"));
		x.click();
		List<WebElement> yz = driver.findElements(By.xpath("//select[@id='day']/option"));
		Select u = new Select(x);
		u.selectByVisibleText("30");
		Thread.sleep(1000);
		u.selectByValue("21");
		Thread.sleep(1000);
		u.selectByIndex(2);
		Thread.sleep(1000);
		List<WebElement> v = u.getOptions();
		for (int i = 0; i <= v.size() - 1; i++) {
			v.get(i).click();
			Thread.sleep(3000);
		}

	}

}
