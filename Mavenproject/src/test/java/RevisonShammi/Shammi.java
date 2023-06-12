package RevisonShammi;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shammi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://money.rediff.com/gainers");
	    Thread.sleep(3000);
	    List<WebElement> a=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
	   for(int i=0;i<=a.size()-1;i++) {
		   System.out.println(a.get(i).getText());
	   }
	   System.out.println(a.size());
	
		

		
	}

}
