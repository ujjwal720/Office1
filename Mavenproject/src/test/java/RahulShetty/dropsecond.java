package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	    driver.manage().window().maximize();
	    WebElement a=driver.findElement(By.cssSelector("div[id*='info']"));
	    a.click();
	    WebDriverWait s=new WebDriverWait(driver,10);
	    s.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[id*='Inc']"))).click();
	   for(int i=1;i<=2;i++) {
		   driver.findElement(By.cssSelector("span[id*='Inc']")).click();
		   
	   }
	   
	  // driver.findElement(By.cssSelector("input[class='buttonN']")).click();
	  
	String c=driver.findElement(By.cssSelector("span[id='spanAudlt']")).getText();
	   if(c.equals("4")) {
		   System.out.println("The following is an true ");
	   }
	   else {
		   System.out.println("The following is false");
	   }

	}

}
