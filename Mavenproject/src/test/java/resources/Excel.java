package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File a = new File("C:\\Users\\ujjwal.shrivastava\\OneDrive - 1Rivet US, Inc\\Desktop\\Ujjwals.xlsx");
		FileInputStream b = new FileInputStream(a);
		XSSFWorkbook c = new XSSFWorkbook(b);
		int x = c.getNumberOfSheets();
		System.out.println(x);
		String m = c.getSheetName(0);
		System.out.println(m);
		XSSFSheet y = c.getSheetAt(0);
		System.out.println(y.getLastRowNum() - y.getFirstRowNum());
		Iterator<Row> n = y.iterator();
		Row firstrow = n.next();

		Iterator<Cell> r = firstrow.cellIterator();
		while(r.hasNext()) {
			String h=r.next().toString();
			System.out.println(h);
					
		}
		
	}

}
