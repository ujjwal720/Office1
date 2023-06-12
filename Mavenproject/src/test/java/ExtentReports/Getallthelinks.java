package ExtentReports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getallthelinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// iterate get all the links

		List<WebElement> y = driver.findElements(By.xpath("//li[@class='gf-li']/a"));

		for (int i = 0; i <= y.size() - 1; i++) {
         
			
			System.out.println(y.get(i).getAttribute("href"));
		}

	}

}
