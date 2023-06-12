package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	     driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.cssSelector("select[name*='ListCu']"));
		Select s=new Select(drop);
		s.selectByValue("USD");
		String h=s.getFirstSelectedOption().getText();
		System.out.println(h);
		if(h.equalsIgnoreCase("usd")) {
			driver.close();
		}
		else {
			System.out.println("The driver will not close");
		}
		
		
		


	}

}
