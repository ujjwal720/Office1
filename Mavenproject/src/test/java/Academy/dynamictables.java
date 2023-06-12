package Academy;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamictables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		List<WebElement> u = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[2]"));
		List<String> po = new ArrayList<String>();
		for (int i = 0; i <= u.size() - 1; i++) {

			String k = u.get(i).getText();
			po.add(k);

		}

		// System.out.println(po);

		for (int t = 0; t <= po.size() - 1; t++) {

			sum = sum + Integer.parseInt(po.get(t));

		}

		WebElement total = driver.findElement(By.xpath("//tfoot/td[2]/b"));

		String totals = total.getText();

		if (Integer.parseInt(totals) == sum) {

			System.out.println("The total is same  for the following");

		}

		else {
			
			System.out.println("The total is not same");

		}
	}

}
