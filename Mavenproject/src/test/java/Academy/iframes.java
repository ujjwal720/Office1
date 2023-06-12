package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		WebElement iframes=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframes);
		String s=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(s);
	    System.out.println("The following is an scenario based questions");
		
		
	}

}
