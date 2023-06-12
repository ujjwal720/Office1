package seliuminterveiw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		/*
		for (int i = 0; i <= radio.size() - 1; i++) {

			radio.get(i).click();
			if (radio.get(i).isSelected()) {

				System.out.println("True it is selcted");
			}

			Thread.sleep(3000);
		}
		*/
		
		System.out.println(radio.size());

	}

}
