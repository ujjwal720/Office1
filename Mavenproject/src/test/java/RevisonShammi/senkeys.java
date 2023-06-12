package RevisonShammi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class senkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-gaamdoot-web.azurewebsites.net/");
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebDriverWait x=new WebDriverWait(driver,20);
        x.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//input[@id='email']"))));
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");
	}

}
