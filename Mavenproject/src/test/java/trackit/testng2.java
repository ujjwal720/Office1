package trackit;

import org.testng.annotations.Test;

public class testng2 {

	@Test
public void jfg() {
	System.out.println("Hello");
}
	@Test
	public void jfg2() {
		System.out.println("Hello this i will exclude");
	}

	@Test(groups=("Smoke"))
	public void b7() {
		System.out.println("This is methods");
	}

	
}
