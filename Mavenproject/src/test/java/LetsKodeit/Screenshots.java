package LetsKodeit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		TakesScreenshot a=((TakesScreenshot)driver);
		File r=a.getScreenshotAs(OutputType.FILE);
		File o=new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\kl.png");
		FileUtils.copyFile(r, o);
		

	}

}
