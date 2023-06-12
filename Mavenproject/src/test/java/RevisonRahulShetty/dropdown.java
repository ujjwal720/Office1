package RevisonRahulShetty;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> suggestions =driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));		
		for(int i=0;i<=suggestions.size()-1;i++) {
			String s=suggestions.get(i).getText();
			if(s.equalsIgnoreCase("india")) {
				suggestions.get(i).click();
				break;
			}
			
		}
		
		

	}

}
