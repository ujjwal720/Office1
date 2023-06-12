package RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	List<WebElement> n=driver.findElements(By.xpath("//div[@id='discount-checkbox']/div/input"));
	System.out.println(n.size());
	for(int i=0;i<=n.size()-1;i++) {
		System.out.println(n.get(i));
		
	}

	}

}
