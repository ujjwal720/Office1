package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarttakemobile {

	public static void main(String[] args) throws Throwable {
		
		// TODO Auto-generated method stub
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		List<WebElement> l = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(3000);
		System.out.println(l.size());
		for (int i = 0; i <= l.size() - 1; i++) {

			String qw = l.get(i).getText();

			String[] qa = qw.split("\\?");

			System.out.println(l.get(i).getText());

			//System.out.println(qa[1]);

		}

	}

}
