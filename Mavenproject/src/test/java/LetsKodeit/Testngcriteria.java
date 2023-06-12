package LetsKodeit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngcriteria {
	
	
	
	@Test(priority=2)
	public void js() {
		System.out.println("This is test1");
	}
	
	
	@BeforeTest
	public void jsk() {
		System.out.println("The following is an before test");
	}
	
	@Test(priority=1)
	public void ujjwal() {
		System.out.println("The following is an test class");
	}
	
	@Test(dependsOnMethods= {"ujjwal"})
	public void ahf() {
		System.out.println("After ujjwal execution");
	}
	
	

}
