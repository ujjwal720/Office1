package RahulShetty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver,5);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] j = { "Cucumber", "Brocolli", "Beetroot" };
		add(driver, j,w);
		

		/// convert it to array list and solve

	}

	public static void add(WebDriver driver, String[] p,WebDriverWait w) throws InterruptedException {
		int count = 0;
		List<WebElement> s = driver.findElements(By.xpath("//div[@class='products-wrapper']/div/div/h4"));
		System.out.println(s.size());

		for (int i = 0; i <= p.length - 1; i++) {
			if (count <= 2) {

				for (int k = 0; k < s.size() - 1; k++) {
					String[] m = s.get(k).getText().split("-");
					String fg = m[0].trim();
					// System.out.println(m);
					if (fg.contains(p[i])) {
						System.out.println(p[i]);
						System.out.println(k);
						driver.findElements(By.xpath("//div[@class='product-action']/button")).get(k).click();
						count++;

					}
				}
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));

		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		
	}

}
