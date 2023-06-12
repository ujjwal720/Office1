package RahulShetty;

import static org.testng.Assert.assertFalse;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asser {
//assert will stop the execution of the program.
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5")) {
			System.out.println("The following is not enabled");
		}
		else {
			System.out.println("The following is enabled");
		}
	     
		System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).getAttribute("style"));


}
}
