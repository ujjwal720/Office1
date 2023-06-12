package RahulShetty;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='example']/a")).click();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> f=s.iterator();
		String m=f.next();
		String n=f.next();
		driver.switchTo().window(n);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(m);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	
		
		

	}

}
