package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Revision5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File a=new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\Testdata.Properties");
       FileInputStream x=new FileInputStream(a);
       Properties prop=new Properties();
       prop.load(x);
       String j=prop.getProperty("name");
       System.out.println(j);
       
	}

}
