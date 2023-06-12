package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		List<WebElement> o=driver.findElements(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']/p/select/option"));
		for(int i=0;i<=o.size()-1;i++) {
			String k=o.get(i).getText();
			
		}

	}

}
