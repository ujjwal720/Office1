package RevisonRahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
      List<WebElement> y=driver.findElements(By.xpath("//tbody/tr/td[1]/ul[1]/li/a"));
      for(int i=0;i<=y.size()-1;i++) {
    	    System.out.println(y.get(i).getText());
      }
	}

}
