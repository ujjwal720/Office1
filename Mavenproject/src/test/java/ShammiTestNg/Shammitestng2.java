package ShammiTestNg;

import org.testng.annotations.Test;

public class Shammitestng2 {
	
	
	@Test(invocationCount=0)
	public void fg() {
		System.out.println("This is first priority");
	}
	
	@Test(priority=2)
	public void ab() {
		System.out.println("This is ab priority");
	}

}
