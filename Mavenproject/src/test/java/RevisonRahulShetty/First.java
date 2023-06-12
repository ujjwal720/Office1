package RevisonRahulShetty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
	static int ab = 0;
	WebDriver driver = new ChromeDriver();
	WebDriverWait g = new WebDriverWait(driver, 40);
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		

		WebDriverWait g = new WebDriverWait(driver, 40);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://qa-1tfmv2.1rivet.com/");
		driver.manage().window().maximize();
		
		
		
		
		
		authenticate(driver, g);

		if (ab == 1) {
			Bookitbutton(driver, g);
		}
		;

		if (ab == 2) {
			positiveflow(driver, g);
		}
		
		if(ab==3) {
			WebDriverManager.chromedriver().setup();
			Thread.sleep(3000);
			driver.get("https://qa-1tfmv2.1rivet.com/");
			driver.manage().window().maximize();
			authenticate(driver, g);
		}

	}
	
	public static void authenticate(WebDriver driver, WebDriverWait m) throws InterruptedException {
		m.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@class='form-control form-input-control']")))
				.sendKeys("Ron");
		driver.findElement(By.xpath("//input[@class='form-control form-input-control pr-5']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@class='btn btn-login btn-primary']")).click();
		Thread.sleep(3000);
		System.out.println("Aunthentication test is passed");
		ab++;
	

	}

	public static void Bookitbutton(WebDriver driver, WebDriverWait c) throws InterruptedException {
		Thread.sleep(20000);
		c.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='menu-icon icon icon-meeting']")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Add New Book It Request']")).click();
		Thread.sleep(3000);
		System.out.println("Button test is passed");
		ab++;
	}


	public static void positiveflow(WebDriver driver, WebDriverWait d) throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='ng-input']")).click();
		Thread.sleep(1000);
		List<WebElement> a = driver
				.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div/div/span"));
		for (int i = 0; i <= a.size() - 1; i++) {
			if (a.get(i).getText().equalsIgnoreCase("Meta")) {
				a.get(i).click();
				Thread.sleep(2000);
				break;
				
			}
		}
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='ng-select-container'])[1]")))
				.click();

		List<WebElement> b = driver
				.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div/div/span"));
		for (int j = 0; j <= b.size() - 1; j++) {
			if (b.get(j).getText().equalsIgnoreCase("Malika Arora")) {
				b.get(j).click();
				Thread.sleep(1000);
				break;
			}
		}

		driver.findElement(
				By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid[formcontrolname='eventName']"))
				.sendKeys("Automation script");

		driver.findElement(By.xpath("//input[@id='date']")).click();
		Thread.sleep(3000);

		WebElement x = driver.findElement(By.xpath("//div[@class='bs-datepicker-body']"));
		List<WebElement> u = x.findElements(By.tagName("td"));
		
		for(int k=0;k<=u.size()-1;k++) {
			if(u.get(k).getText().equalsIgnoreCase("29")) {
				u.get(k).click();
				break;
			
			}
		}

		driver.findElement(By.xpath("//app-time-picker[@formcontrolname='startTime']//button[@type='button']")).click();

		driver.findElement(By.xpath("//input[@placeholder='HH']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("30");
		driver.findElement(By.xpath("//app-time-picker[@formcontrolname='startTime']//button[@type='button']")).click();
		
		driver.findElement(By.xpath("//app-time-picker[@formcontrolname='endTime']//button[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='HH']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@placeholder='MM']")).sendKeys("30");
		driver.findElement(By.xpath("//app-time-picker[@formcontrolname='endTime']//button[@type='button']")).click();
		
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='form-group col-md-6 col-12 col-lg-4 col-xxl-3 ng-star-inserted'])[2]")).click();
		
		List<WebElement> w=driver.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div/div"));
		
		
		
		
		for(int g=0;g<=w.size()-1;g++) {
			if(w.get(g).getText().equalsIgnoreCase("121")) {
				w.get(g).click();
				break;
			}
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement gl=driver.findElement(By.xpath("(//div[@class='ng-value-container'])[6]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",gl);
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("(//div[@class='form-group col-12'])[2]")).click();
		
		
		List<WebElement> hbs=driver.findElements(By.xpath("//div[@class='ng-dropdown-panel-items scroll-host']/div/div"));
		
		System.out.println(hbs.size());
		
		driver.quit();
		
		

	   for(int ml=0;ml<=hbs.size()-1;ml++) {
		   if(hbs.get(ml).getText().equalsIgnoreCase("Confrence 1(10)")) {
			   hbs.get(ml).click();
		   }
		   
		   
	   }
		
		
		
	
		
	}
	
	
}

