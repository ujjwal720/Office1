package testng;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class annotions {

	
	WebDriver driver;
	@BeforeClass
	public void setenv() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@DataProvider
	public Object[][] dataset() throws IOException{
		
		File stc=new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\Object.Properties");
        FileInputStream s=new FileInputStream(stc);
        Properties m=new Properties();
        m.load(s);
        
        Object arr[][]=new Object[3][2];
        
        arr[0][0]="Ujjwal";
        arr[0][1]="Ujjwals";
        arr[1][0]="Ujjwald";
        arr[1][1]="Ujjwalj";
        arr[2][0]="Ujjwalk";
        arr[2][1]="Ujjwall";
        
		return arr;
		
	
		
	}
	
	@Test(dataProvider="dataset")
	public void email(String s,String f) throws InterruptedException {
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(s);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(s);
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		driver.navigate().back();
		
	}
	

	
}
