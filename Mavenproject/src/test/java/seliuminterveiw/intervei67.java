package seliuminterveiw;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class intervei67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String leys = Keys.chord(Keys.SHIFT, "hello");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(leys);
		System.out.println("The following is written in the capital letter");

	}

}
