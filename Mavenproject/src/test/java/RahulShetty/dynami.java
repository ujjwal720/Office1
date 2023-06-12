package RahulShetty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		String f = "";
		WebElement s = driver.findElement(By.xpath("//label[@for='benz']/input"));
		s.click();
		if (s.isSelected()) {
			f = driver.findElement(By.xpath("//label[@for='benz']")).getText();

		}

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(f);
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		List<WebElement> g = driver.findElements(By.xpath("//select[@id='dropdown-class-example']/option"));

		for (int i = 1; i <= 3; i++) {
			String j = g.get(i).getText();
			if (j.equalsIgnoreCase(f)) {
				g.get(i).click();
			}
		}

		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String ds = driver.switchTo().alert().getText();
		System.out.println(ds);
		if (ds.contains(f)) {
			System.out.println("Test is passed");
		}
		driver.switchTo().alert().accept();

	}

}
