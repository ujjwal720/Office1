package RahulShetty;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowha {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

		Set<String> m = driver.getWindowHandles();
		Iterator<String> f = m.iterator();
		String h = f.next();
		String y = f.next();

		driver.switchTo().window(h);
		driver.switchTo().window(y);

		WebDriverWait e = new WebDriverWait(driver, 20);
		e.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='clearfix']/div"))).getTagName();

		String w = driver.findElement(By.xpath("//li[normalize-space()='contact@rahulshettyacademy.com']")).getText();

		String[] d = w.split("@");

		System.out.println(d[1]);

		String[] op = d[1].trim().split(".com");

		String il = op[0];

		driver.switchTo().window(h);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(il);

	}

}
