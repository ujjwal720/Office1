package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Revision1 {

	@Test
	public void hellos(){
		System.out.println("Welcome to testng");
	}
	
	
	@BeforeTest
	public void test() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("The following is after Test");
	}
	
	
	@Test(dependsOnMethods= {"hellos"})
	public void a(){
		System.out.println("This is depends on methods");
	}

}
