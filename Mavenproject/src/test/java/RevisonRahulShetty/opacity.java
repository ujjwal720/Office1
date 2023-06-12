package RevisonRahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		boolean g = driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5");
		if (g == true) {
			System.out.println("It is not enabled");
		}
		else {
			System.out.println("It is enabled");
		}
	}

}
