package seliuminterveiw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton2prctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa-practice.netlify.app/radiobuttons.html");
		List<WebElement> ui = driver.findElements(By.xpath("//div[@class='form-check']/input"));
		for (int i = 0; i <= ui.size() - 1; i++) {

			ui.get(i).click();

			if (!ui.get(i).isEnabled()) {

				System.out.println(ui.get(i).getText());

			}

		}

	}

}
