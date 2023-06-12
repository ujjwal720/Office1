package ShammiTestNg;

import org.testng.annotations.Test;

public class sh {

	@Test
	public void ksi() {
		System.out.println("Hello this is a");
	}

	@Test
	public void kp() {
		System.out.println("This is an ksi");
	}

	@Test(dependsOnMethods = { "kp" })
	public void al() {
		System.out.println("This is an kp");
	}
	
	@Test
	public void bh() {
		System.out.println("This is an bh");
	}

}
