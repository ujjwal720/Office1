package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathaxesinselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/child::li[1]"));
		/*
		 * syntax-:
		 */child::li*/
		 */
		 
		 driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/following::ul"));
		 /*
		  * from this point any much ul will be there will be shown in the 
		  * 
		  */
		 driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/li/following-sibling::li)[3]"));
		 
		 /*
		  * basically in syntax this means that the next following which is basically just next will be 
		    fetched this is basicallly the concept of the following sibling just the next will come in following sibling
		  */
		 driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/parent::div"));
		 
		 /*
		  * this type of the following we can basically exec	ute the script in the following we
		  * can see that the direct parent of the following,this is for it and this will be done liek this.
		  */
		 
		 
		 /*
		  * contains in the driver.find element by
		  */
		 
		  driver.findElement(By.xpath("//input[contains(name,email)]"));
		  /*
		   * this will be for the contains text in the 
		   * locators
		   */
		
		 
		 
		

	}

}
