package RahulShetty;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class uj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#%22");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> w=driver.getWindowHandles();
	    System.out.println(w.size());
	   Iterator<String> s  =w.iterator();
	   String p=s.next();
	   String c=s.next();
	   driver.switchTo().window(c);
	   String f=driver.findElement(By.xpath("//div[@class='col-md-8']/p[2]/strong/a")).getText();
	   System.out.println(f);
	   driver.switchTo().window(p);
	   driver.findElement(By.xpath("//input[@id='username']")).sendKeys(f);
	   
      		

	}

}
