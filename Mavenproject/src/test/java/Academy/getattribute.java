package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		Thread.sleep(3000);
		String j = driver.findElement(By.xpath("//input[@id='Email']")).getAttribute("value").toString();
		System.out.println(j);
		String k = driver.findElement(By.xpath("//input[@id='Email']")).getText();
		System.out.println(k);
		/*
		 * get attribute basically help to get the attribute of 
		 * the html tag this is basically works as shown abve in it.
		 * 
		 */

	}

}
