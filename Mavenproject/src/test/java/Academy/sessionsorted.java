package Academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sessionsorted {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        int count=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twoplugs.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for a skill']")).sendKeys("hello");
		driver.findElement(By.xpath("//button[@class='btn green']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='jq-selectbox__trigger-arrow'])[1]")).click();
		List<WebElement> rs = driver.findElements(By.xpath("//div[@class='jq-selectbox__dropdown']/ul/li"));
		List<String> rsp = new ArrayList<String>();
		for (int i = 0; i <= rs.size() - 1; i++) {
			String ol=rs.get(i).getText();
			rsp.add(ol);
		}
		List<String> mno = new ArrayList<String>(rsp);
	     Collections.sort(mno);
	     
	     for(int i=0;i<=mno.size()-1;i++) {
	    	if(rsp.get(i).equals(mno.get(i))) {
	    		count++;
	    		break;
	    	}
	    	 
	     }
	     
	     if(count==1) {
	    	 System.out.println("The following list is not sorted");
	     }
	     else {
	    	 System.out.println("The following list is  sorted");
	     }

	}

}
