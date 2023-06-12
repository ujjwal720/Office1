import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isenabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> z=driver.findElements(By.xpath("//div[@id='radio-btn-example']/fieldset/label/input"));
		for(int i=0;i<=z.size()-1;i++) {
			z.get(i).click();
			System.out.println(z.get(i).isSelected());
		}

	}

}
