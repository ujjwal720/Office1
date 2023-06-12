package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class screen1 {
	
	WebDriver driver;
	@Test
	public void getscreen(ITestResult a) throws IOException {
		if(ITestResult.FAILURE==a.getStatus()) {
			TakesScreenshot m=((TakesScreenshot)driver);
			File d=m.getScreenshotAs(OutputType.FILE);
			File h=new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\screen1.png");
			FileUtils.copyFile(h, d);
			
		}
	}

}
