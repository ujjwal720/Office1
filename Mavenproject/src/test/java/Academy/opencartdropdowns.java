package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opencartdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement ty = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		ty.click();
		Select rt = new Select(ty);
		rt.selectByIndex(2);
		rt.selectByVisibleText("Option2");
		System.out.println("The folowing select is done");
		

	}

}
