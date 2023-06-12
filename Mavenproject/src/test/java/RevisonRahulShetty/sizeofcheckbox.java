package RevisonRahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sizeofcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	List<WebElement> h=driver.findElements(By.xpath("//div[@id='discount-checkbox']/div/label"));
	for(int i=0;i<=h.size()-1;i++) {
		String g=h.get(i).getText().toString();
		System.out.println(g);
	}
		

	}

}
