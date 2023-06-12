package LetsKodeit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File a = new File("C:\\excel\\Qw.xlsx");
		FileInputStream x = new FileInputStream(a);
		XSSFWorkbook d = new XSSFWorkbook(x);
		int r = d.getNumberOfSheets();
		System.out.println(r);
		for (int i = 0; i <= r - 1; i++) {
			XSSFSheet p = d.getSheetAt(i);

			Iterator<Row> h = p.rowIterator();

			while (h.hasNext()) {

				Row e = h.next();

				Iterator<Cell> l = e.cellIterator();

				while (l.hasNext()) {

					Cell v = l.next();
					System.out.println(v.toString());
				}
			}

		}

	}

}
