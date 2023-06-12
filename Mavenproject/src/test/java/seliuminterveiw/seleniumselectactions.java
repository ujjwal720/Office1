package seliuminterveiw;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumselectactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/selectable");
		List<WebElement> pop = driver.findElements(By.xpath("//ul[@id='verticalListContainer']/li"));
		for (int i = 0; i <= pop.size() - 1; i++) {
			
			pop.get(i).click();
			Thread.sleep(2000);
			System.out.println(pop.get(i).isSelected());

		}

	}

}
