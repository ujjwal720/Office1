package RahulShetty;

import org.apache.poi.examples.xssf.usermodel.ShiftRows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions s=new Actions(driver);
		s.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
		.keyDown(Keys.SHIFT).sendKeys("mobile");
		s.build().perform();

	}

}
