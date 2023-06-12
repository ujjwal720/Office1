package RahulShetty;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linksjjj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> fg = driver.findElements(By.xpath("//tbody/tr/td[1]/ul[1]/li/a"));
		
		
		Actions d=new Actions(driver);
		
		for(int i=0;i<=fg.size()-1;i++) {
		 WebElement ui=fg.get(i);
		  d.keyDown(Keys.CONTROL).click(ui);
		  d.build().perform();
		  
			}
		Set<String> gj=driver.getWindowHandles();
      Iterator<String> jk=gj.iterator();
      
      while(jk.hasNext()) {
    	  String h=jk.next();
    	  String gfd=driver.switchTo().window(h).getTitle();
    	  System.out.println(gfd);
      }
		
	
		
		
	}

}
