package testng;

import org.testng.annotations.Test;

public class program2 {

	
	
	@Test(groups={"Smoke"})
	public void test2() {
		System.out.println("Depends on method");
	}
	
	@Test(dependsOnMethods={"test2"})
	public void test1() {
		System.out.println("test2");
	}
	
	
	
	
}
