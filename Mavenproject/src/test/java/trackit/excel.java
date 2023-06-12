package trackit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File a = new File("C:\\Users\\ujjwal.shrivastava\\OneDrive - 1Rivet US, Inc\\Desktop\\Klm.xlsx");
		FileInputStream b = new FileInputStream(a);
		XSSFWorkbook s=new XSSFWorkbook(b);
		XSSFSheet d=s.getSheetAt(0);
		System.out.println(d.getSheetName());
		System.out.println(d.getRow(0).getCell(0));
		System.out.println(d.getLastRowNum());
		
		
	}

}
