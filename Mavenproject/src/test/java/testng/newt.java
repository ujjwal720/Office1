package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newt {

	@DataProvider
public Object[][] sk() {
	Object[][] s=new Object[1][2];
	s[0][0]="https://www.facebook.com/";
	s[0][1]="https://www.flipkart.com/";
	
	return s;
	
}
	
	
	@Test(dataProvider="sk")
	public void kl(String x,String y) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(x);
	Thread.sleep(3000);
	driver.get(y);
	}

}
