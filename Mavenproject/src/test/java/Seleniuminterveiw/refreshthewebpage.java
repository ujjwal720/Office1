package Seleniuminterveiw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class refreshthewebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    Thread.sleep(4000);
	    driver.navigate().refresh();
	    /*
	     * To refresh the webpage
	     * we can use the navigate command in our code '
	     * by this we can bavifate to deired url
	     * 
	     * 
	     */
	    
	   
	}

}
