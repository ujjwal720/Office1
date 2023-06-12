package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarterrorhandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("dgsgdfjgjfgfjgf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		WebDriverWait io = new WebDriverWait(driver, 10);
		io.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='_2YULOR']/span"))));
		String lm = driver.findElement(By.xpath("//span[@class='_2YULOR']/span")).getText();
		System.out.println(lm);

	}

}
