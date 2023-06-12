package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions u=new Actions(driver);
		WebElement x=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		String z=Keys.chord(Keys.CONTROL,Keys.ENTER);
		u.moveToElement(x).sendKeys(z).build().perform();
		Thread.sleep(3000);
		WebElement d=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']"));
		d.click();
	}

}
