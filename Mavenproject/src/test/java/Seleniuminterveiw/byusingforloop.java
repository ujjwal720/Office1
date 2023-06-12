package Seleniuminterveiw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class byusingforloop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File a = new File("C:\\Users\\ujjwal.shrivastava\\OneDrive - 1Rivet US, Inc\\Desktop\\Username.xlsx");
		FileInputStream a_x = new FileInputStream(a);
		XSSFWorkbook li = new XSSFWorkbook(a_x);
		XSSFSheet i_o = li.getSheetAt(0);
		int u = i_o.getLastRowNum();
		for (int i = 0; i <= u; i++) {

			XSSFRow p = i_o.getRow(i);
			int oi = p.getLastCellNum();

			for (int j = 0; j <= oi - 1; j++) {

				XSSFCell oiu = p.getCell(j);
				String l = oiu.getStringCellValue();
				System.out.println(l);

			}

		}

	}

}
