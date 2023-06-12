package RevisonRahulShetty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hainersloss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		List<WebElement> mf=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));
		String h="Medico Remedies";
		for(int i=0;i<=mf.size()-1;i++) {
		if(h.equalsIgnoreCase(mf.get(i).getText())){
			mf.get(i).click();
			break;
		}
		}
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		

	}

}
