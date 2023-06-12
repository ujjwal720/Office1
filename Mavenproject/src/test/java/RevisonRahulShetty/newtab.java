package RevisonRahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtab {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> f=driver.findElements(By.xpath("//tbody/tr/td[1]/ul[1]/li/a"));
		for(int i=0;i<=f.size()-1;i++) {
		 f.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		 Thread.sleep(3000);
		
		}

	}

}
