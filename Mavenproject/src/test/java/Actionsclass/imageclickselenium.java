package Actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class imageclickselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//canvas[@id='ctaCanvas']")).click();
		System.out.println("hve succesg]fuly clicked the image");
		if (driver.getTitle().equalsIgnoreCase("google")) {
			System.out.println("The following is an google");
		} else {
			System.out.println("The following is not an google");
		}

	}

}
