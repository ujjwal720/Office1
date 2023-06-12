package RevisonRahulShetty;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions b=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		b.moveToElement(e).keyDown(Keys.SHIFT).sendKeys(e, "hello");
		b.build().perform();
		Thread.sleep(1000);
		List<WebElement> k=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div/div/div"));
		for(int i=0;i<=k.size()-1;i++) {
			String j=k.get(i).getText();
			System.out.println(j);
		}
		
	}

}
