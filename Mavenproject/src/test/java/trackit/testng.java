package trackit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testng extends y {

	@Test
	@Parameters("url")
	public void uj(String s) {
		System.out.println("Hello");
		System.out.println(s);
		
		b1 f=new y();
		
		
		
		
		
	}

	@Test(dependsOnMethods = { "uj" })
	public void mkl() {
		System.out.println("it is dependent on uj");
	}

	@Test(groups = ("Smoke"))
	public void b1() {
		System.out.println("This is methods");
	}

	@Test(groups = ("Smoke"))
	public void b3() {
		System.out.println("This is methods");
	}

	@BeforeTest
	public void url() {
		System.out.println("url should open now");
	}

	@AfterTest
	public void close() {
		System.out.println("Now the driver will close in this method");
	}
	
	@BeforeMethod
	public void gf() {
		System.out.println("this is goona be in every method");
	}

}
