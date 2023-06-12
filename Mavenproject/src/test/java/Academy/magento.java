package Academy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class magento {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Actions x = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement target = driver
				.findElement(By.xpath("(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[1]"));
		x.moveToElement(target).build().perform();
		Thread.sleep(1000);
		WebElement target2 = driver
				.findElement(By.xpath("//li[@class='level1 nav-2-1 category-item first parent ui-menu-item']/a"));
		x.moveToElement(target2).build().perform();
		Thread.sleep(2000);
		WebElement target3 = driver
				.findElement(By.xpath("//li[@class='level2 nav-2-1-1 category-item first ui-menu-item']/a"));
		x.moveToElement(target3).build().perform();
		Thread.sleep(2000);
		target3.click();
		/*
		 * To calculate number of items in the following for the things.
		 * 
		 */
		List<WebElement> alltargets = driver.findElements(By.xpath("//li[@class='item product product-item']"));

		List<WebElement> ui = driver.findElements(By.xpath("(//div[@class='control'])[3]/select/option"));

		WebElement targets = driver.findElement(By.xpath("(//div[@class='control'])[3]"));

		// targets.click();

		WebDriverWait waits = new WebDriverWait(driver, 10);

		for (int i = 1; i <= ui.size() - 1; i++) {

			waits.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(targets));
			targets.click();
			Thread.sleep(2000);
			ui.get(i).click();
			Thread.sleep(4000);
			driver.navigate().refresh();
		}

		/*
		 * for (int i = 0; i <= ui.size() - 1; i++) { Thread.sleep(4000);
		 * targets.click(); Thread.sleep(2000); targets.click(); ui.get(i).click();
		 * Thread.sleep(4000);
		 * 
		 * }
		 */

	}

}
