package LetsKodeit;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertisfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File a=new File("C:\\Users\\ujjwal.shrivastava\\eclipse-workspace\\Mavenproject\\Prop.Properties");
		FileInputStream c=new FileInputStream(a);
		Properties b=new Properties();
	    b.load(c);
	    System.out.println(System.getProperty("browser"));
	    System.out.println(b.getProperty("browser"));
		

	}

}
