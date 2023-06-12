package RevisonShammi;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions s=new Actions(driver);
		WebElement k=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        s.moveToElement(k).click().keyDown(Keys.SHIFT).sendKeys("Ujjwal");
        s.build().perform();
        driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']//*[name()='g' and contains(@fill,'#2874F1')]//*[name()='path'][2]")).click();
				
 

		
	}

}
