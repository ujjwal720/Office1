package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class excelreadingfile {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		File a = new File("C:\\Users\\ujjwal.shrivastava\\OneDrive - 1Rivet US, Inc\\Desktop\\Test_data.xlsx");
		FileInputStream sd = new FileInputStream(a);
		XSSFWorkbook pl = new XSSFWorkbook(sd);
		XSSFSheet ui = pl.getSheetAt(0);
		int l = ui.getFirstRowNum();
		int qz = ui.getLastRowNum();
		System.out.println(l);
		System.out.println(qz);

		// String y = qa.next().toString();
		// String l = qa.next().toString();
		// System.out.println(y);
		// System.out.println(l);

		for (int i = l; i <= qz; i++) {
			XSSFRow t = ui.getRow(i);
			Iterator<Cell> qa = t.cellIterator();
			while (qa.hasNext()) {
				String qam = qa.next().toString();
				System.out.println(qam);
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(qam);
				driver.close();

			}

		}

	}

}
