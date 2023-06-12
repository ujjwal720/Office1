import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports<ExtentSparkReporter> {
	
	
	@Test
	public void setupbrowser() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver a=new ChromeDriver();
		a.manage().window().maximize();
        a.get("https://www.google.com/");
}
	
	
	@BeforeTest
	public void sm() {
		String path=System.getProperty("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\index.html");
	      ExtentSparkReporter t=new ExtentSparkReporter(path);
		
	}

}
