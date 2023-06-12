package RevisonRahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///select currency usd
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		Thread.sleep(3000);
		List<WebElement> currency=driver.findElements(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']/option"));
		for(int i=0;i<=currency.size()-1;i++) {
			
			String h=currency.get(i).getText().toString();
			if(h.equalsIgnoreCase("usd")) {
				currency.get(i).click();
				System.out.println("THE TEST IS PASSED");
			}
			
		}
	
		

	}

}
