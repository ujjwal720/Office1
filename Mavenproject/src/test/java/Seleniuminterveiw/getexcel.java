package Seleniuminterveiw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import RahulShetty.ale;

public class getexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * file not ound will be the chec exception
		 */
		File a = new File("C:\\Users\\ujjwal.shrivastava\\OneDrive - 1Rivet US, Inc\\Desktop\\Username.xlsx");
		FileInputStream a_x = new FileInputStream(a);
		XSSFWorkbook li = new XSSFWorkbook(a_x);
		XSSFSheet i_o = li.getSheetAt(0);
		int u = i_o.getLastRowNum();
		Iterator<Row> l = i_o.iterator();
	Row bc = l.next();
		Iterator<Cell> iop = bc.cellIterator();
		while (iop.hasNext()) {

			Cell r_t = iop.next();
			String jk = r_t.getStringCellValue();
			System.out.println(jk);

		}

	}

}
