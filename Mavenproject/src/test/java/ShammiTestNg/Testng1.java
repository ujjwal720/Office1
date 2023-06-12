package ShammiTestNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng1 {

	@BeforeSuite
	public void a() {
		char d='c';
		     int j=Character.toString(d).length();
		     System.out.println(j);
		System.out.println("This is before suite");
	}

	@Test
	public void b() {
		System.out.println("this is the rest method");
	}
	
	@BeforeMethod
	public void c() {
		System.out.println("This is the before method");
	}
	
	@BeforeClass
	public void d() {
		System.out.println("This is the before class");
	}
    
	@Test
	public void fd() {
		System.out.println("This is the test 2");
	}
	
	
}
