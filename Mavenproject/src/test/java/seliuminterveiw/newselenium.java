package seliuminterveiw;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newselenium {

	
	@Test
	public void js() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String tittle=driver.getTitle();
		System.out.println(tittle);
		String actual="Google";
		Assert.assertEquals(actual,tittle);

	}

}
