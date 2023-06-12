package RahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.easemytrip.com/");
        driver.manage().window().maximize();
        //input
        driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
        driver.findElement(By.xpath("//input[@id='Editbox13_show']")).click();
        //Celander
        driver.findElement(By.xpath("//input[@class='input_cld']")).click();
        driver.findElement(By.xpath("//li[@class='active-date']")).click();
        ///Persons 
        driver.findElement(By.xpath("//a[@class='dropbtn_n9']")).click();
        for(int i=1;i<=3;i++) {
        	driver.findElement(By.xpath("//input[@class='plus_box1']")).click();
        }
        driver.findElement(By.xpath("(//a[@class='dn_btn'])[1]")).click();
    
        ////economy class
        driver.findElement(By.xpath("//a[@class='dropbtn_n10']")).click();
        List<WebElement> g=driver.findElements(By.xpath("//div[@class='innr_pnl']/label"));
        System.out.println(g.size());
       for(int i=0;i<=2;i++) {
    	   g.get(i).click();
       }
        System.out.println("Test Passes");
        
        driver.findElement(By.xpath("//a[@id='tripType']")).click();
        driver.findElement(By.xpath("(//input[@class='src_btn'])[1]")).click();
        driver.switchTo().alert().getText();
        System.out.println(driver.switchTo().alert().getText());
	}

}
