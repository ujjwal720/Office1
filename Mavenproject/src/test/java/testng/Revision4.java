package testng;

import org.testng.annotations.Test;

public class Revision4 {
	
	
	
	
	@Test(priority=0)
	public void ms(){
		System.out.println("The following is pri");
	}
	
	
	
	@Test(priority=2)
	public void asl(){
		System.out.println("The following is pria");
	}
	
	@Test(priority=3)
	public void aslm() {
		System.out.println("This is asl");
	}

}
