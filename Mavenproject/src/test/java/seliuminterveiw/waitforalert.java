package seliuminterveiw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitforalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Wait for the alert
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait po=new WebDriverWait(driver,20);
		driver.get("https://letcode.in/waits");
		WebElement cli = driver.findElement(By.xpath("//button[@class='button is-link']"));
		cli.click();
		po.until(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("The following alert is completed");
		
	    

	}

}
