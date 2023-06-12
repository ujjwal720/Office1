package RahulShetty;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	WebElement j=driver.findElement(By.cssSelector("input[id='autosuggest']"));

    j.sendKeys("Ind");
    Thread.sleep(3000);
    List<WebElement> k=driver.findElements(By.cssSelector("ul[class*='autocomplete '] li a"));
for(WebElement c:k) {
	System.out.println(c.getText());
}




		

	}

}
