package Academy;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		WebElement u=driver.findElement(By.xpath("//button[@id='color']"));
		System.out.println(u.getCssValue("color"));
		String l=u.getCssValue("color");
		Color color = Color.getColor(l);
		System.out.println(color);
		

	}

}
