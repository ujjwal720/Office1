package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class enable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		String f=driver.findElement(By.cssSelector("input[name='ctl00$mainContent$txt_Todate']")).getCssValue("background-color");
		System.out.println(f);
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		String s=driver.findElement(By.cssSelector("input[name='ctl00$mainContent$txt_Todate']")).getCssValue("background-color");
         System.out.println(s);
	}

}
