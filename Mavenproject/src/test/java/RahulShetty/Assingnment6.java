package RahulShetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingnment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement m=driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		m.click();
	  if(m.isSelected()) {
		  String s=driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).getText().toString();
		  System.out.println(s);
	  }
		

	}

}
