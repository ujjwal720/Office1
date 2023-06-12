package RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fullfledgesite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[value='GOI']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='AMD'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[2]/a")).click();
		driver.findElement(By.cssSelector("div[id*='info']")).click();
		Thread.sleep(1000);
		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.cssSelector("span[id*='hrefIncAdt']")).click();
		}
		driver.findElement(By.cssSelector("input[class='buttonN']")).click();

		WebElement x = driver.findElement(By.cssSelector("select[name*='Currency']"));
		Select g = new Select(x);
		g.selectByVisibleText("USD");
		List<WebElement> fd = driver.findElements(By.xpath("//div[@id='discount-checkbox']/div/input"));
		System.out.println(fd.size());
		List<WebElement> gf = driver.findElements(By.xpath("//div[@id='travelOptions']/table/tbody/tr/td/input"));
		System.out.println(gf.size());

	}

}
