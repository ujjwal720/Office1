package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	WebDriver driver;

	
	public WebDriver intial() throws IOException {

		File a = new File(
				"C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\src\\test\\java\\Academy\\Rahul.Properties");
		FileInputStream b = new FileInputStream(a);
		Properties prop = new Properties();
		prop.load(b);
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();

		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		return driver;
	}
	
	

}
