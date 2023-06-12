package RevisonShammi;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://dev-gaamdoot-web.azurewebsites.net/");
		WebDriverWait p=new WebDriverWait(driver,20);
	    p.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='email']"))));
		TakesScreenshot x=((TakesScreenshot)driver);
		File r=x.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(r, new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\bb.png"));
		

	}

}
