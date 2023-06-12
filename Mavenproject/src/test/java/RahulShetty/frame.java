package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
	   driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
	   driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
	 String s=  driver.findElement(By.xpath("//div[@id='content']")).getText();
	 System.out.println(s);
	   

	}

}
