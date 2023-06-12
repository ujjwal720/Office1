package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrlltoanelemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement ui = driver.findElement(By.xpath("//div[@class='tableFixHead']"));
		JavascriptExecutor r = (JavascriptExecutor) driver;
		r.executeScript("arguments[0].scrollIntoView(true);", ui);
		System.out.println("Scroll Succesfully for it");

	}

}
