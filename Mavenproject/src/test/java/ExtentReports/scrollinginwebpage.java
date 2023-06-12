package ExtentReports;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollinginwebpage {
@Test
	public void smadd () throws InterruptedException  {
		// TODO Auto-generated method stub
		int sum = 0;
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,500)");
		List<Integer> t = new ArrayList<Integer>();
		List<WebElement> x = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		for (int i = 0; i <= x.size() - 1; i++) {
			int k = Integer.parseInt(x.get(i).getText());
			t.add(k);
		}
		System.out.println(t);
		for (int i = 0; i <= t.size() - 1; i++) {
			sum = sum + t.get(i);
		}
		System.out.println(sum);

		String i = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();

		String[] l = i.split(":");

		String dm = l[1].trim();

		int o = Integer.parseInt(dm);

		Assert.assertEquals(sum, 89);

	}

}
