package testng;

import org.testng.annotations.Test;

public class Revision2 {
	
	@Test(groups= {"Smoke"})
	public void ops() {
		System.out.println("Hellos in the following");
	}
	
	@Test(groups= {"Smoke"})
	public void jk() {
		System.out.println("The following is an abc");
	}
	
	@Test(groups= {"Smoke"})
	public void klm() {
		System.out.println("This is the testng");
	}

}
