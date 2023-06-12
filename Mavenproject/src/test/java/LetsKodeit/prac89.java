package LetsKodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prac89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Mouse hover and move to certain element program
		 */WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		Actions sx = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//div[@class='nav-menu-container']/ul/li[2]/a"));
		sx.moveToElement(target).build().perform();
		System.out.println("The following we do the mouse hover");

	}

}
