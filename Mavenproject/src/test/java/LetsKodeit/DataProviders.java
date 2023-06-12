package LetsKodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {

	WebDriver driver;

	@DataProvider(name = "test-data")
	public Object[][] sm() {
		Object[][] a = new Object[2][2];
		a[0][0] = "gmail.com";
		a[0][1] = "gmail.com";
		a[1][0] = "maiefwefl.com";
		a[1][1] = "mail.com";

		return a;
	}

	@Test(dataProvider = "test-data")
	public void smd(String a, String b) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(a);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(b);
	}

	@AfterTest
	public void teardown() throws InterruptedException {

		Thread.sleep(3000);
		driver.quit();

	}

}
