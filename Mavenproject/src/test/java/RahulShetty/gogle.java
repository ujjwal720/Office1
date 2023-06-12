package RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("ind");
       Thread.sleep(3000);
       List<WebElement> m=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
       System.out.println(m.size());
       for(WebElement n:m) {
    	   if(n.getText().equalsIgnoreCase("indian Railways")) {
    		   n.click();
    		   break;
    		     }
    	
    
       }
       
       
       
       
	}

}
