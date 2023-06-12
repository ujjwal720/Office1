package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class program1 {
	
	@Test
	public void test1() {
		System.out.println("This is test1");
	}
	
	@BeforeTest
	public void test2() {
		System.out.println("This is before test");
	}
	
	@AfterTest
	public void test3() {
		System.out.println("this us after test");
	}
	
	@Test(groups={"Smoke"})
	public void test6() {
		System.out.println("This is tet6");
	}
	

}
