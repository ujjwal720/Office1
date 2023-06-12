package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class program {

	private static final WebDriverWait WebElement = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebDriverWait h=new WebDriverWait(driver,10);
		h.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']"))).sendKeys("Hello");
	     WebElement g = driver.findElement(By.xpath("//input[@name='pass']"));
		g.sendKeys("Hello");
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
		
		

	}

}
