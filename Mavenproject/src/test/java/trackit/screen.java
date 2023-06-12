package trackit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		TakesScreenshot m=((TakesScreenshot)driver);
		File g=m.getScreenshotAs(OutputType.FILE);
		File srcfile=new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\screen.png");
	   FileUtils.copyFile(g, srcfile);
		

	}

}
