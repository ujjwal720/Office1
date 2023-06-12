package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lin {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		Actions g=new Actions(driver);
		List<WebElement> f=s.findElements(By.xpath("//tbody/tr/td[1]/ul[1]/li/a"));
		
		for(int i=0;i<=f.size()-1;i++) {
			g.keyDown(Keys.CONTROL).click(f.get(i)).build().perform();
			Thread.sleep(3000);
			
		}
		Set<String> o =driver.getWindowHandles();
		   Iterator<String> m=o.iterator();
		   for(int i=0;i<=o.size()-1;i++) {
			   String h=m.next();
			   Thread.sleep(3000);
			   System.out.println( driver.switchTo().window(h).getTitle());
		   }
		
	 
}
}