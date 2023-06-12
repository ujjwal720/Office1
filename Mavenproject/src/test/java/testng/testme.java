package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testme {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		Thread.sleep(3000);
		String x=driver.findElement(By.xpath("(//td[@class='infobox-data'])[10]/div/ul/li")).getText();
		System.out.println(x);
		String[] p=x.split(" ");
		System.out.println(p[p.length-1]);
		driver.get("https://www.imdb.com/title/tt9389998/");
		String y=driver.findElement(By.xpath("//a[@class='ipc-link ipc-link--baseAlt ipc-link--inherit-color sc-8c396aa2-1 WIUyh']")).getText();
		System.out.println(y);
		if(p[p.length-1].equals(y)) {
			System.out.println("The years is equal");
		}
		else {
			System.out.println("The year is not equal");
		}
		
	
		

	}

}
