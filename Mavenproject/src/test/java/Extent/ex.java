package Extent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex {

	ExtentReports a;

	@BeforeTest
	public void test1() {
		String path = "C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\index1.html";
		ExtentSparkReporter y = new ExtentSparkReporter(path);
		y.config().setDocumentTitle("Test1");
		y.config().setReportName("Names");
		System.out.println("Completed");
		a = new ExtentReports();
		a.attachReporter(y);

	}

	@Test
	public void setups() {
		a.createTest("Start of test");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	}

}
