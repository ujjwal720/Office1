package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click();
	driver.findElement(By.cssSelector("a[value='ATQ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']/div/table/tbody/tr/td/div/div/div/ul/li/a[@value='AMD']")).click();
	
	

	}

}
