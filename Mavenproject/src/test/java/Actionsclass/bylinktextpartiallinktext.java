package Actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bylinktextpartiallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/link.html");
		List<WebElement> u = driver.findElements(By.partialLinkText("here"));
		

		for(int i=0;i<=u.size()-1;i++) {
			u.get(i).click();
			System.out.println(driver.getTitle());
		}

	}

}
